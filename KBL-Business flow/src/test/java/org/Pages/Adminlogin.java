package org.Pages;

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

     public WebElement adminUsername() {
          return adminUsername;
     }

     @FindBy(xpath="(//input[@class='admin__control-text'])[2]")
     private WebElement Adminpassword;

     public WebElement getCartname() {
          return Adminpassword;
     }


     @FindBy(xpath="//div[@class='actions']")
     private WebElement SignInButton;

     public WebElement SignInButton() {
          return SignInButton;
     }

}
