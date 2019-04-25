package org.stepdefniation;



import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pom extends BaseCls{
	public Pom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "rental1")
	private WebElement txtUser;
	
	@FindBy(id = "local_minutes")
	private WebElement txtuser2;
	
	@FindBy(id = "inter_minutes")
	private WebElement txtuser3;
	
	@FindBy(id="sms_pack")
    private WebElement txtuset4;
	
	@FindBy(id="minutes_charges")
    private WebElement txtuset5;
	
	@FindBy(id="inter_charges")
	private WebElement txtuset6;
	
	
	@FindBy (id="sms_charges")
	private WebElement txtuset7;
	
	@FindBy (name= "submit")
	private WebElement btnuser;
	
	
	
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtuser2() {
		return txtuser2;
	}

	public WebElement getTxtuser3() {
		return txtuser3;
	}

	public WebElement getTxtuset4() {
		return txtuset4;
	}

	public WebElement getTxtuset5() {
		return txtuset5;
	}

	public WebElement getTxtuset6() {
		return txtuset6;
	}

	public WebElement getTxtuset7() {
		return txtuset7;
	}

	public WebElement getBtnuser() {
		return btnuser;
	}

	

	
	


}
