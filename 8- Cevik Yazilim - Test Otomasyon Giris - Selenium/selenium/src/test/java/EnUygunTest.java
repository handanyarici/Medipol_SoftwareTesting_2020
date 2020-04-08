import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by TCHYARICI on 04/01/2020
 */
public class EnUygunTest {

	@Test
	public void loginTest(){
		System.setProperty("webdriver.chrome.driver","D:\\medipol\\test otomasyon\\selenium\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.enuygun.com/";
		driver.get(baseUrl);
		WebDriverWait webDriverWait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();

		WebElement loginElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Header\"]/nav[1]/div/div[8]/a[1]"))));
		loginElement.click();

		WebElement username = driver.findElement(By.name("_email"));
		username.sendKeys("test@gmail.com");

		WebElement password = driver.findElement(By.xpath("/html/body/div[18]/div[2]/div/div/div/form/div[2]/div/div/input"));
		password.sendKeys("123456");

		WebElement loginClick = webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[18]/div[2]/div/div/div/form/div[3]/button/span[1]"))));
		loginClick.click();
	}
}
