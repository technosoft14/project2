package org.stepdefniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdef extends BaseCls{
	static WebDriver driver;
	@Given("the user in addtriff")
	public void the_user_in_addtriff() {
		WebDriver driver = launchBrowser("http://demo.guru99.com/telecom/addtariffplans.php");
		
	}

	@When("the user enter validation {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_enter_validation(String a, String b, String c, String d, String e, String f, String g) {
		Pom p = new Pom();
		type(p.getTxtUser(), a);
		type(p.getTxtuser2(), b);
		type(p.getTxtuser3(), c);
		type(p.getTxtuset4(), d);
		type(p.getTxtuset5(), e);
		type(p.getTxtuset6(), f);
		type(p.getTxtuset7(), g);
		
	}


	@When("the user click submit")
	public void the_user_click_submit() {
		Pom pm = new Pom();
		clickbtn(pm.getBtnuser());
	}

	@Then("see success message")
	public void see_success_message() {
		 Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	}

	

}
