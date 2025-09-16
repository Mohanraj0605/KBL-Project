package org.steps;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.Adminlogin;
import org.pages.Cartpage;
import org.pages.Homepage;
import org.pages.Listingpage;
import org.pages.Loginpage;
import org.pages.PDPpage;
import org.pages.Searchpage;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class KBLSteps extends Ultilityclass {

         
	
	public static Homepage h ;
	public static Loginpage l ;
	public static Searchpage s ;
	public static Listingpage lp ;
	public static JavascriptExecutor js;
	private static final Logger LOGGER = LogManager.getLogger(KBLSteps.class);
	public static PDPpage p ;
	public static Cartpage c ;
	public static Adminlogin a ;

	String SuccessorderNo1;


@Given("User open the Home page")
public void user_open_the_Home_page() {

     StartTimeprint();
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
     implicitWait();
	 LOGGER.info("Home page title is verified");
	 EndTimeprint();
	
}

@When("When user opening the home page > To verify the header section all the  Elements")
public void when_user_opening_the_home_page_to_verify_the_header_section_all_the_elements() {

	 StartTimeprint();
	 h = new Homepage();
     Threadsleep(2000);
	 checkpresentElement("To check KBL logo is displayed",h.getKBLLogo().isDisplayed());
	 javascriptclick(h.getKBLLogo());
	 LOGGER.info("KBL logo is displayed");
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(2000);
	 javascriptclick(h.getLogin());
	 LOGGER.info("Login icon is clicked");
	 Threadsleep(2000);
	 moveToElement(h.getSearchBox());
	 checkpresentElement("To check Search box is displayed",h.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 Threadsleep(3000);
	 moveToElement(h.getWishlistLink());
	 checkpresentElement("To check Wishlist link is displayed",h.getWishlistLink().isDisplayed());
	 LOGGER.info("Wishlist link is displayed");
     Threadsleep(2000);
	 moveToElement(h.getCartIcon());
	 Threadsleep(3000);
	 checkpresentElement("To check Cart icon is displayed",h.getCartIcon().isDisplayed());
	 javascriptclick(h.getCartIcon());
	 LOGGER.info("Cart icon is clicked");
	 Threadsleep(4000);
     moveToElement(h.getRequestQuote());
	 checkpresentElement("To check Request Quote is displayed",h.getRequestQuote().isDisplayed());
     Threadsleep(3000);
	 moveToElement(h.getTrackinglink());
	 checkpresentElement("To check Tracking link is displayed",h.getTrackinglink().isDisplayed());
	 Threadsleep(5000);
	 javascriptclick(h.getKBLLogo());
	 Threadsleep(3000);

	 ClickElement(h.getHomepageSliderNext());
	 Threadsleep(2000);
	 ClickElement(h.getHomepageSliderNext());
	 checkpresentElement("To check Homepage banner and slider next is displayed",h.getHomepageSliderNext().isDisplayed());
	 Threadsleep(2000);
	 LOGGER.info("Homepage banner and slider next is displayed");
	 Threadsleep(4000);
     EndTimeprint();
	  
}
   
@When("User verify the home page  sections is displayed or not")
public void user_verify_the_home_page_sections_is_displayed_or_not() throws AWTException {
    
	 StartTimeprint();
     h = new Homepage();
	 Threadsleep(3000);
	 javascriptclick(h.getKBLLogo());
	 Threadsleep(4000);

	for (int i = 0; i <20; i++) {
		KeyDOWN();
	}

	 checkpresentElement("To check Residential section is displayed",h.getResidentialsection().isDisplayed());
	 LOGGER.info("Residential section is displayed");
	 checkpresentElement("To check Commercial section is displayed",h.getCommercialsection().isDisplayed());
	 LOGGER.info("Commercial section is displayed");
	 checkpresentElement("To check Industrial section is displayed",h.getIndustrialsection().isDisplayed());
	 LOGGER.info("Industrial section is displayed");
	 checkpresentElement("To check Agriculture section is displayed",h.getAgriculturesection().isDisplayed());
	 LOGGER.info("Agriculture section is displayed");
	 checkpresentElement("To check Testimonial section is displayed",h.getTestimonialsection().isDisplayed());
	 LOGGER.info("Testimonial section is displayed");
	 LOGGER.info("Home page sections all are displayed and verified ");
     Threadsleep(2000);
      EndTimeprint();
	
}


@When("To verify the Categeory L1 > L2  sub-categeory  navigation page")
public void to_verify_the_categeory_l1_l2_sub_categeory_navigation_page() throws InterruptedException {

    // StartTimeprint();
	// h = new Homepage();
	// javascriptclick(h.getKBLLogo());
	// Threadsleep(3000);
    // moveToElement(h.getCategeory1());
	// moveToElement(h.getCategeory2());
	// moveToElement(h.getCategeory3());
	// Threadsleep(3000);
	// checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	// actionClick(h.getCategeory3());
	// LOGGER.info("Main category to Sub Category is displayed");
    // Threadsleep(3000);
	// EndTimeprint();


// 	List<WebElement> Categeorylinks1 = driver.findElements(By.xpath("//header//div//ul[@class='groupmenu']//a"));
	
//     //  h = new Homepage();
// 	//  h.getGroupMenuLinks();

// 	for (int i = 0; i < Categeorylinks1.size() ; i++) {

//      if (i < 300) {

// 		List<WebElement> Categeorylinks2 = driver.findElements(By.xpath("//header//div//ul[@class='groupmenu']//a"));
// 		// List<WebElement> Categeorylink2 = h.getGroupMenuLinks();
// 		//moveToElement2(Categeorylinks2);
// 		WebElement Categeoryoptions3 = Categeorylinks1.get(i);
// 		Thread.sleep(2000);

//  	actions = new Actions(driver);
        	
// 	actions.moveToElement(Categeoryoptions3).perform();

//        // moveToElement(Categeoryoptions3);
// 		Thread.sleep(2000);
//         actionClick(Categeoryoptions3);
// 		Thread.sleep(3000);
// 		 h = new Homepage();
//          Threadsleep(2000);
// 	    javascriptclick(h.getKBLLogo());
//         // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//         // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header//div//ul[@class='groupmenu']//a")));
//         Thread.sleep(2000);
//     } 
// }

// driver.quit();
	

}
    
@Then ("Observe the  Footer section links redirections")
public void observe_the_footer_section_links_redirections() throws AWTException {

	 h = new Homepage();
     Threadsleep(1000);
	for (int i = 0; i <90; i++) {
		KeyDOWN();
	}
    Threadsleep(2000);
	 List<WebElement> Footerlinks1 = driver.findElements(By.xpath("//footer//a"));
	 for (int i = 0; i < Footerlinks1.size(); i++) {
    // Apply index range position
    if (i > 3 && i < 31) {
		List<WebElement> Footerlinks3 = driver.findElements(By.xpath("//footer//a"));
        WebElement link4 = Footerlinks3.get(i);
        String linkText = link4.getText().trim();
        System.out.println("Footer Links" + i + ": " + linkText);
        javascriptclick(link4);
        Threadsleep(1000);
}
	 }

	 driver.quit();

	}

	
// Login functionality with password field
@When("Go the login page and select the login with password page")
public void go_the_login_page_and_select_the_login_with_password_page() {
	
	StartTimeprint();
     h = new Homepage();
     moveToElement(h.getLoginIcon());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(2000);
	 javascriptclick(h.getLogin());
	 LOGGER.info("Login icon is clicked");
	 Threadsleep(2000);

}
@When("Enter the Email and passwors in repective field")
public void enter_the_email_and_passwors_in_repective_field() {

	l = new Loginpage();
	Threadsleep(3000);
	moveToElement(l.getPasswordLogin());
	checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	actionClick(l.getPasswordLogin());
	LOGGER.info("Password login is clicked");
	Threadsleep(3000);
	l = new Loginpage();

	PassValues(l.getEmailField(), getdataExcel(1, 1));
	checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	LOGGER.info("Email field is displayed");
	PassValues(l.getPasswordField(), getdataExcel(2, 1));
	checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
    Threadsleep(3000);
	ClickElement(l.getLoginButton());

}

@Then("Observe the redirection to the my account page")
public void observe_the_redirection_to_the_my_account_page() {
	 l = new Loginpage();
	 Threadsleep(3000);
	 String title2 = driver.getTitle();
     checkpresentElement("To check user account  page",title2.contains("My Account"));
	 LOGGER.info("Login with password functionality is verified successfully");
	 Threadsleep(3000);
	 EndTimeprint();

	 driver.quit();

//  l = new Loginpage();
//     moveToElement(l.getForgotlinking());
// 	checkpresentElement("To check Forgot password link is displayed",l.getForgotlinking().isDisplayed());
// 	LOGGER.info("Forgot password link is displayed");
// 	ClickElement(l.getForgotlinking());
//    Threadsleep(3000);
//    PassValues(l.getPasswordForgotField(), getdataExcel(3, 1));
//    javascriptclick(l.getSubmit());
// 	  Threadsleep(3000);
}

@When("do  the login  and Observe the my account page options")
public void do_the_login_and_observe_the_my_account_page_options() {

	StartTimeprint();
    h = new Homepage();
     h = new Homepage();
     moveToElement(h.getLoginIcon());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(2000);
	 javascriptclick(h.getLogin());
	 LOGGER.info("Login icon is clicked");
	 Threadsleep(2000);

	l = new Loginpage();
	Threadsleep(3000);
	moveToElement(l.getPasswordLogin());
	checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	actionClick(l.getPasswordLogin());
	LOGGER.info("Password login is clicked");
	Threadsleep(3000);

	// Entering the Email and Password

	l = new Loginpage();
	PassValues(l.getEmailField(), getdataExcel(1, 1));
	checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	LOGGER.info("Email field is displayed");
	PassValues(l.getPasswordField(), getdataExcel(2, 1));
	checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
    Threadsleep(3000);
	ClickElement(l.getLoginButton());
}

@Then("User click  the My account options in dashbord and Observe the redirection  page")
public void user_click_the_my_account_options_in_dashbord_and_observe_the_redirection_page() throws AWTException {
    
     l = new Loginpage();
	 Threadsleep(3000);
	 String title2 = driver.getTitle();
     checkpresentElement("To check user account  page",title2.contains("My Account"));
	 LOGGER.info("Login with password functionality is verified successfully");

	 implicitWait();
	 l = new Loginpage();
	 ClickElement(l.getMyAccountDashboard());
	 checkpresentElement("To check My account dashboard options available or not in My account page",l.getMyAccountDashboard().isDisplayed());
     Threadsleep(3000);
	 ClickElement(l.getMyAccountDashboard());
     LOGGER.info("My account dashboard  is displayed");


	 implicitWait();
	 l = new Loginpage();
	 ClickElement(l.getMyaddressbook());
	 checkpresentElement("To check My address book options available or not in My account page",l.getMyaddressbook().isDisplayed());
     Threadsleep(3000);
	 ClickElement(l.getMyaddressbook());
     LOGGER.info("My address book  options  is displayed");

	 l = new Loginpage();
	 implicitWait();
	 checkpresentElement("To check My Account options available or not in My account page",l.getMyinformation().isDisplayed());
     ClickElement(l.getMyinformation());
	 Threadsleep(3000);
     LOGGER.info("My Account option  is displayed");

	
	 Threadsleep(10000);
	 implicitWait();
	 l = new Loginpage();
	 checkpresentElement("To check My ordrs options available or not in My account page",l.getMyOrders().isDisplayed());
     Threadsleep(3000);
	 ClickElement(l.getMyOrders());
     LOGGER.info("My order is displayed");


	 l = new Loginpage();
	 implicitWait();
	 checkpresentElement("To check My service options available or not in My account page",l.getMyService().isDisplayed());
     ClickElement(l.getMyService());
	 Threadsleep(3000);
     LOGGER.info("My Service option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 
	 l = new Loginpage();
	 Threadsleep(2000);
	 checkpresentElement("To check AMC options available or not in My account page",l.getAMC().isDisplayed());
     ClickElement(l.getAMC());
	 Threadsleep(3000);
     LOGGER.info("AMC option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}


	  l = new Loginpage();
	 Threadsleep(1000);
	 checkpresentElement("To check News-Letter options available or not in My account page",l.getNewsletters().isDisplayed());
     ClickElement(l.getNewsletters());
	 Threadsleep(3000);
     LOGGER.info("News-Letter option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}



	 l = new Loginpage();
	   Threadsleep(1000);
	 checkpresentElement("To check My Product Reviews  options available or not in My account page",l.getMyReviews().isDisplayed());
     ClickElement(l.getMyReviews());
	 Threadsleep(3000);
     LOGGER.info(" My Product Reviews option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 l = new Loginpage();
	 Threadsleep(1000);
	 checkpresentElement("To check My wishlist  options available or not in My account page",l.getMywislistpage().isDisplayed());
     ClickElement(l.getMywislistpage());
	 Threadsleep(3000);
     LOGGER.info("My wishlist option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	  l = new Loginpage();
	  Threadsleep(1000);
	 checkpresentElement("To check My Quotes  options available or not in My account page",l.getMyQuates().isDisplayed());
     ClickElement(l.getMyQuates());
	 Threadsleep(3000);
     LOGGER.info(" My Quotes option  is displayed");

	 for (int i = 0; i <9; i++) {
		KeyDOWN();
	}


	 l = new Loginpage();
	  Threadsleep(1000);
	 checkpresentElement("To check My Replacment  options available or not in My account page",l.getMyReplacement().isDisplayed());
     ClickElement(l.getMyReplacement());
	 Threadsleep(3000);
     LOGGER.info(" My Replacment option  is displayed");

	 for (int i = 0; i <10; i++) {
		KeyDOWN();
	}


	 l = new Loginpage();
	  Threadsleep(1000);
	 checkpresentElement("To check My Products  options available or not in My account page",l.getMyproducts().isDisplayed());
     ClickElement(l.getMyproducts());
	 Threadsleep(1000);
     LOGGER.info(" My Products option  is displayed");

	 LOGGER.info("My account dashboard page all the optons are verified and Navigated to the respective page");

	  driver.quit();

}


// search field functionality 

@Given("User go to the Home page")
public void user_go_to_the_home_page() {
	 
	 StartTimeprint();
     s = new Searchpage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
     implicitWait();
	 LOGGER.info("Home page title is verified");
	 EndTimeprint();

}

@When("User Enter the product name in search box {string}")
public void user_enter_the_product_name_in_search_box(String Keyword1) {

     StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 String Keyword = Keyword1;
	 PassValues(s.getSearchBox(), Keyword);
	 LOGGER.info("Product SKU  is entered in search box");
	 EndTimeprint();
}
@When("Observe the Related products suggestion.then,Click on any product name")
public void observe_the_related_products_suggestion_then_click_on_any_product_name() {
	
     StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 ClickElement(s.getProductnameSLP());
	 String Url3 = driver.getCurrentUrl();
	 System.out.println(Url3);
	 Threadsleep(3000);
	 checkpresentElement("To check user account  page",Url3.contains("vertical"));
	 LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");
	 EndTimeprint();
}

@When("Observe the Seeall navigation  page {string}")
public void observe_the_seeall_navigation_page(String Keyword2) {

	 StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 Threadsleep(2000);
	 PassValues(s.getSearchBox(), Keyword2);
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(4000);
	 javascriptclick(s.getSeeall());
	 Threadsleep(3000);
	 String Url4 = driver.getCurrentUrl();
	 Threadsleep(2000);
	 checkpresentElement("To verify the  entered product related search  listing  page",Url4.contains("Surface"));
	 LOGGER.info("See all navigation is verified");
	 EndTimeprint();
    
 }
 @When("Observe the navigation  page using Enter button {string}")
public void observe_the_navigation_page_using_enter_button(String Keyword3) throws AWTException {

	StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
	Threadsleep(3000);
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 PassValues(s.getSearchBox(), Keyword3);
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(3000);
	 KeyEnter();
	 Threadsleep(3000);
	 String Url4 = driver.getCurrentUrl();
	 checkpresentElement("To check user account  page",Url4.contains("catalogsearch"));
	 LOGGER.info("Using Enter key navigation page is verified");
	 EndTimeprint();
   
}

@Then("Verify the Filter options in SLP page")
public void verify_the_filter_options_in_slp_page() throws AWTException {

	 s = new Searchpage();
	 Threadsleep(2000);
	WebElement ResidentialFiltercount1 =s.getResidentialcount1();
	String ResidentialFiltercount2 = ResidentialFiltercount1.getText();
	String ResidentialFiltercount3 = ResidentialFiltercount2.substring(0, 3);
	System.out.println(ResidentialFiltercount3);
	 
	 ClickElement(s.getResidentialFilterSLP());
	 checkpresentElement("To check Residential Filter is displayed",s.getResidentialFilterSLP().isDisplayed());
	 LOGGER.info("Residential Filter is displayed");
     Threadsleep(4000);
	 checkequaltext("To check selected Residential  filter count for in SLP page",ResidentialFiltercount3,s.getResidentialcount2().getText());
    
	 Threadsleep(5000);
	 ClickElement(s.getPopupclose());

	 Threadsleep(1000);
	
	 for (int i = 0; i <7; i++) {
		KeyDOWN();
	}

     Threadsleep(2000);

	 WebElement SurfaceFiltercount1 =s.getSurfacecount1();
	String SurfaceFiltercount2 = SurfaceFiltercount1.getText();
	String SurfaceFiltercount3 = SurfaceFiltercount2.substring(0, 3);
	System.out.println(SurfaceFiltercount3);
    
	 ClickElement(s.getSurfaceFilterSLP());
	 LOGGER.info("Surface Filter is displayed");

	 checkequaltext("To check selected surface  filter count for in SLP page",SurfaceFiltercount3,s.getSurfacecount2().getText());
	 Threadsleep(3000);
	 ClickElement(s.getClearall());
	 Threadsleep(3000);
	 
	 LOGGER.info("Clearall button is verified");

	  for (int i = 0; i <6; i++) {
		KeyUP();
	}

	 EndTimeprint(); 

	 driver.quit();

}

@When("User go to the listing page")
public void user_go_to_the_listing_page() throws AWTException, InterruptedException {

    StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());

	LOGGER.info("Main category to Sub Category is displayed");
	Threadsleep(3000);


	for (int i = 0; i <8; i++) {
		KeyDOWN();
	 }

	 lp = new Listingpage();
	 javascriptclick(lp.getPLPpageseriesfilter());
	 Threadsleep(3000);
     System.out.println(lp.getListingpageproductname1().getText());
	 checkpresentElement("To verify series number for listed products",lp.getListingpageproductname1().getText().contains("CPBS"));

	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory4());
	moveToElement(h.getCategeory5());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory5().getText(),"Overhead Tank Filling");
	actionClick(h.getCategeory5());
    Threadsleep(3000);
	

	for (int i = 0; i <7; i++) {
		KeyDOWN();
	}

	lp = new Listingpage();

	 javascriptclick(lp.getPhasefilter());
	 Threadsleep(3000);
	 System.out.println(lp.getListingpageproductname1().getText());
   
	 checkpresentElement("To verify series number for listed products",lp.getListingpageproductname1().getText().contains("Three Phase"));

     Threadsleep(3000);
	 javascriptclick(lp.getPLPpageseriesfilter());
     Threadsleep(3000);
     System.out.println(lp.getListingpageproductname1().getText());
	 checkpresentElement("To verify series number for listed products",lp.getListingpageproductname1().getText().contains("KOS"));
	 LOGGER.info("Series number & Phase options are verified for listed products");

	s = new Searchpage();
	Threadsleep(4000);
	ClickElement(s.getPopupclose());
	EndTimeprint();

	  for (int i = 0; i <8; i++) {
		KeyDOWN();
	}

     lp = new Listingpage();

	lp.getPLPminpricerange().clear();
	Threadsleep(3000);
	PassValues(lp.getPLPminpricerange(), getdataExcel(5, 1));

	lp.getPLPmaxpricerange().clear();
	Threadsleep(3000);
	PassValues(lp.getPLPmaxpricerange(), getdataExcel(6, 1));

      Threadsleep(5000);


	  int minPrice = Integer.parseInt(getdataExcel(5, 1));
      int maxPrice = Integer.parseInt(getdataExcel(6, 1));

    List<WebElement> price1 = driver.findElements(By.cssSelector(".special-price"));

for (WebElement price2 : price1) {

    // Remove symbols like ₹, commas

    String priceText = price2.getText().replaceAll("[^0-9]", ""); 

        int productPrice = Integer.parseInt(priceText);

		int productPrice2 = productPrice / 100;

		if (productPrice2 >= minPrice && productPrice2 <= maxPrice) {

			
		LOGGER.info("Product price {} is within the range [{} - {}]", productPrice2, minPrice, maxPrice);
		} 
		
		else {
		
			LOGGER.info("Product price {} is outside the range [{} - {}]", productPrice2, minPrice, maxPrice);
		}
    }

     EndTimeprint();

}

@When("verify the Buy now  CTA functionality")
public void verify_the_buy_now_cta_functionality() {

    StartTimeprint();
	lp = new Listingpage();
	moveToElement(lp.getOvertankListingCategeory1());
	Threadsleep(4000);
	checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	LOGGER.info("Buy Now button is displayed");
	Threadsleep(3000);
	actionClick(lp.getBuyNowButton1());
	LOGGER.info("Buy Now button is clicked");
	Threadsleep(3000);
	EndTimeprint();

}


@When("verify the Compare now option in listing page")
public void verify_the_compare_now_option_in_listing_page() {

	StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
    Threadsleep(2000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());
	lp = new Listingpage();
	Threadsleep(3000);
	moveToElement(lp.getListingCategeory2());
	Threadsleep(4000);
	actionClick(lp.getListingCompare2());
	Threadsleep(3000);
	moveToElement(lp.getListingCategeory1());
	Threadsleep(3000);
	actionClick(lp.getListingCompare1());
	Threadsleep(2000);
	// s = new Searchpage();
	// ClickElement(s.getPopupclose());
  	LOGGER.info("Compare now button is displayed");
	EndTimeprint();


}

@Then("verify the added compare products in comparision page")
public void verify_the_added_compare_products_in_comparision_page() {
	
	 StartTimeprint();
	 lp = new Listingpage();
	 Threadsleep(2000);
	 moveToElement(lp.getComparisonLink());
	 ClickElement(lp.getComparisonLink());
	 Threadsleep(3000);
	 String Url6 = driver.getCurrentUrl();
	 System.out.println(Url6);
	 checkpresentElement("To check user account  page",Url6.contains("product_compare"));
	 LOGGER.info("Compare now checkbox is clicked and redirection is verified");
	 EndTimeprint();

	 driver.quit();

}


@When("On click Buy now CTA or any product cards in listing page")
public void on_click_buy_now_cta_or_any_product_cards_in_listing_page() {


	StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());

	LOGGER.info("Main category to Sub Category is displayed");
	Threadsleep(3000);
	 lp = new Listingpage();
	 moveToElement(lp.getListingCategeory1());
	 Threadsleep(3000);
	 checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	 LOGGER.info("Buy Now button is displayed");
	 //Threadsleep(3000);

	  StartTimeprint();
	  p = new PDPpage();
	  Threadsleep(3000);
	  WebElement PLPname1 = p.getPLPname();
	  String name1 = PLPname1.getText();
	  WebElement PLPrate1 = p.getPLPprice();
	  String Rate1 = PLPrate1.getText();
	  System.out.println(Rate1);

	  javascriptclick(p.getPLPname());
	 //actionClick(lp.getBuyNowButton1());
	 LOGGER.info("Product name  is clicked");
	
	s = new Searchpage();
	Threadsleep(3000);
	ClickElement(s.getPopupclose());
	EndTimeprint();

	  p = new PDPpage();
	  WebElement PDPrate2 = p.getPDPprice2();
      Threadsleep(3000);
	  String Rate2 = PDPrate2.getText();

	  WebElement PDPname2 = p.getPDPname();
	  String name2 = PDPname2.getText();
      System.out.println(name2);
	  checkequaltext("To verify btw the PLP&PDP page the product NAME",name1,name2);
	  checkequaltext("To verify btw the PLP&PDP page the product RATE",Rate1,Rate2); 
	  LOGGER.info(" Btw the PLP&PDP page the product NAME & RATE are verified");
	  Threadsleep(3000);
	  ClickElement(p.getQtybuttoMaxPDP());
	  ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(3000);
	  //p.getPincodefield().clear();
 	PassValues(p.getPincodefield() , getdataExcel(4, 1));
	ClickElement(p.getPincodecheckButton());
	Threadsleep(2000);
	Alertaccept();
	Threadsleep(2000);
	 EndTimeprint();

}

@When("Verify the  correct delivery message based on TAT functionality")
public void verify_the_correct_delivery_message_based_on_tat() {
	
  StartTimeprint();

   //String  a = "500027";

    String expectedMessage;
    String actualMessage = p.getPincodedeliverymessage().getText();

	if (actualMessage.equals("Product will be delivered in 6 - 8 Working days")) {

    expectedMessage = "Product will be delivered in 6 - 8 Working days";

} 

else {
    expectedMessage = "Some other message";
}

    System.out.println("Actual Message: " + actualMessage);
    System.out.println("Expected Message: " + expectedMessage);

    Assert.assertEquals(expectedMessage, actualMessage);

    LOGGER.info("Checking if Pincode Delivery message is equal. Expected: {}, Actual: {}", expectedMessage, actualMessage);

    // int lowerTAT = 1;
    // int higherTAT = 6;

    // if (lowerTAT == 1) 
	// {
    //     expectedMessage = "Product will be delivered in -7 - 9 Working days";
    // } else if (lowerTAT < 2) {
    //     expectedMessage = "Product will be delivered in " + lowerTAT + " - " + higherTAT + " Working days";
    // } else {
    //     expectedMessage = "This product is  not Delivery for this pincode";
    // }

	EndTimeprint();
	
}


@Then("verify the PDP page features and products prices & do the add to cart.")
public void verify_the_pdp_page_features_and_products_prices_do_the_add_to_cart_then_go_to_cart_page() {
    
  
	 StartTimeprint();
	  p = new PDPpage();
	  checkpresentElement("To check Installation Service label is displayed",p.getInstallationServicelabel().isDisplayed());
	  LOGGER.info("Installation Service label is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getBuynowPDP().isDisplayed());
	  LOGGER.info("Buy Now button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCartButtonPDP().isDisplayed());
	  LOGGER.info("Add to cart button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToQuoteButtonPDP().isDisplayed());
	  LOGGER.info("Add to quote button is displayed");
	  checkpresentElement("To check Quantity button is displayed",p.getAddToWishListButtonPDP().isDisplayed());
	  LOGGER.info("Add to wishlist button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCompareListButtonPDP().isDisplayed());
	  LOGGER.info("Add to compare button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getFAQSectionButtonPDP().isDisplayed());
	  LOGGER.info("FAQ section button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceImagePDP().isDisplayed());
	  LOGGER.info("Service image is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceTextPDP().isDisplayed());
	  LOGGER.info("Service text is displayed");
       Threadsleep(4000);
	   javascriptclick(p.getBuynowPDP());
	//  javascriptclick(p.getAddToCartButtonPDP());

	  Threadsleep(20000);
	
	//  javascriptclick(p.getPDPcheckoutButton());

	  c = new Cartpage();
	  moveToElement(c.getMinicartQty());
	  Threadsleep(2000);
	  actionClick(c.getMinicartQty());
	  Threadsleep(3000);
	  EndTimeprint();

	  driver.quit();

   }


  //  Order success page cases

   @Given("user opens the Home page and logs in")
   public void user_opens_the_home_page_and_logs_in() {

     StartTimeprint(); 
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	// checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 Threadsleep(4000);
	 LOGGER.info("Login icon is displayed");
	 javascriptclick(h.getLogin());
	 Threadsleep(2000);
	 LOGGER.info("Login icon is clicked");
	
	 l = new Loginpage();
	 moveToElement(l.getPasswordLogin());
	 checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	 actionClick(l.getPasswordLogin());
	 LOGGER.info("login with Password option is clicked");
	 Threadsleep(3000);
	 l = new Loginpage();
	 PassValues(l.getEmailField(), getdataExcel(1, 1));
	 checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	 LOGGER.info("Email field is displayed");
	 PassValues(l.getPasswordField(), getdataExcel(2, 1));
	 checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
     Threadsleep(4000);
	 ClickElement(l.getLoginButton());
     EndTimeprint();
}

@When("the user navigates to the listing page")
public void the_user_navigates_to_the_listing_page() {

    StartTimeprint();
	h = new Homepage();
    Threadsleep(3000);
	javascriptclick(h.getKBLLogo());
    Threadsleep(3000);
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
	Threadsleep(3000);

	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());
	LOGGER.info("Main category to Sub Category is displayed");
     Threadsleep(3000);
	 EndTimeprint();
}


@When("clicks the {string} CTA or any product card on the listing page")
public void clicks_the_cta_or_any_product_card_on_the_listing_page(String string) {
	
	 StartTimeprint();
	 lp = new Listingpage();
	 moveToElement(lp.getListingCategeory1());
	 Threadsleep(4000);

	 checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
     LOGGER.info("Buy Now button is displayed");

	// actionClick(lp.getBuyNowButton1());

	 //LOGGER.info("Buy Now button is clicked");

	 Threadsleep(3000);
	
	  p = new PDPpage();
	  WebElement PLPname3 = p.getPLPname1();
	  String name1 = PLPname3.getText();
	  WebElement PLPrate1 = p.getPLPprice1();
	  String Rate1 = PLPrate1.getText();
	  System.out.println(Rate1);
	  
	  javascriptclick(p.getPLPname1());
	  Threadsleep(3000);

	  WebElement PDPrate1 = p.getPDPprice();
      String Rate3 = PDPrate1.getText();
	  Threadsleep(3000);
	  System.out.println(Rate3);

	  WebElement PDPname2 = p.getPDPname();
	  String name2 = PDPname2.getText();
      System.out.println(name2);
	  Threadsleep(1000);

	  checkequaltext("To verify btw the PLP&PDP page the product NAME",name1,name2);

	  checkequaltext("To verify btw the PLP&PDP page the product RATE",Rate1,Rate3); 
	  LOGGER.info(" Btw the PLP&PDP page the product NAME & RATE are verified");
	  Threadsleep(3000);

	  p = new PDPpage();
	  ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(3000);
	  PassValues(p.getPincodefield(), "600119");
	  ClickElement(p.getPincodecheckButton());
	  Threadsleep(3000);
	 Alertaccept();
	  Threadsleep(1000);
	  checkpresentElement("To check Installation Service label is displayed",p.getInstallationServicelabel().isDisplayed());
	  LOGGER.info("Installation Service label is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getBuynowPDP().isDisplayed());
	  LOGGER.info("Buy Now button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCartButtonPDP().isDisplayed());
	  LOGGER.info("Add to cart button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToQuoteButtonPDP().isDisplayed());
	  LOGGER.info("Add to quote button is displayed");
	 // checkpresentElement("To check Quantity button is displayed",p.getAddToWishListButtonPDP().isDisplayed());
	 // LOGGER.info("Add to wishlist button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCompareListButtonPDP().isDisplayed());
	  LOGGER.info("Add to compare button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getFAQSectionButtonPDP().isDisplayed());
	  LOGGER.info("FAQ section button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceImagePDP().isDisplayed());
	  LOGGER.info("Service image is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceTextPDP().isDisplayed());
	  LOGGER.info("Service text is displayed");
       Threadsleep(4000);
	   EndTimeprint();

}

@When("adds the product to the cart and proceeds to the Cart page")
public void adds_the_product_to_the_cart_and_proceeds_to_the_cart_page() {

      StartTimeprint();
      p = new PDPpage();
	  WebElement PDPrate2 = p.getPDPprice();
	  String Rate2 = PDPrate2.getText();
	  System.out.println(Rate2);

	  WebElement PDPname2 = p.getPDPname();
	  String name2 = PDPname2.getText();
      System.out.println(name2);

	  Threadsleep(2000);
      ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(2000);
	  LOGGER.info("Add to cart button is clicked");
	  Threadsleep(2000);

	  // javascriptclick(p.getPDPcheckoutButton());

	  c = new Cartpage();
	  moveToElement(c.getMinicartQty());
	  Threadsleep(2000);
	  actionClick(c.getMinicartQty());
	  Threadsleep(3000);

	 checkequaltext("To verify btw the PDP&Cart  page the product RATE",c.getCartprice1().getText(),Rate2);

	 checkequaltext("To verify btw the PDP&Cart  page the product NAME",c.getCartname().getText(), name2);
	 
	 LOGGER.info(" Btw the PDP&Cart  page the product RATE are verified");

	Threadsleep(3000);
	EndTimeprint();
    
	//Order summary detail verification in cart page

      StartTimeprint(); 
	  c = new Cartpage();
	  WebElement cartsubtotal1 =c.getCartsubtotal();
	  String CartSubTotal2 = cartsubtotal1.getText();
	  String CartSubTotal3 = CartSubTotal2.substring(1).replace(",", "");
	  Double Subtotalamount = Double.valueOf(CartSubTotal3);
	 
	  WebElement CARTIGST = c.getCARTIGST();   
      String CARTIGST1 = CARTIGST.getText();              
      String CARIGST2 = CARTIGST1.substring(1).replace(",", "");  
      Double CARIGST3 = Double.valueOf(CARIGST2);         
     


	//   WebElement CGST = c.getCartCGSTtax();        
    //   String CGST1 = CGST.getText();              
    //   String CGST2 = CGST1.substring(1).replace(",", "");  
    //   Double CGST3 = Double.valueOf(CGST2);         
    //   System.out.println(CGST3);

	//   WebElement SGST = c.getCartSGSTtax();
    //   String  SGST1 = SGST.getText();
    //   String SGST2 = SGST1.substring(1).replace(",", "");
    //   Double SGST3 = Double.valueOf(SGST2);
	//   System.out.println(SGST3);

       double total = Subtotalamount + CARIGST3;
       String T = String.valueOf(total).substring(0,7);
	   


	   WebElement  OrderSummaryTotalcart = c.getCARTIGSTORDERSUMMARYTOTAL();
	   String OrderSummaryTotalcart1 = OrderSummaryTotalcart.getText();
	   String OrderSummaryTotalcart2 = OrderSummaryTotalcart1.substring(1).replace(",", "");
	   Double OrderSummaryTotalcart3 = Double.valueOf(OrderSummaryTotalcart2);
       String Ordercarttotal = String.valueOf(OrderSummaryTotalcart3);
	   System.out.println(Ordercarttotal);
	   checkpresentElement("To check order summary calculation",Ordercarttotal.equals(T));

	   LOGGER.info("Successfully Verified   product order summary  Detail in the CART  page");
	   Threadsleep(3000);
	   

}

@When("verifies the Cart page features and Order summary detail.Then,proceeds to the Checkout page")
public void verifies_the_cart_page_features_and_order_summary_detail_then_proceeds_to_the_checkout_page() {
      
	//     StartTimeprint();
	//     c = new Cartpage();
	//     Threadsleep(1000);
	// 	  ClickElement(c.getQtybuttoMaxCart());
	// 	  Threadsleep(3000);
	// 	  ClickElement(c.getQtybuttoMinCart());
	// 	  navigateRefresh();
	// 	  Threadsleep(3000);
	// 	  javascriptclick(c.getCartcontinueButton());
	// 	   Threadsleep(3000);
    //     moveToElement(h.getCategeory53());
	//     moveToElement(h.getCategeory54());
	//     moveToElement(h.getCategeory55());
	//     moveToElement(h.getCategeory58());
	//     Threadsleep(4000);
	//     checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory58().getText(),"Reverse Osmosis (RO) Plant");
	//     actionClick(h.getCategeory58());
	//     LOGGER.info("Main category to Sub Category is displayed");
	//     javascriptclick(c.getCartname2());
	//     Threadsleep(2000);
	// 	 ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     PassValues(p.getPincodefield(), "400058");
	//     ClickElement(p.getPincodecheckButton());
	//     Threadsleep(2000);
	//     Alertaccept();
	//     Threadsleep(2000);
	//     p = new PDPpage();
	//     ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     LOGGER.info("Add to cart button is clicked");
	//     // javascriptclick(p.getPDPcheckoutButton());
	//     c = new Cartpage();
	//     moveToElement(c.getMinicartQty());
	//     Threadsleep(2000);
	//     actionClick(c.getMinicartQty());
	//     Threadsleep(2000);
	//     ClickElement(c.getRemoveButton());
	//     Threadsleep(3000);
	//     LOGGER.info("Remove button is clicked");
    //     c = new Cartpage();
	// 	javascriptclick(c.getCartcontinueButton());
	// 	Threadsleep(3000);
    //     moveToElement(h.getCategeory53());
	//     moveToElement(h.getCategeory54());
	//     moveToElement(h.getCategeory55());
	//     moveToElement(h.getCategeory58());
	//     Threadsleep(3000);
	//     checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory58().getText(),"Reverse Osmosis (RO) Plant");
	//     actionClick(h.getCategeory58());
	//     LOGGER.info("Main category to Sub Category is displayed");
	//     javascriptclick(c.getCartname4());
	//     Threadsleep(2000);
	// 	 ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     PassValues(p.getPincodefield(), "400058");
	//     ClickElement(p.getPincodecheckButton());
	//     Threadsleep(2000);
	//     Alertaccept();
	//     Threadsleep(2000);
	//      p = new PDPpage();
	//     ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     LOGGER.info("Add to cart button is clicked");
	//  //  javascriptclick(p.getPDPcheckoutButton());
	//   c = new Cartpage();
	//   moveToElement(c.getMinicartQty());
	//   Threadsleep(2000);
	//   actionClick(c.getMinicartQty());
	//   Threadsleep(2000);
	//   ClickElement(c.getAddToWishlistButton());
	//   Threadsleep(2000);
	//   LOGGER.info("Add to wishlist button is clicked");

	//   proceeds to the Checkout page

	   c = new Cartpage();
	   Threadsleep(4000);
	   javascriptclick(c.getCartCheckoutButton());
	  LOGGER.info("Cart checkout button is clicked");
	  Threadsleep(3000);
	  EndTimeprint();

}

@When("enters the shipping and billing details")
public void enters_the_shipping_and_billing_details() {
	 
	    StartTimeprint();
	    c = new Cartpage();
		Threadsleep(3000);

	    javascriptclick(c.getShippherebutton());

		// ClickElement(c.getAddnewAddressButton());
        // Threadsleep(3000);
		// // PassValues(c.getFname(), getdataExcel(1, 2));
		// // PassValues(c.getLname(), getdataExcel(2, 2));
		// PassValues(c.getCompanyname(), getdataExcel(3, 2));
		// PassValues(c.getStreetaddress1(), getdataExcel(4, 2));
		// PassValues(c.getStreetaddress2(), getdataExcel(5, 2));
		// PassValues(c.getStreetaddress3(), getdataExcel(6, 2));
		// //PassValues(c.getZip(), getdataExcel(7, 2));
		// Threadsleep(2000);
		// Select s = new Select(c.getAddresstype());
		// s.selectByIndex(2);
        // Threadsleep(2000);
		// PassValues(c.getMobilenumber(), getdataExcel(8, 2));
		// javascriptclick(c.getSaveAddressButton());
		 
		checkpresentElement("To Verify the  preselect shipping option  in checkout page",c.getPreselectshipping().isDisplayed());

		Threadsleep(2000);
	
}

@When("selects a payment option and places the order")
public void selects_a_payment_option_and_places_the_order() {

	c = new Cartpage();
	Threadsleep(4000);
	javascriptclick(c.getPaymentButton());
	Threadsleep(3000);

	javascriptclick(c.getBillingaddress());

	Threadsleep(2000);
    javascriptclick(c.getShowmoreoption());

	 Threadsleep(3000);

	  javascriptclick(c.getApplybutton());
	  Threadsleep(3000);

	  WebElement checkoutsubtotal1 =c.getCheckoutsubtotal();
	  String checkoutsubtotal2 = checkoutsubtotal1.getText();
	  String checkoutsubtotal3 = checkoutsubtotal2.substring(1).replace(",", "");
	  Double checkoutsubtotal4 = Double.valueOf(checkoutsubtotal3.replace(",", ""));
	  Double checkoutsubtotal5 = Double.valueOf(checkoutsubtotal4);
	

	  WebElement CHECKOUTIGST = c.getCheckoutIGST();       
      String CHECKOUTIGST1 = CHECKOUTIGST.getText();              
      String CHECKOUTIGST2 = CHECKOUTIGST1.substring(1).replace(",", "");  
      Double CHECKOUTIGST4 = Double.valueOf(CHECKOUTIGST2);         
      


	  WebElement CheckoutDiscount1 =c.getCheckoutDiscount1();
	  String CheckoutDisount2 = CheckoutDiscount1.getText();
	  String CheckoutDisount3 = CheckoutDisount2.substring(2).replace(",", "");
	  Double CheckoutDisount4 = Double.valueOf(CheckoutDisount3);
	

	//   WebElement SGST = c.getCartSGSTtax();
    //   String  SGST1 = SGST.getText();
    //   String SGST2 = SGST1.substring(1).replace(",", "");
    //   Double SGST3 = Double.valueOf(SGST2);
	//   System.out.println(SGST3);

	   double CheckoutTotal1 =  (checkoutsubtotal5 + CHECKOUTIGST4) -  CheckoutDisount4;
	   String T1 = String.valueOf(CheckoutTotal1);
	   System.out.println(T1);

	   WebElement  DiscountOrderSummarytotal = c.getCheckoutDiscount1Ordertotal();
	   String DiscountOrderSummarytotal1 = DiscountOrderSummarytotal.getText();
	   String DiscountOrderSummarytotal2 = DiscountOrderSummarytotal1.substring(1).replace(",", "");
	   Double DiscountOrderSummarytotal3 = Double.valueOf(DiscountOrderSummarytotal2);
       String DiscountOrderSummarytotal4 = String.valueOf(DiscountOrderSummarytotal3);
	  
	   checkpresentElement("To Verify the  order summary calculation in checkout page",DiscountOrderSummarytotal4.equals(T1));
	   LOGGER.info("Successfully verified order summary calculation after applying the coupon code in the checkout page");
	   Threadsleep(3000);
	   javascriptclick(c.getCancelbutton());
	   Threadsleep(3000);

	  WebElement CheckouSubtwithoutcoupon1  = c.getCheckoutwithoutcoupon1();
	  String CheckouSubtwithoutcoupon2 = CheckouSubtwithoutcoupon1.getText();
	  String CheckouSubtwithoutcoupon3 = CheckouSubtwithoutcoupon2.substring(1).replace(",", "");
	  Double CheckouSubtwithoutcoupon4 = Double.valueOf(CheckouSubtwithoutcoupon3.replace(",", ""));
	  Double CheckouSubtwithoutcoupon5 = Double.valueOf(CheckouSubtwithoutcoupon4);
	

	  WebElement CheckouIGSTtwithoutcoupon1 = c.getCheckoutwithoutcoupon2();  
      String CheckouIGSTtwithoutcoupon2 = CheckouIGSTtwithoutcoupon1.getText();              
      String CheckouIGSTtwithoutcoupon3 = CheckouIGSTtwithoutcoupon2.substring(1).replace(",", "");  
      Double CheckouIGSTtwithoutcoupon4 = Double.valueOf(CheckouIGSTtwithoutcoupon3);         
    

	   double CheckoutwithoutcouponTotal =  CheckouSubtwithoutcoupon5 + CheckouIGSTtwithoutcoupon4;
	   String w1 = String.valueOf(CheckoutwithoutcouponTotal);
	   System.out.println(w1);

	   WebElement  WithoutdiscountOrderSummarytotal =c.getCheckoutwithoutcoupon4();
	   String WithoutdiscountOrderSummarytota2 = WithoutdiscountOrderSummarytotal.getText();
	   String WithoutdiscountOrderSummarytota3 = WithoutdiscountOrderSummarytota2.substring(1).replace(",", "");
	   Double WithoutdiscountOrderSummarytota4 = Double.valueOf(WithoutdiscountOrderSummarytota3);
       String WithoutdiscountOrderSummarytota5 = String.valueOf(WithoutdiscountOrderSummarytota4);
	   

	     checkpresentElement("After,canceled the coupon code,To  check  the  order summary calculation in checkout page",WithoutdiscountOrderSummarytota5.equals(w1));
		 LOGGER.info("Successfully Verified order summary calculation after canceling the coupon code in the checkout page");
		 Threadsleep(3000);
		 
	//    javascriptclick(c.getTermconditionlink());
	//    Threadsleep(3000);
	//    javascriptclick(c.getTermcloselink());

	   Threadsleep(2000);
       javascriptclick(c.getTermcheckboxlogin());

	   //javascriptclick(c.getTermcheckbox());

}

@Then("after successful payment, the user should see the Thank You page")
public void after_successful_payment_the_user_should_see_the_thank_you_page() {

	c = new Cartpage();
    Threadsleep(3000);
	javascriptclick(c.getPlaceorder());
	LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
    Threadsleep(2000);
	EndTimeprint();

   // checkpresentElement("To ordernumber in success page",c.getSuccespageOrdernumber().isDisplayed());

	// String Successorder = c.getSuccespageOrdernumber().getText();

	// moveToElement(c.getLoginIcon2());
	
	// actionClick(c.getMyaccountlink());
	// Threadsleep(3000);

	//  ClickElement(c.getMyOrder1());
	//  Threadsleep(3000);
	
    //  LOGGER.info("My  all the orders is displayed in Orderlisting page");

	//  String Myaccountordernumber = c.getOrdernumber().getText();

	// System.out.println("Thankyou page order number : " + Successorder);
    // System.out.println("My account page order number : " + Myaccountordernumber);

    // Assert.assertEquals(Successorder, Myaccountordernumber);

	// javascriptclick(c.getVieworder());

	// LOGGER.info("Order listing page View orders link is dispalyed & clicked");

	

}

@Given("user opens the Home page and do the login with valid credential")
public void user_opens_the_home_page_and_do_the_login_with_valid_credential() {

	//  StartTimeprint(); 
	//  h = new Homepage();
	//  LOGGER.info("KBL site home page are launched");
    //  String title = driver.getTitle();
    //  checkpresentElement("To check title at Home page",title.contains("E-shop"));
	//  Threadsleep(2000);
	//  moveToElement(h.getLoginIcon());
	// // checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	//  Threadsleep(4000);
	//  LOGGER.info("Login icon is displayed");
	//  javascriptclick(h.getLogin());
	//  Threadsleep(2000);
	//  LOGGER.info("Login icon is clicked");
	
	//  l = new Loginpage();
	//  moveToElement(l.getPasswordLogin());
	//  checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	//  actionClick(l.getPasswordLogin());
	//  LOGGER.info("login with Password option is clicked");
	//  Threadsleep(3000);
	//  l = new Loginpage();
	//  PassValues(l.getEmailField(), getdataExcel(1, 1));
	//  checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	//  LOGGER.info("Email field is displayed");
	//  PassValues(l.getPasswordField(), getdataExcel(2, 1));
	//  checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
    //  Threadsleep(4000);
	//  ClickElement(l.getLoginButton());
    //  EndTimeprint();

}    

@When("User Enter the product name in search box {string} and the user navigates to the PDP  page via search field")
public void user_enter_the_product_name_in_search_box_and_the_user_navigates_to_the_pdp_page_via_search_field(String Keyproduct) {
  
	//  StartTimeprint();
	//  s = new Searchpage();
	//  moveToElement(s.getSearchBox());
	//  Threadsleep(2000);
	//  PassValues(s.getSearchBox(), Keyproduct);
	//  LOGGER.info("Product name is entered in search box");
    //  Threadsleep(4000);
	//  ClickElement(s.getProductnameSLP());
	//  LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");
	//  EndTimeprint();

}

@When("Enter the pincode detail and Add to cart.Then,Go to chekout page")
public void enter_the_pincode_detail_and_add_to_cart_then_go_to_chekout_page() {
   

	//   p = new PDPpage();
	//   ClickElement(p.getAddToCartButtonPDP());
	//   Threadsleep(3000);
	//   PassValues(p.getPincodefield(), getdataExcel(3, 1));
	//   ClickElement(p.getPincodecheckButton());
	//   Threadsleep(3000);
	//    Alertaccept();
    //   Threadsleep(2000);
    //   ClickElement(p.getAddToCartButtonPDP());
	//   Threadsleep(2000);
	//   LOGGER.info("Add to cart button is clicked");
	//   Threadsleep(2000);
	//   javascriptclick(p.getPDPcheckoutButton());
   
}


 @When("Select the  the shipping and billing details and Place the order")
 public void select_the_the_shipping_and_billing_details_and_place_the_order() {


	//     StartTimeprint();
    //     Threadsleep(5000);
		
	//     c = new Cartpage();
	// 	Threadsleep(5000);
	//     javascriptclick(c.getShippherebutton());
	//     Threadsleep(4000);
	//     javascriptclick(c.getPaymentButton());
	//     Threadsleep(3000);
	//     javascriptclick(c.getBillingaddress());
    //     Threadsleep(4000);
    //     javascriptclick(c.getTermcheckboxlogin());
    //      Threadsleep(4000);
	//      javascriptclick(c.getPlaceorder());
	// LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
     
	// Threadsleep(5000);
	 
	//    c = new Cartpage();
    //    SuccessorderNo1 = c.getSuccespageOrdernumber().getText().trim();  
    //     System.out.println("Order ID captured: " + SuccessorderNo1);
    //     EndTimeprint();
      

	//    setDataToExcelSheet(1, 4, SuccessorderNo1);


}

@Given("the user opens the admin login page")
public void the_user_opens_the_admin_login_page() {

	 StartTimeprint();
	 launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	 Threadsleep(3000);
	 h = new Homepage();
	 LOGGER.info("KBL admin site  are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("Admin"));
	 EndTimeprint();

}

@When("the user enters valid login credentials and clicks the Sign In button")
public void the_user_enters_valid_login_credentials_and_clicks_the_sign_in_button() {

	 a = new Adminlogin();
	 Threadsleep(3000);
	 PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	 PassValues(a.getAdminpassword(), getdataExcel(2, 3));
     Threadsleep(3000);
     javascriptclick(a.getSignInButton1());
	// ClickElement(a.getConfirmButton1());
  
}

@When("Admin user get the warehouse code from sales order detail page")
public void admin_user_get_the_warehouse_code_from_sales_order_detail_page() throws AWTException {

     a = new Adminlogin();
	 Threadsleep(4000);
     moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(4000);
	 driver.navigate().refresh();

	//   Threadsleep(3000);
	//  javascriptclick(a.getClearallinlorderdetailpage());
	//  KeyEnter();

	 Threadsleep(5000);
	 String OrderText2 = a.getOrderNumberlistingpage().getText().trim();
     System.out.println("Order number Text: " +OrderText2);
	 
	// checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", SuccessorderNo1, OrderText2);


	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);
	if (statusText.equalsIgnoreCase("Paid")) {
		 javascriptclick(a.getPaidstatus());
         System.out.println("Status is Paid");
     }
    else if (statusText.equalsIgnoreCase("Pending")) {
    System.out.println("Status is Pending");

	  javascriptclick(a.getPaidstatus());
	  javascriptclick(a.getPaidoption());
	  Threadsleep(3000);
  } 
   else {
    Assert.fail("Unexpected status: " + statusText);
   }

    for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 Threadsleep(3000);


	 javascriptclick(a.getWarhouseallcation());

	// String expectedWarehouseCode1   = "1013";
	
	 String expectedWarehouseCode = a.getWarhouseallcationcode().getText();

	 System.out.println(expectedWarehouseCode);
	
	// Assert.assertEquals(expectedWarehouseCode1 , expectedWarehouseCode);

     for (int i = 0; i <16; i++) {
		KeyDOWN();
	}

     Threadsleep(3000);
	
	 moveToElement(a.getAMbab());

	 actionClick(a.getAMbab());
	 
     for (int i = 0; i <5; i++) {
		KeyUP();
	}
    
	  Threadsleep(3000);

      moveToElement(a.getAMbabManagepincode());

	  actionClick(a.getAMbabManagepincode());

	  Threadsleep(3000);
	 
	 moveToElement(a.getClearallinlorderdetailpage());

	 actionClick(a.getClearallinlorderdetailpage());

    //javascriptclick(a.getClearallinlorderdetailpage());

	   Threadsleep(3000);

      javascriptclick(a.getFilteroptions());

	   Threadsleep(3000);

	   PassValues(a.getPincodefield(), getdataExcel(3, 1));

	   String Pincode1 =  a.getPincodefield().getAttribute("value");

	  KeyEnter();

	  Threadsleep(3000);

	  String Pincode2 = a.getAmbabpdppincode().getText();
	  
	  Assert.assertEquals("Verify the Pincode is matched or not", Pincode1, Pincode2);

if (Pincode1.equalsIgnoreCase(Pincode2)) {

	String Actualwarehousecode = a.getAmbaballocationcode().getText().trim();

	// Assert.assertEquals("Warehouse Code mismatch",expectedWarehouseCode, Actualwarehousecode);
	// LOGGER.info("Succesfully verified  warhouse allocation code the btw order detail  & Manage pincode page for pump products in admin panel");

} 

else {
	Assert.fail("Pincode does not match: Expected " + Pincode1 + ", but found " + Pincode2);
}


          Threadsleep(3000);
		  moveToElement(a.getWarehouse());
		  actionClick(a.getWarehouse());

          Threadsleep(3000);
	     moveToElement(a.getWarehousestocklisting());
	     actionClick(a.getWarehousestocklisting());
	     Threadsleep(3000);

	   moveToElement(a.getClearallinlorderdetailpage());

	   actionClick(a.getClearallinlorderdetailpage());

        Threadsleep(3000);

		javascriptclick(a.getFilteroptions());

	    PassValues(a.getSKUfield(), getdataExcel(9, 1));

	    String SKU2 =  a.getSKUfield().getAttribute("value");

	    System.out.println(SKU2);

		Threadsleep(3000);

	     KeyEnter();

	    Threadsleep(2000);

List<WebElement> CodesAndQty = driver.findElements(By.xpath("//table//tbody//tr"));
System.out.println("Verifying Warehouse Code and Qty column data:");

for (int i = 1; i <= CodesAndQty.size(); i++) {
  
	try {
        WebElement warehouseCodeCell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[2]"));
        String warehouseCode = warehouseCodeCell.getText().trim();

        if (warehouseCode.equals(expectedWarehouseCode)) {
            System.out.println("Successfully fetched warehouse code from stock listing page.");

            WebElement qtyCell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[6]"));
            String qtyText = qtyCell.getText().trim();

            int qty = Integer.parseInt(qtyText);

            if (qty > 0) {
                System.out.println("Success: Warehouse Code " + warehouseCode + " has Qty = " + qty);
                Assert.assertEquals("Warehouse Code matched", expectedWarehouseCode, warehouseCode);
                LOGGER.info("Verified warehouse code & Qty on stock listing page.");
            } 
			
			
	else if (qty <= 0) { 


                System.out.println("Error: Warehouse Code " + warehouseCode + " has Qty = " + qty);
                Thread.sleep(2000);

                // Re-navigate to Manage Warehouse
                moveToElement(a.getWarehouse());
                actionClick(a.getWarehouse());
                Thread.sleep(2000);

                moveToElement(a.getManagewarehouse1());
               
				actionClick(a.getManagewarehouse1());
               
				Thread.sleep(3000);

                List<WebElement> manageRows = driver.findElements(By.xpath("//table//tbody//tr"));
               
				for (int j = 1; j <= manageRows.size(); j++) {
                    WebElement codeCell = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]/td[3]"));
                    String code = codeCell.getText().trim();

                    if (code.equals(expectedWarehouseCode)) {
                        WebElement baseCode = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]/td[4]"));
                        Thread.sleep(3000);
                        javascriptclick(baseCode);
                        Thread.sleep(3000);

                        List<WebElement> priorityDropdowns = driver.findElements(By.xpath("//select[contains(@name, 'p')]"));
                        Set<String> uniqueCodes = new LinkedHashSet<>();

                        for (WebElement dropdown : priorityDropdowns) {
                            Select select = new Select(dropdown);
                            String selectedText = select.getFirstSelectedOption().getText().trim();
                          
							if (selectedText.contains("kbl.co.in")) {
                                String extractedCode = selectedText.substring(0, 4);
                                uniqueCodes.add(extractedCode);
                                System.out.println("Collected unique code: " + extractedCode);
                            }
                        }

                        List<String> codesList = new ArrayList<>(uniqueCodes);

                        writeUniqueCodesToExcel("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas2.xlsx", codesList, "Warehouse Codes");

                        // Re-apply filters
                        moveToElement(a.getWarehouse());
                        actionClick(a.getWarehouse());
                        Thread.sleep(3000);

                        moveToElement(a.getWarehousestocklisting());
                        actionClick(a.getWarehousestocklisting());
                        Thread.sleep(3000);

                        moveToElement(a.getClearallinlorderdetailpage());
                        actionClick(a.getClearallinlorderdetailpage());
                        Thread.sleep(3000);

                        javascriptclick(a.getFilteroptions());
                        PassValues(a.getSKUfield(), getdataExcel(9, 1));
                        String SKU3 = a.getSKUfield().getAttribute("value");
                        System.out.println(SKU3);
                        Thread.sleep(4000);
                        KeyEnter();

                        // Continue logic if needed after refresh
                   

    // Match against Excel codes

       
				String defaultWarehouseCode = "1023";

				System.out.println(1023);


			
			 List<WebElement> listingpagefinalRows = driver.findElements(By.xpath("//table//tbody//tr"));


	     for (int k = 1; k <= listingpagefinalRows.size() ; k++) {
      
     	// XPath to get Warehouse Code from 2nd column

    WebElement warehouseCodeCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + k + "]/td[2]"));	
	String warehouseCode2 = warehouseCodeCell1.getText().trim();

	
if (warehouseCode2.contains(".")) {
    System.out.println("Skipping decimal warehouse code: " + warehouseCode2);
    continue; // Skipping the decimal value
}

System.out.println(warehouseCode2);


  List<String> excelCodes = readWarehouseCodesFromExcel("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas2.xlsx");

 System.out.println(excelCodes);

  for (String  excelCodes1: excelCodes) {

	boolean matchFound = false;

if (warehouseCode2.equals(excelCodes1)) {

	matchFound = true;



WebElement qtyCell2 = driver.findElement(By.xpath("//table//tbody//tr[" + k + "]/td[6]"));
            String qtyText1 = qtyCell2.getText().trim();

            // Parse qty as integer
            int qty1 = Integer.parseInt(qtyText1);

            // Final valid match found: warehouse code and quantity
            System.out.println("Warehouse Code: " + warehouseCode2 + ", Qty: " + qty1);


			 if (qty1 > 0) {
            
				System.out.println("Success: Warehouse Code " + warehouseCode2 + " has Qty = " + qty1);
				Assert.assertEquals("Warehouse Code matched", expectedWarehouseCode, warehouseCode2);
                LOGGER.info("Verified warehouse code & Qty on stock listing page from the priority list page.");
            } 
			
			
	else if (qty <= 0) { 

                Assert.assertEquals("Fallback to default code", expectedWarehouseCode, defaultWarehouseCode);
                System.out.println("Qty = 0 → Using default warehouse code: " + defaultWarehouseCode);
                Thread.sleep(2000);
	}

		
			
	if (!matchFound) {
        System.out.println("GAP: Warehouse code from Excel NOT found on the web page: " + expectedWarehouseCode);
        // You could also fail the test if this is critical:
        // Assert.fail("Warehouse code from Excel not found on the web page: " + expectedWarehouseCode);
    }
	

	
		
					
	
	
	}
                   
				
            }

			

		
		}
  
	


	
	} 

	 
               
}

	}
}
		
}


	catch (Exception e) {
//  System.out.println("Exception at row " + i + ": " + e.getMessage());
  
}

}

	}





//   List<WebElement> CodesandQty = driver.findElements(By.xpath("//table//tbody//tr"));

//       //    int totalRowCount = CodesandQty.size();
//        //        int rowCount = Math.min(totalRowCount, 20);

//    System.out.println("Verifying Warehouse Code and Qty column data:");

//     for (int i = 1; i <= CodesandQty.size() ; i++) {

//     try {

//         // XPath to get Warehouse Code from 2nd column

//         WebElement warehouseCodeCell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[2]"));
// 		String warehouseCode = warehouseCodeCell.getText().trim();
// 		if (warehouseCode.equals(expectedWarehouseCode)) {

// 		  System.out.println("Succesfully fetched particular warhousecode from warehouse stock listing page");

//              // XPath to get Qty from 6th column
//              WebElement qtyCell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[6]"));
//              String qtyText = qtyCell.getText().trim();
//              System.out.println("Qty Text: " + qtyText);
              
//                // Parse qty as integer
//                int qty = Integer.parseInt(qtyText);
//                // Now apply condition on qty
//                 if (qty > 0) {
// 		      System.out.println(" Success: Warehouse Code " + warehouseCode + " has Qty = " + qty + " (greater than 0)");
// 			  String Actualwarehousecode1 = warehouseCode;
//               Assert.assertEquals("Warehouse Code matched or not in warehouse page", expectedWarehouseCode, Actualwarehousecode1);
			
			  
// 	      LOGGER.info("Succesfully verified  warhouse allocation code & Qty the  Warhouse stock listing page");
	
// 		} 



		
// 			else if (qty <= 0) { 

//                  Threadsleep(2000);
// 				System.out.println("Error: Warehouse Code " + warehouseCode + " has Qty = " + qty + " (zero or less)");
      
// 				moveToElement(a.getWarehouse());

// 	    actionClick(a.getWarehouse());

// 	   Threadsleep(2000);

// 	    moveToElement(a.getManagewarehouse1());

// 	    actionClick(a.getManagewarehouse1());

// 	    Threadsleep(3000);

//      List<WebElement> Mangaewarhousecodes2 = driver.findElements(By.xpath("//table//tbody//tr"));

// 		for (int j = 1; j <= Mangaewarhousecodes2.size() ; j++) {
// 		WebElement  Mangaewarhousecodes3 = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]/td[3]"));
// 		String Mangaewarhousecodes4 = Mangaewarhousecodes3.getText().trim();


// 		if (Mangaewarhousecodes4.equals(expectedWarehouseCode)) {
// 	    WebElement Basewarehousecaode = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]/td[4]"));

// 	javascriptclick(Basewarehousecaode);

// 	List<WebElement> Prioritywarehousecode = driver.findElements(By.xpath("//select[contains(@name, 'p')]"));

//    //List<String> codes = new ArrayList<>();

//     Set<String> uniqueCodeslist = new LinkedHashSet<>();

//   for (WebElement dropdownvalue : Prioritywarehousecode) {
//     Select select = new Select(dropdownvalue);
//     String selectedOption1 = select.getFirstSelectedOption().getText().trim();
// 	if (selectedOption1.contains("kbl.co.in")) 
// 	{

//         String selectedOption2 = selectedOption1.substring(0, 4);
// 		uniqueCodeslist.add(selectedOption2);
//         System.out.println("Collected unique code: " + selectedOption2);
// 		List<String> codeslist = new ArrayList<>(uniqueCodeslist);
// 		//Ultilityclass.writeToExcel2(codeslist, "E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas3.xlsx");
//         writeUniqueCodesToExcel("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas2.xlsx", codeslist, "Warehouse Codes");
//         Threadsleep(3000);

// }
// }
//         moveToElement(a.getWarehouse());
// 		actionClick(a.getWarehouse());
//         Threadsleep(3000);
// 	     moveToElement(a.getWarehousestocklisting());
// 	     actionClick(a.getWarehousestocklisting());
// 	     Threadsleep(3000);
// 	     moveToElement(a.getClearallinlorderdetailpage());
// 	    actionClick(a.getClearallinlorderdetailpage());
//         Threadsleep(3000);
// 		javascriptclick(a.getFilteroptions());
// 	    PassValues(a.getSKUfield(), getdataExcel(9, 1));
// 	    String SKU3 =  a.getSKUfield().getAttribute("value");
// 	    System.out.println(SKU3);
// 		Threadsleep(4000);
// 	    KeyEnter();
// 	//	javascriptclick(a.getApplyfilter());
// 	    Threadsleep(3000);

		
//      List<WebElement> CodesandQty1 = driver.findElements(By.xpath("//table//tbody//tr"));

// 	for (int k = 1; k <= CodesandQty1.size() ; k++) {
      
// 	// XPath to get Warehouse Code from 2nd column

//         WebElement warehouseCodeCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + k + "]/td[2]"));
		
// 		String warehouseCode2 = warehouseCodeCell1.getText().trim();
		
// 		if (!warehouseCode2.matches("^[a-zA-Z0-9]+$")) {

//     System.out.println("Invalid warehouse code (non-alphanumeric or decimal): " + warehouseCode2);
//     continue;
// }

         
// 		// XPath to get Qty from 6th column

//          WebElement qtyCell2 = driver.findElement(By.xpath("//table//tbody//tr[" + k + "]/td[6]"));
//         String qtyText3 = qtyCell2.getText().trim();
//         System.out.println("Qty Text: " + qtyText);
// 	    System.out.println(qtyText3);
// 		System.out.println(warehouseCode2 + " = " + qtyText3);
		



	
	
	
	
// 	}





// }


		
// }
  
// 	}

	
// }
		
			
	
// 	} 


// 			catch (Exception e) {
//        // System.out.println("Error in row " + i + ": " + e.getMessage());
//     }


// }



@Then("the admin dashboard page should be displayed")
public void the_admin_dashboard_page_should_be_displayed() {

	//  a = new Adminlogin();
	//  javascriptclick(a.getSignInButton1());
	//  Threadsleep(5000);

	//  javascriptclick(a.getSales());
	//  Threadsleep(2000);
	//  javascriptclick(a.getSalesOrder());

	//  Threadsleep(3000);

	//   javascriptclick(a.getPaidstatus());

	//   Threadsleep(3000);

	//   javascriptclick(a.getWarhouseallcation());

	//   String A  = "1023";

	//   String A1 = a.getWarhouseallcationcode().getText();

	//   Assert.assertEquals(A , A1);
	  
    //   LOGGER.info("Succesfully verified the  warhouse allocation code for pump products in admin panel");


}


}



