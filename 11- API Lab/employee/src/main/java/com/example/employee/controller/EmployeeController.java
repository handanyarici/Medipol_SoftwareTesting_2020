package com.example.employee.controller;

import com.example.employee.model.EmployeeRequest;
import com.example.employee.model.EmployeeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TCHYARICI on 04/29/2020
 */
@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

	@GetMapping(path = "/")
	public String testGet(String name, String surname) {
		return name + " " + surname;
	}

	@PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
	public EmployeeResponse saveEmployee(@RequestBody EmployeeRequest employee) {
		EmployeeResponse response = new EmployeeResponse();
		if ("33".equals(employee.getName())) {
			response.setStatu("failed");
		} else {
			response.setStatu("success");
		}
		return response;
	}
}
