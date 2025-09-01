package org.Pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  PDPpage extends Ultilityclass {
	

	public PDPpage() {
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="//div[@class='qty-plus']")
    private WebElement QtybuttoMaxPDP;
   
   @FindBy(xpath="//div[@class='qty-minus']")
    private WebElement QtybuttoMinPDP;

    public WebElement getQtybuttoMaxPDP() {
        return QtybuttoMaxPDP;
    }

    public WebElement getQtybuttoMinPDP() {
        return QtybuttoMinPDP;
    }


    @FindBy(xpath="//input[@type='button']")
    private WebElement PincodecheckButton;

    public WebElement getPincodecheckButton() {
        return PincodecheckButton;
    }

     @FindBy(xpath="//input[@name='pincode']")
    private WebElement Pincodefield;

   public WebElement getPincodefield() {
       return Pincodefield;
   }

   @FindBy(xpath="//label[@class='installation-service-label']")
    private WebElement InstallationServicelabel;

   public WebElement getInstallationServicelabel() {
       return InstallationServicelabel;
   }

   @FindBy(xpath=" (//span[@class='special-price'])[1]")
    private WebElement PLPprice;

   public WebElement getPLPprice() {
       return PLPprice;
   }

   @FindBy(xpath="(//span[text()='₹10,380.00'])[1]")
    private WebElement PDPprice;

   public WebElement getPDPprice() {
       return PDPprice;
   }

    @FindBy(id="buy-now")
    private WebElement BuynowPDP;

   public WebElement getBuynowPDP() {
       return BuynowPDP;
   }
     @FindBy(xpath="//button[@title='Add to Cart']")
    private WebElement AddToCartButtonPDP;

   public WebElement getAddToCartButtonPDP() {
       return AddToCartButtonPDP;
   }

 @FindBy(xpath="//span[@class='amquote-addto-button-text']")
    private WebElement AddToQuoteButtonPDP;

   public WebElement getAddToQuoteButtonPDP() {
       return AddToQuoteButtonPDP;
   }

   @FindBy(xpath="//i[@class='wishicon']")
    private WebElement AddToWishListButtonPDP;

   public WebElement getAddToWishListButtonPDP() {
       return AddToWishListButtonPDP;
   }

   @FindBy(xpath="//i[@class='compareicon']")
    private WebElement AddToCompareListButtonPDP;

   public WebElement getAddToCompareListButtonPDP() {
       return AddToCompareListButtonPDP;
   }

   @FindBy(xpath="//button[@id='faq-section']")
   private WebElement FAQSectionButtonPDP;

   public WebElement getFAQSectionButtonPDP() {
       return FAQSectionButtonPDP;
   }

   @FindBy(xpath="(//div[@class='service_img'])[2]")
   private WebElement ServiceImagePDP;

   public WebElement getServiceImagePDP() {
       return ServiceImagePDP;
   }

   @FindBy(xpath="(//div[@class='service_text'])[2]")
   private WebElement ServiceTextPDP;

   public WebElement getServiceTextPDP() {
       return ServiceTextPDP;
   }

    @FindBy(xpath="(//a[@class='product-item-link'])[1]")
   private WebElement PLPname;

    public WebElement getPLPname() {
         return PLPname;
    }

     @FindBy(xpath="//span[@class='base']")
   private WebElement PDPname;

    public WebElement getPDPname() {
         return PDPname;
   }

   @FindBy(xpath="//button[@id='footer-cart-btn-checkout']")
   private WebElement PDPcheckoutButton;

   public WebElement getPDPcheckoutButton() {
         return PDPcheckoutButton;
   }

}