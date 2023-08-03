package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_page {

WebDriver driver;
	
	public PIM_page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addemployeebtn;
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement employeelist;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="middleName")
	private WebElement middlename;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empid;
	
	@FindBy(css="[type='submit']")
	private WebElement savebtn;
	
	@FindBy(xpath="//div[starts-with(@class,'oxd-table-row oxd-table-row--with-border oxd-table-row--')]")
	private List<WebElement> createdemplist;
	
	
	public void clickonaddemployee() {
		addemployeebtn.click();
	}
	
	public void enterfirstname(String first) {
		firstname.sendKeys(first);
	}
	
	public void entermiddlename(String middle) {
		middlename.sendKeys(middle);
	}
	
	public void enterlastname(String last) {
		lastname.sendKeys(last);
	}
	
	public String getemployeeid() {
		return empid.getText();
	}
	
	public void clickonsavebtn() {
		savebtn.click();
	}
	
	public void clickonemplist() {
		employeelist.click();
	}
	
    public void verifyCreatedemployee(String id) {
    	for(WebElement ele:createdemplist) {
    		String text= ele.getText();
    		if(text.contains(id)) {
    			System.out.println(text);
    			break;
    		}
    		
    	}
    }
	
}
