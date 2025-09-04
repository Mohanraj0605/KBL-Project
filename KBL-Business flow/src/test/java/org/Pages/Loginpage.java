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


  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[1]")
  private WebElement MyAccountDashboard;

 public WebElement getMyAccountDashboard() {
    return MyAccountDashboard;
  }


 @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[2]")
  private WebElement Myaddressbook;

  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[3]")
  private WebElement Myinformation;



 public WebElement getMyaddressbook() {
    return Myaddressbook;
  }


  public WebElement getMyinformation() {
    return Myinformation;
  }


  public WebElement getMyOrders() {
    return MyOrders;
  }


 @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[4]")
  private WebElement MyOrders;

 @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[5]")
  private WebElement MyService;

  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[6]")
  private WebElement AMC;

  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[8]")
  private WebElement Newsletters;


  
  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[10]")
  private WebElement MyReviews;

  
  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[11]")
  private WebElement Mywislistpage;

   @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[12]")
  private WebElement MyQuates;

  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[13]")
  private WebElement MyReplacement;

  @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[14]")
  private WebElement Myproducts;

 public WebElement getAMC() {
    return AMC;
  }


  public WebElement getNewsletters() {
    return Newsletters;
  }


  public WebElement getMyReviews() {
    return MyReviews;
  }


  public WebElement getMywislistpage() {
    return Mywislistpage;
  }


  public WebElement getMyQuates() {
    return MyQuates;
  }


  public WebElement getMyReplacement() {
    return MyReplacement;
  }


  public WebElement getMyproducts() {
    return Myproducts;
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