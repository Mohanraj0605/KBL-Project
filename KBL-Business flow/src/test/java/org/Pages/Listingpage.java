package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listingpage extends Ultilityclass {
	

	public Listingpage() {
		PageFactory.initElements(driver, this);
	}

  
    @FindBy(xpath="//a[text()='comparison list']")
    private WebElement comparisonLink;

    public WebElement getComparisonLink() {
        return comparisonLink;
    }
    
    
    @FindBy(xpath="(//span[@class='comp'])[2]")
    private WebElement ListingCompare2; 

    @FindBy(xpath="(//span[@class='comp'])[1]")
    private WebElement ListingCompare1; 



    public WebElement getListingCompare2() {
        return ListingCompare2;
    }


    public WebElement getListingCompare1() {
        return ListingCompare1;
    }




    @FindBy(xpath="(//div[@class='product-item-info'])[1]")
    private WebElement ListingCategeory1; 

    @FindBy(xpath="(//div[@class='product-item-info'])[2]")
    private WebElement ListingCategeory2; 

    @FindBy(xpath="(//span[text()='Buy Now'])[2]")
    private WebElement BuyNowButton2;


    @FindBy(xpath="(//span[text()='Buy Now'])[1]")
    private WebElement BuyNowButton1;
    
    public WebElement getBuyNowButton1() {
        return BuyNowButton1;
    }
    public WebElement getListingCategeory1() {
        return ListingCategeory1;
    }

    public WebElement getListingCategeory2() {
        return ListingCategeory2;
    }

    public WebElement getBuyNowButton2() {
        return BuyNowButton2;
    }



}