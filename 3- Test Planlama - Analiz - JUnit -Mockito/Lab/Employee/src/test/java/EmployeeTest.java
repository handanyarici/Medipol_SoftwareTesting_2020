import controller.EmployeeController;
import model.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import service.EmployeeService;

/**
 * Created by TCHYARICI on 03/25/2020
 */
public class EmployeeTest {

	@Test
	public void getProjectedEmployeeCount(){
		EmployeeController employeeController = new EmployeeController(new EmployeeService());
		Assert.assertEquals(10,employeeController.getProjectedEmployeeCount());
	}

	@Test
	public void getProjectedEmployeeCountMock(){
		Employee employee = new Employee();
		employee.setfName("handan");
		EmployeeService mock = PowerMockito.mock(EmployeeService.class);
		PowerMockito.when(mock.getEmployeeCount()).thenReturn(employee);
		EmployeeController employeeController = new EmployeeController(mock);
		Assert.assertEquals("handan",employeeController.getProjectedEmployeeCount());

	}
}
