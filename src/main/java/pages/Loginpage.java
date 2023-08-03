package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	WebDriver driver;
	
	public Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public void enterusername(String user) {
		username.sendKeys(user);
	}
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickonlogin() {
		loginbtn.click();
	}
	
	
}
