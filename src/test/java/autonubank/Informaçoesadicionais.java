package autonubank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Informaçoesadicionais extends automacaonubank {

	@Before
	public void setUp() throws Exception {
		driver.findElement(By.name("name")).sendKeys("Josi dos Testes");
		
		
	}
	
	
	
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
