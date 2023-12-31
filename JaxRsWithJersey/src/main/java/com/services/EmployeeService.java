package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.services.entity.Employee;

@Path("/employeeService")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeService {

	@GET
	public Employee getEmployee() {
		return new Employee();
	}

}
