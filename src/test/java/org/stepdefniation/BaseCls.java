package org.stepdefniation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseCls {
	static WebDriver driver;
	public static WebDriver launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poorna\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
		
	}
	public static void type(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void  clickbtn(WebElement element) {
		element.click();
	}
	public static void Closebro(WebDriver driver) {
		driver.quit();
	}
	
	
}
