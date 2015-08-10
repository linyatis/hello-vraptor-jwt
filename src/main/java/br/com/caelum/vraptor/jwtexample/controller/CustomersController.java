package br.com.caelum.vraptor.jwtexample.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.jwtexample.dao.CustomerDAO;
import br.com.caelum.vraptor.jwtexample.model.Customer;
import br.com.caelum.vraptor.view.Results;

@Controller
@Path("/customers")
public class CustomersController {

	private Result result;
	private CustomerDAO dao;

	@Inject
	public CustomersController(Result result, CustomerDAO dao) {
		this.result = result;
		this.dao = dao;
	}

	/**
	 * @deprecated CDI's eyes only
	 */
	public CustomersController() {
		this(null, null);
	}

	@Get("")
	public void list() {
		List<Customer> customers = dao.listAll();
		result.use(Results.json()).withoutRoot().from(customers).serialize();
	}
}
