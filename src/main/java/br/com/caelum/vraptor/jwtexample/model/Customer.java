package br.com.caelum.vraptor.jwtexample.model;

public class Customer {

	private Long id;
	private String name;

	public Customer() {
		this(null, null);
	}

	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
