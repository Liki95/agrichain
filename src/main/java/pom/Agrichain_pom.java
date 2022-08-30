package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Agrichain_pom {
	
	@FindBy(xpath="//span[conatins(text()='login']")
	private WebElement Loginlink;
	
	@FindBy(xpath="//span[conatins(text()='register']")
	private WebElement Registerlink;
	
	@FindBy(xpath="//button[name='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//button[name='back_to_home']")
	private WebElement bachhome;
	
	@FindBy(xpath="//div[contains(text()='error')]")
	public WebElement invaliddata;
	
	public Agrichain_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}

	public void log(String lgin) {
		Loginlink.click();
	}
	public void register(String reg) {
		Registerlink.click();
	}
	public void bthome() {
		bachhome.click();
	}
	public void sub() {
		submit.click();
	}
	public void errormsg() {
		Assert.assertTrue(invaliddata.isDisplayed());
		
	}
}

