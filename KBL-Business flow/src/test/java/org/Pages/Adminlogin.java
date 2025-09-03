package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminlogin extends Ultilityclass {
	
	public Adminlogin() {
		PageFactory.initElements(driver, this);
	}
    
     @FindBy(xpath="(//input[@class='admin__control-text'])[1]")
     private WebElement adminUsername;

     

     @FindBy(xpath="(//input[@class='admin__control-text'])[2]")
     private WebElement Adminpassword;

    

     @FindBy(xpath="//div[@class='actions']")
     private WebElement SignInButton;


     @FindBy(xpath="//div[@class='actions']")
     private WebElement ConfirmButton;


     public WebElement getConfirmButton() {
          return ConfirmButton;
     }


     public WebElement getAdminUsername() {
          return adminUsername;
     }


     public WebElement getAdminpassword() {
          return Adminpassword;
     }


     public WebElement getSignInButton() {
          return SignInButton;
     }


     
     

}
