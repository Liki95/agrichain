package textbox;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import gen_lib.Baseclass;
import pom.Agrichain_pom;

public class Text_box_Test extends Baseclass {
	
	/*Passing passitive data in test box & 
	 * validating result with the required value*/
	
	
	@Test
	public void textbenabledTest() {
		Agrichain_pom a=new Agrichain_pom(driver);
		driver.findElement(By.xpath("xpath=\"//input[type='text']")).sendKeys("12346123");
		a.sub();
		a.errormsg();
	}
	
	
	
	/*Check the Back to home 
	 * button returning to home page*/
	
	@Test(dependsOnMethods="textbenabledTest")
	public void homebackbttnTest() {
		Agrichain_pom a=new Agrichain_pom(driver);
		driver.findElement(By.xpath("xpath=\"//input[type='text']")).sendKeys("12346123");
		a.sub();
		
		a.bthome();
		assertFalse(a.submit.isDisplayed());
	}
}
