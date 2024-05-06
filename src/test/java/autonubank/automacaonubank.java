package autonubank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class automacaonubank {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "Driver");
		driver = new ChromeDriver();
		driver.get("https://nubank.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.name("cpf")).sendKeys("74537242019");
	
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
        driver.findElement(By.id("test")).click();
        driver.findElement(By.name("name")).sendKeys("Josi dos Testes");
        driver.findElement(By.name("phone")).sendKeys("77999234678");
        driver.findElement(By.name("email")).sendKeys("josidostestes@gmail.com");
        driver.findElement(By.name("emailConfirmation")).sendKeys("josidostestes@gmail.com");
        
       
        
      
	}

}


