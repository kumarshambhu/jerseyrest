package com.sam.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sam.model.Customer;

@Path("/customer")
public class CustomerRest {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("id") int id) {

		Customer customer = new Customer();
		customer.setAddress("Bangalore");
		customer.setFirstName("Shambhu Kumar");
		customer.setId(id);
		customer.setLastName("Kumar");
		customer.setPincode("562125");
		return customer;

	}

}