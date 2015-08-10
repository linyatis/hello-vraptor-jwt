package br.com.caelum.vraptor.jwtexample.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.jwtexample.model.Customer;

public class DefaultCustomerDAO implements CustomerDAO {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> listAll() {
		return generateCustomers();
	}

	@Override
	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Customer> generateCustomers() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer c1 = new Customer(1L, "John");
		Customer c2 = new Customer(1L, "Marie");
		Customer c3 = new Customer(1L, "Fred");

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);

		return customers;
	}

}
