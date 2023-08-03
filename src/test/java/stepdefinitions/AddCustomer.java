package stepdefinitions;

import org.openqa.selenium.WebDriver;

import Utils.ElementUtils;
import factory.driverfactory;
import io.cucumber.java.en.*;
import pages.Dashboard;
import pages.Loginpage;
import pages.PIM_page;

public class AddCustomer {

	String id ;
	WebDriver driver = driverfactory.getDriver();
	Loginpage lp= new Loginpage(driver);
	Dashboard d=new Dashboard(driver);
	PIM_page p=new PIM_page(driver);
	ElementUtils eu= new ElementUtils(driver);
	
	@When("User enters valid Username {string}")
	public void user_enters_valid_username(String user) {
	   lp.enterusername(user);
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String pass) {
	   lp.enterpassword(pass);
	}

	@Then("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    lp.clickonlogin();
	}

	@When("User clicks on PIM button")
	public void user_clicks_on_pim_button() {
	   d.clickonPIMbtn();
	}

	@Then("click on add Employee option")
	public void click_on_add_employee_option() {
	    p.clickonaddemployee();
	}

	@Then("^User enters (.+) in firstname text field$")
	public void user_enters_firstname_in_firstname_text_field(String first) {
	   p.enterfirstname(first);
	}

	@Then("^User enter (.+) in middlename text field$")
	public void user_enter_middlename_in_middlename_text_field(String middle) {
	   p.entermiddlename(middle);
	}

	@Then("^User enters (.+) in lastname text field$")
	public void user_enters_lastname_in_lastname_text_field(String last) {
	   p.enterlastname(last);
	}

	@Then("User enters employeeid in id field")
	public void user_enters_employeeid_in_id_field() {
	   id = p.getemployeeid();
	}

	@Then("User clicks on save button")
	public void user_clicks_on_save_button() {
	    p.clickonsavebtn();
	}

	@Then("verify if user is created successfully")
	public void verify_if_user_is_created_successfully() {
	   //click on employee list
		p.clickonemplist();
		
		//scroll to list
		eu.scrollby500();
		//verify id
		p.verifyCreatedemployee(id);
	}

}
