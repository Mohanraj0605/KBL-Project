package org.pom;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KBLPom extends Ultilityclass{
	
	
	public KBLPom() {
		PageFactory.initElements(driver, this);
	}

	 
   @FindBy(xpath="//input[@id='search']")
   private WebElement searchbox; 
   
   @FindBy(xpath="//a[@onclick='myFunction()']")
   private WebElement searchboxclick; 
 
   @FindBy(xpath="(//mark[text()='Tablets'])[1]")
   private WebElement Productname;

   public WebElement getSearchbox() {
	return searchbox;
   }

   public WebElement getSearchboxclick() {
	return searchboxclick;
   }

   public WebElement getProductname() {
	return Productname;
   }


   

  
}