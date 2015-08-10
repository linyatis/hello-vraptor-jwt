package br.com.caelum.vraptor.jwtexample.dao;

import java.util.List;

import br.com.caelum.vraptor.jwtexample.model.Customer;

public interface CustomerDAO {

	void add(Customer customer);

	void update(Customer customer);

	void delete(Long id);

	List<Customer> listAll();

	Customer getById(Long id);

}
