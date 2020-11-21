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

	public String getProjectedEmployeeCount()
	{
		final Employee actualEmployeeCount = employeeService.getEmployeeCount();
		return actualEmployeeCount.getfName();
	}

	public void saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
	}
}
