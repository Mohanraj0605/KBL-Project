package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminlogin extends Ultilityclass {
	
	public Adminlogin() {
		PageFactory.initElements(driver, this);
	}



     @FindBy(xpath="(//table[@class='admin__table-secondary']//tr//td)[3]")
     private WebElement Warhouseallcationcode;


      @FindBy(xpath=" //a[@title='Allocated Warehouse Info']")
     private WebElement Warhouseallcation;

      @FindBy(xpath="//input[@class='admin__control-text data-grid-search-control'])[1]")
     private WebElement Adminsearch;

      @FindBy(xpath="(//tr//td)[10]")
     private WebElement Paidstatus;
  

     public WebElement getWarhouseallcation() {
          return Warhouseallcation;
     }


      public WebElement getAdminsearch() {
           return Adminsearch;
      }


      public WebElement getPaidstatus() {
           return Paidstatus;
      }





     @FindBy(xpath="(//span[text()='Orders'])[1]")
     private WebElement SalesOrder;
  
     public WebElement getSalesOrder() {
          return SalesOrder;
     }

     @FindBy(xpath=" //a[@class='_active']")
     private WebElement Sales;


     public WebElement getSales() {
          return Sales;
     }





     @FindBy(xpath="(//input[@class='admin__control-text'])[1]")
     private WebElement adminUsername;

    

     @FindBy(xpath="(//input[@class='admin__control-text'])[2]")
     private WebElement Adminpassword;

    

     @FindBy(xpath="//div[@class='actions']")
     private WebElement SignInButton;

      @FindBy (xpath="//span[normalize-space()='Sign in']")
     private WebElement SignInButton1;



      public WebElement getSignInButton1() {
          return SignInButton1;
     }


      @FindBy(xpath="//span[normalize-space()='Confirm']")
     private WebElement ConfirmButton1;


     

     public WebElement getWarhouseallcationcode() {
          return Warhouseallcationcode;
     }


      public WebElement getConfirmButton1() {
           return ConfirmButton1;
      }



     @FindBy(xpath="//button[@class='action-login action-primary']")
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
