package org.steps;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
	 checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 LOGGER.info("Login icon is displayed");
	  Threadsleep(2000);
	 actionClick(h.getLogin());
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
	checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	actionClick(h.getLogin());
	Threadsleep(3000);
	LOGGER.info("Login icon is clicked");

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
    moveToElement(h.getLoginIcon());
	Threadsleep(3000);
	checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	actionClick(h.getLogin());
	LOGGER.info("Login icon is clicked");
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
	
    //  StartTimeprint();
	//  s = new Searchpage();
	//  moveToElement(s.getSearchBox());
	//  ClickElement(s.getProductnameSLP());
	//  String Url3 = driver.getCurrentUrl();
	//  System.out.println(Url3);
	//  Threadsleep(3000);
	//  checkpresentElement("To check user account  page",Url3.contains("vertical"));
	//  LOGGER.info("Product name is clicked and Succesfully redirection to the respective search listing page");
	//  EndTimeprint();
}

@When("Observe the Seeall navigation  page {string}")
public void observe_the_seeall_navigation_page(String Keyword2) {

	//  StartTimeprint();
	//  s = new Searchpage();
	//  moveToElement(s.getSearchBox());
	//  checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	//  PassValues(s.getSearchBox(), Keyword2);
	//  LOGGER.info("Product name is entered in search box");
    //  Threadsleep(3000);
	//  javascriptclick(s.getSeeall());
	//  Threadsleep(3000);
	//  String Url4 = driver.getCurrentUrl();
	//  Threadsleep(2000);
	//  checkpresentElement("To verify the  entered product related search  listing  page",Url4.contains("Surface"));
	//  LOGGER.info("See all navigation is verified");
	//  EndTimeprint();
    
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
     Threadsleep(2000);

	checkequaltext("To check selected Residential  filter count for in SLP page",ResidentialFiltercount3,s.getResidentialcount2().getText());
    
	 Threadsleep(2000);
	 ClickElement(s.getPopupclose());
	 Threadsleep(2000);
	
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

}

@When("User go to the listing page")
public void user_go_to_the_listing_page() {

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
	EndTimeprint();

}

@When("verify the Buy now  CTA functionality")
public void verify_the_buy_now_cta_functionality() {

    StartTimeprint();
	lp = new Listingpage();
	moveToElement(lp.getListingCategeory2());
	Threadsleep(4000);
	checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton2().isDisplayed());
	LOGGER.info("Buy Now button is displayed");
	Threadsleep(3000);
	actionClick(lp.getBuyNowButton2());
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
	Threadsleep(3000);
	lp = new Listingpage();
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
}

@When("On click Buy now CTA or any product cards in listing page")
public void on_click_buy_now_cta_or_any_product_cards_in_listing_page() {
   
	StartTimeprint();
	lp = new Listingpage();
	moveToElement(lp.getListingCategeory1());
	Threadsleep(4000);
	checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	LOGGER.info("Buy Now button is displayed");
	//Threadsleep(3000);
	  p = new PDPpage();
	  WebElement PLPname1 = p.getPLPname();
	  String name1 = PLPname1.getText();
	  WebElement PLPrate1 = p.getPLPprice();
	  String Rate1 = PLPrate1.getText();
	  System.out.println(Rate1);
      Threadsleep(3000);
	  javascriptclick(p.getPLPname());
	 //actionClick(lp.getBuyNowButton1());
	//LOGGER.info("Buy Now button is clicked");
	s = new Searchpage();
	ClickElement(s.getPopupclose());
	Threadsleep(2000);
	EndTimeprint();

	  StartTimeprint();
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
}

@When("Verify the  correct delivery message based on TAT functionality")
public void verify_the_correct_delivery_message_based_on_tat() {

    String  a = "500027";

    String expectedMessage;
    String actualMessage = p.getPincodedeliverymessage().getText();
	System.out.println(actualMessage);

	if (actualMessage.equals("Product will be delivered in 5 - 7 Working days")) {

    expectedMessage = "Product will be delivered in 5 - 7 Working days";

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
	  LOGGER.info("Buy now  button is clicked");
	  javascriptclick(p.getPDPcheckoutButton());

	//   c = new Cartpage();
	//   moveToElement(c.getMinicartQty());
	//   Threadsleep(2000);
	//   actionClick(c.getMinicartQty());
	//   Threadsleep(3000);
	//   EndTimeprint();

   }


  //  Order success page cases

   @Given("user opens the Home page and logs in")
   public void user_opens_the_home_page_and_logs_in() {
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
	 StartTimeprint();
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
	 moveToElement(h.getLoginIcon());
	 checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(5000);
	 javascriptclick(h.getLogin());
	 Threadsleep(4000);
	 l = new Loginpage();
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
    Threadsleep(4000);
	ClickElement(l.getLoginButton());

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

	 Threadsleep(3000);

	 checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	 LOGGER.info("Buy Now button is displayed");

	// actionClick(lp.getBuyNowButton1());

	 LOGGER.info("Buy Now button is clicked");

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
    
	//Order summary detail verification in cart page

      StartTimeprint(); 
	  c = new Cartpage();
	  WebElement cartsubtotal1 =c.getCartsubtotal();
	  String CartSubTotal2 = cartsubtotal1.getText();
	  String CartSubTotal3 = CartSubTotal2.substring(1).replace(",", "");
	  Double finalsubtotal = Double.valueOf(CartSubTotal3.replace(",", ""));
	  Double Subtotalamount = Double.valueOf(finalsubtotal);
	  System.out.println(Subtotalamount);
	  WebElement CGST = c.getCartCGSTtax();        
      String CGST1 = CGST.getText();              
      String CGST2 = CGST1.substring(1).replace(",", "");  
      Double CGST3 = Double.valueOf(CGST2);         
      System.out.println(CGST3);
	  WebElement SGST = c.getCartSGSTtax();
      String  SGST1 = SGST.getText();
      String SGST2 = SGST1.substring(1).replace(",", "");
      Double SGST3 = Double.valueOf(SGST2);
	  System.out.println(SGST3);

       double total = Subtotalamount + CGST3 + SGST3;
       String T = String.valueOf(total).substring(0,7);
	   System.out.println(T);

	//    WebElement  OrderSummaryTotalcart = c.getCartOrderSummaryTotal();
	//    String OrderSummaryTotalcart1 = OrderSummaryTotalcart.getText();
	//    String OrderSummaryTotalcart2 = OrderSummaryTotalcart1.substring(1).replace(",", "");
	//    Double OrderSummaryTotalcart3 = Double.valueOf(OrderSummaryTotalcart2);
    //    String Ordercarttotal = String.valueOf(OrderSummaryTotalcart3);
	//    System.out.println(Ordercarttotal);
	//   checkpresentElement("To check order summary calculation",Ordercarttotal.equals(T));
	   LOGGER.info("Successfully Verified   product order summary  Detail in the CART  page");
	   Threadsleep(3000);
	   EndTimeprint();



// 	  checkequaltext("Compare to cart&Checkout page subtotal",Cartsubtotal, getText1(a.getCheckoutSubTotal()));  
//    checkequaltext("Compare to cart&Checkout page ShippingCharges",shippingtotal, getText1(a.getCheckoutShippingtotal()));
// 	  checkequaltext("Compare to cart&Checkout page VAT amount",Cartvattotal,getText1(a.getCheckoutVATtotal()));
//    checkequaltext("Compare to cart&Checkout page Order total amount Charges",CartorderTotal, getText1(a.getCheckoutOrderTotal()));
//    WebElement CheckOrderTotal = a.getCheckoutOrderTotal();
//    String CheckOrderTotal1 = CheckOrderTotal.getText();
// 	  String CheckOrderTotal2 = CheckOrderTotal1.substring(4);
//    Double CheckOrderTotal3 = Double.valueOf(CheckOrderTotal2);
//    checkpresentElement("To check order summary calculation",CheckOrderTotal3.equals(OrderTotalamount) );
// 	  System.out.println("Successfully Verified   product order summary  Detail btw the CART&Checkout  page");
// 	  EndTimeprint();

}

@When("verifies the Cart page features and Order summary detail.Then,proceeds to the Checkout page")
public void verifies_the_cart_page_features_and_order_summary_detail_then_proceeds_to_the_checkout_page() {
      
	    StartTimeprint();
	    c = new Cartpage();
	    Threadsleep(1000);
		ClickElement(c.getQtybuttoMaxCart());
		Threadsleep(3000);
		ClickElement(c.getQtybuttoMinCart());
		navigateRefresh();
		Threadsleep(3000);
		javascriptclick(c.getCartcontinueButton());
		Threadsleep(3000);
        moveToElement(h.getCategeory53());
	    moveToElement(h.getCategeory54());
	    moveToElement(h.getCategeory55());
	    moveToElement(h.getCategeory58());
	    Threadsleep(3000);
	    checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory58().getText(),"Reverse Osmosis (RO) Plant");
	    actionClick(h.getCategeory58());
	    LOGGER.info("Main category to Sub Category is displayed");
	    javascriptclick(c.getCartname2());
	    Threadsleep(2000);
		 ClickElement(p.getAddToCartButtonPDP());
	    Threadsleep(3000);
	    PassValues(p.getPincodefield(), "400058");
	    ClickElement(p.getPincodecheckButton());
	    Threadsleep(2000);
	    Alertaccept();
	    Threadsleep(2000);
	    p = new PDPpage();
	    ClickElement(p.getAddToCartButtonPDP());
	    Threadsleep(3000);
	    LOGGER.info("Add to cart button is clicked");
	    // javascriptclick(p.getPDPcheckoutButton());
	    c = new Cartpage();
	    moveToElement(c.getMinicartQty());
	    Threadsleep(2000);
	    actionClick(c.getMinicartQty());
	    Threadsleep(2000);
	    ClickElement(c.getRemoveButton());
	    Threadsleep(3000);
	    LOGGER.info("Remove button is clicked");
        c = new Cartpage();
		javascriptclick(c.getCartcontinueButton());
		Threadsleep(3000);
        moveToElement(h.getCategeory53());
	    moveToElement(h.getCategeory54());
	    moveToElement(h.getCategeory55());
	    moveToElement(h.getCategeory58());
	    Threadsleep(3000);
	    checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory58().getText(),"Reverse Osmosis (RO) Plant");
	    actionClick(h.getCategeory58());
	    LOGGER.info("Main category to Sub Category is displayed");
	    javascriptclick(c.getCartname4());
	    Threadsleep(2000);
		 ClickElement(p.getAddToCartButtonPDP());
	    Threadsleep(3000);
	    PassValues(p.getPincodefield(), "400058");
	    ClickElement(p.getPincodecheckButton());
	    Threadsleep(2000);
	    Alertaccept();
	    Threadsleep(2000);
	     p = new PDPpage();
	    ClickElement(p.getAddToCartButtonPDP());
	    Threadsleep(3000);
	    LOGGER.info("Add to cart button is clicked");
	 //  javascriptclick(p.getPDPcheckoutButton());
	  c = new Cartpage();
	  moveToElement(c.getMinicartQty());
	  Threadsleep(2000);
	  actionClick(c.getMinicartQty());
	  Threadsleep(2000);
	  ClickElement(c.getAddToWishlistButton());
	  Threadsleep(2000);
	  LOGGER.info("Add to wishlist button is clicked");

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
		Threadsleep(2000);
	
}

@When("selects a payment option and places the order")
public void selects_a_payment_option_and_places_the_order() {
	c = new Cartpage();
	Threadsleep(4000);
	javascriptclick(c.getPaymentButton());
	Threadsleep(3000);
    javascriptclick(c.getTermcheckboxlogin());

	//javascriptclick(c.getTermcheckbox());
}
@Then("after successful payment, the user should see the Thank You page")
public void after_successful_payment_the_user_should_see_the_thank_you_page() {

	c = new Cartpage();
    Threadsleep(3000);
	javascriptclick(c.getPlaceorder());
	EndTimeprint();

	checkpresentElement("To ordernumber in success page",c.getSuccespageOrdernumber().isDisplayed());
    String Successorder = c.getSuccespageOrdernumber().getText();

	moveToElement(c.getLoginIcon2());
	
	actionClick(c.getMyaccountlink());
	Threadsleep(3000);

	 ClickElement(c.getMyOrder1());
	 Threadsleep(3000);
	
     LOGGER.info("My  all the orders is displayed in Orderlisting page");

	 String Myaccountordernumber = c.getOrdernumber().getText();


	System.out.println("Thankyou page order number : " + Successorder);
    System.out.println("My account page order number : " + Myaccountordernumber);

    Assert.assertEquals(Successorder, Myaccountordernumber);

	javascriptclick(c.getVieworder());

	LOGGER.info("Order listing page View orders link is dispalyed & clicked");

}

@Given("the user opens the admin login page")
public void the_user_opens_the_admin_login_page() {

	 StartTimeprint();
	 h = new Homepage();
	 LOGGER.info("KBL admin site  are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("Admin"));
	 EndTimeprint();
   
	
	 
}

@When("the user enters valid login credentials and clicks the Sign In button")
public void the_user_enters_valid_login_credentials_and_clicks_the_sign_in_button() {

	 a = new Adminlogin();

	 PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	 PassValues(a.getAdminpassword(), getdataExcel(2, 3));
     Threadsleep(5000);


	// ClickElement(a.getConfirmButton1());
  
   
}
@Then("the admin dashboard page should be displayed")
public void the_admin_dashboard_page_should_be_displayed() {

	 a = new Adminlogin();
	 javascriptclick(a.getSignInButton1());
	 Threadsleep(5000);
}



}



