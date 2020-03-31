import controller.EmployeeController;
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
		EmployeeService mock = PowerMockito.mock(EmployeeService.class);
		PowerMockito.when(mock.getEmployeeCount()).thenReturn(5);
		EmployeeController employeeController = new EmployeeController(mock);
		Assert.assertEquals(10,employeeController.getProjectedEmployeeCount());

	}
}
