package com.sam.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sam.model.Employee;

@Path("/employee")
public class EmployeeRest {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id") int id) {
		Employee customer = new Employee();
		customer.setAddress("Bangalore");
		customer.setFirstName("Shambhu Kumar");
		customer.setId(id);
		customer.setLastName("Kumar");
		customer.setPincode("562125");
		return customer;
	}

}