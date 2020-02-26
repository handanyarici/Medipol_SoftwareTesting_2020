package controller;

import model.Employee;
import service.EmployeeService;

/**
 * Created by TCHYARICI on 02/23/2020
 */
public class EmployeeController
{
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public int getProjectedEmployeeCount()
	{
		final int actualEmployeeCount = employeeService.getEmployeeCount();
		return actualEmployeeCount * 2;
	}

	public void saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
	}
}
