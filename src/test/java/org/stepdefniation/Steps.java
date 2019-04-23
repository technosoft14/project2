package org.stepdefniation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Steps {
	static WebDriver driver;
	
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poorna\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}
	
	

	/*@When("The user fill in the valid customer details")
	public void the_user_fill_in_the_valid_customer_details() {
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("chandru");
	    driver.findElement(By.id("lname")).sendKeys("Selenium");
	    driver.findElement(By.id("email")).sendKeys("g.purna89@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("chennai");
	    driver.findElement(By.name("telephoneno")).sendKeys("9500470563");
	}*/
	
	
	@When("The user fill in the valid customer details")
	public void the_user_fill_in_the_valid_customer_details(DataTable customer) {
	    List<String> customerlist = customer.asList(String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(customerlist.get(0));
	    driver.findElement(By.id("lname")).sendKeys(customerlist.get(1));
	    driver.findElement(By.id("email")).sendKeys(customerlist.get(2));
	    driver.findElement(By.name("addr")).sendKeys(customerlist.get(3));
	    driver.findElement(By.name("telephoneno")).sendKeys(customerlist.get(4));;
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the customer ID generated")
	public void the_user_should_see_the_customer_ID_generated() {
	    Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	    
	}
	
}
