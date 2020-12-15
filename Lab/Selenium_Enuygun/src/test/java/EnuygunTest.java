import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnuygunTest {

	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://www.enuygun.com/";


	@Test
	public void testTitle(){
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.enuygun.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String expectedTitle="Türkiye'nin Seyahat Sitesi - Uçak Bileti, Otobüs, Otel";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}

	@Test
	public void testPNRSorgulama(){
		String url = baseUrl + "ucak-bileti/pnr-sorgulama/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement pnrNo = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/form/div/div[1]/div/input"));
		pnrNo.sendKeys("XYZEDF");

		WebElement surname = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/form/div/div[2]/div/input"));
		surname.sendKeys("YARICI");

		WebElement sorgula = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/form/div/div[3]/div/button"));
		sorgula.click();

		String expectedMessage="PNR numarası bulunamadı";
		WebElement result = driver.findElement(By.xpath("/html/body/div[6]/div"));
		Assert.assertEquals("document",result.getAttribute("role"));
	}

}
