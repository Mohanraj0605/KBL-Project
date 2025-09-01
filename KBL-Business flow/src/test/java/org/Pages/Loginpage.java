package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Ultilityclass {
	

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}


  @FindBy(id="loginWithPassword")
 private WebElement PasswordLogin;


  @FindBy(xpath="//li[@class='nav item accountdashboard']")
  private WebElement MyAccountDashboard;

 public WebElement getMyAccountDashboard() {
    return MyAccountDashboard;
  }


 @FindBy(xpath="(//div[@class='box-content'])[1]")
  private WebElement Myaccountcontent;

 @FindBy(xpath="//li[@class='nav item addressbook']")
  private WebElement AddressBook;

 @FindBy(xpath="//li[@class='nav item myorder']")
  private WebElement MyOrder;

 @FindBy(xpath="//li[@class='nav item myservice']")
  private WebElement MyService;



  public WebElement getMyaccountcontent() {
  return Myaccountcontent;
}


 public WebElement getAddressBook() {
  return AddressBook;
 }


 public WebElement getMyOrder() {
  return MyOrder;
 }


 public WebElement getMyService() {
  return MyService;
 }

  @FindBy(xpath="//input[@name='login[username]']")
  private WebElement EmailField;

  @FindBy(xpath="//input[@name='login[password]']")
 private WebElement PasswordField;

 
  @FindBy(xpath="//button[@name='send']")
 private WebElement LoginButton;


  public WebElement getPasswordLogin() {
    return PasswordLogin;
  }


  @FindBy(xpath="//a[@class='forgotlinking']")
  private WebElement forgotlinking;

  @FindBy(xpath="(//input[@class='input-text'])[2]")
  private WebElement passwordForgotField;

  @FindBy(xpath="//button[@class='action submit primary']")
  private WebElement submit;


  

  public WebElement getForgotlinking() {
    return forgotlinking;
  }


  public WebElement getPasswordForgotField() {
    return passwordForgotField;
  }


  public WebElement getSubmit() {
    return submit;
  }


  public WebElement getEmailField() {
    return EmailField;
  }


  public WebElement getPasswordField() {
    return PasswordField;
  }


  public WebElement getLoginButton() {
    return LoginButton;
  }




}