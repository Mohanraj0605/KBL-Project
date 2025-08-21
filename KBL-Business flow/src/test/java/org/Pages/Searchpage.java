package org.Pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage extends Ultilityclass {
	

	public Searchpage() {
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="//input[@name='q']")
    private WebElement SearchBox;

	public WebElement getSearchBox() {
		return SearchBox;
	}

    @FindBy(xpath="(//div[@class='qs-option-title'])[1]")
    private WebElement ProductnameSLP;

    public WebElement getProductnameSLP() {
        return ProductnameSLP;
    }

    @FindBy(xpath="//a[@class='see-all']")
    private WebElement Seeall;

    public WebElement getSeeall() {
        return Seeall;
    }
    

    @FindBy(xpath="(//a[text()='Residential'])[1]")
    private WebElement ResidentialFilterSLP;


    public WebElement getResidentialFilterSLP() {
        return ResidentialFilterSLP;
    }

     @FindBy(xpath="(//button[@class='action-close'])[1]")
     private WebElement Popupclose;



    public WebElement getPopupclose() {
        return Popupclose;
    }

    @FindBy(xpath="//label[text()='Surface']")
    private WebElement SurfaceFilterSLP;

    public WebElement getSurfaceFilterSLP() {
        return SurfaceFilterSLP;
    }

     @FindBy(xpath="//span[text()='Clear All']")
    private WebElement Clearall;

    public WebElement getClearall() {
        return Clearall;
    }

}
