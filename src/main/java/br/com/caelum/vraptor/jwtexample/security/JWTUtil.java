package br.com.caelum.vraptor.jwtexample.security;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;

public class JWTUtil {

	private static final String SECRET = "my secret";

	public static String createToken(Long userId) {
		JWTSigner signer = new JWTSigner(SECRET);

		HashMap<String, Object> claims = new HashMap<String, Object>();

		claims.put("user", userId);

		String token = signer.sign(claims, new JWTSigner.Options()
				.setExpirySeconds(60*60*24*365*30).setIssuedAt(true));

		return token;

	}

	public static Map<String, Object> decode(String token)
			throws InvalidKeyException, NoSuchAlgorithmException,
			IllegalStateException, SignatureException, IOException,
			JWTVerifyException {
		JWTVerifier verifier = new JWTVerifier(SECRET);

		Map<String, Object> map = verifier.verify(token);

		return map;
	}

}