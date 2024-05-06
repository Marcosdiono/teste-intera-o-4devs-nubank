package abassimuntneas;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class nubankE4devs {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.4devs.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wrapper-content\"]/div[1]/div[1]/a/div[2]/span")).click();
		driver.findElement(By.id("bt_gerar_cpf")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"texto_cpf\"]/span")).click();

		String devsHandle = driver.getWindowHandle();
		Thread.sleep(1000);

		((JavascriptExecutor) driver).executeScript("window.open('https://www.nubank.com.br/');");

		Set<String> handles = driver.getWindowHandles();

		String[] handlesArray = handles.toArray(new String[0]);

		driver.switchTo().window(handlesArray[1]);

		driver.findElement(By.name("cpf")).sendKeys(Keys.CONTROL + "v");
		driver.findElement(By.id("test")).click();
		driver.findElement(By.name("name")).sendKeys("Jose dos Testes");
		driver.findElement(By.name("phone")).sendKeys("77999674523");
		driver.findElement(By.name("email")).sendKeys("josedostestes@gmail.com.br");
		driver.findElement(By.name("emailConfirmation")).sendKeys("josedostestes@gmail.com.br");
		driver.findElement(By.xpath("//*[@id=\"label-acceptedWhatsapp\"]/span[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"label-accepted\"]/span[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"complete-form-drawer\"]/div/div/div[2]/form/div/div[2]/div/button"))
				.click();

	}

}
