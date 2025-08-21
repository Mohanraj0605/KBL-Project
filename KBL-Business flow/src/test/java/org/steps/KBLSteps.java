package org.steps;

import java.awt.AWTException;

import org.Pages.Homepage;
import org.Pages.Listingpage;
import org.Pages.Loginpage;
import org.Pages.Searchpage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.openqa.selenium.JavascriptExecutor;
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
	
@Given("User open the Home page")
public void user_open_the_Home_page() {
	  
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
	 StartTimeprint();
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
     Threadsleep(3000);
	 javascriptclick(h.getKBLLogo());
     checkpresentElement("To check KBL logo is displayed",h.getKBLLogo().isDisplayed());
	 LOGGER.info("KBL logo is displayed");
	 moveToElement(h.getLoginIcon());
	 checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 LOGGER.info("Login icon is displayed");
	 actionClick(h.getLogin());
	 Threadsleep(3000);
	 LOGGER.info("Login icon is clicked");
	 moveToElement(h.getSearchBox());
	 checkpresentElement("To check Search box is displayed",h.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 Threadsleep(3000);
	 moveToElement(h.getWishlistLink());
	 checkpresentElement("To check Wishlist link is displayed",h.getWishlistLink().isDisplayed());
	 LOGGER.info("Wishlist link is displayed");
     Threadsleep(3000);
	 moveToElement(h.getCartIcon());
	 checkpresentElement("To check Cart icon is displayed",h.getCartIcon().isDisplayed());
	 actionClick(h.getCartIcon());
     Threadsleep(3000);
	 LOGGER.info("Cart icon is clicked");

    //  moveToElement(h.getRequestQuote());
	//  checkpresentElement("To check Request Quote is displayed",h.getRequestQuote().isDisplayed());
	//  LOGGER.info("Request Quote is displayed");
	//  actionClick(h.getRequestQuote());
	 javascriptclick(h.getKBLLogo());
	 Threadsleep(3000);
	 ClickElement(h.getHomepageSliderNext());
	 Threadsleep(1000);
	 ClickElement(h.getHomepageSliderNext());
	 checkpresentElement("To check Homepage banner and slider next is displayed",h.getHomepageSliderNext().isDisplayed());
	 Threadsleep(1000);
	 LOGGER.info("Homepage banner and slider next is displayed");
	 Threadsleep(3000);
     EndTimeprint();
	 
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
   
@When("When user opening the home page > To verify the Categeory (L1>L2) to sub-categeory  navigation")
public void when_user_opening_the_home_page_to_verify_the_categeory_l1_l2_to_sub_categeory_navigation() {

			}

@When("User verify the home page  sections is displayed or not")
public void user_verify_the_home_page_sections_is_displayed_or_not() {
    
	 StartTimeprint();
     h = new Homepage();
	Threadsleep(3000);
	javascriptclick(h.getKBLLogo());

	// Threadsleep(10000);
	// checkpresentElement("To check Residential section is displayed",h.getResidentialsection().isDisplayed());
	//  LOGGER.info("Residential section is displayed");

	//  checkpresentElement("To check Commercial section is displayed",h.getCommercialsection().isDisplayed());
	//  LOGGER.info("Commercial section is displayed");
	//  checkpresentElement("To check Industrial section is displayed",h.getIndustrialsection().isDisplayed());
	//  LOGGER.info("Industrial section is displayed");
	//  checkpresentElement("To check Agriculture section is displayed",h.getAgriculturesection().isDisplayed());
	//  LOGGER.info("Agriculture section is displayed");
	//  checkpresentElement("To check Testimonial section is displayed",h.getTestimonialsection().isDisplayed());
	//  LOGGER.info("Testimonial section is displayed");
	//  LOGGER.info("Home page sections all are displayed and verified ");
     Threadsleep(3000);
    EndTimeprint();
	

}

@When("Observe the Footer section links")
public void observe_the_footer_section_links() {
	 
	System.out.println("Footer section links are verified ");
 
}

@Then("Observe the  Footer section links redirections")
public void observe_the_footer_section_links_redirections() {

   //System.out.println("Footer links redirections are verified");
   
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

	 // l = new Loginpage();
//     moveToElement(l.getForgotlinking());
// 	checkpresentElement("To check Forgot password link is displayed",l.getForgotlinking().isDisplayed());
// 	LOGGER.info("Forgot password link is displayed");
// 	ClickElement(l.getForgotlinking());
//     Threadsleep(3000);
//     PassValues(l.getPasswordForgotField(), getdataExcel(3, 1));
//     javascriptclick(l.getSubmit());
// 	Threadsleep(3000);
  
}


@When("do  the login  and Observe the my account page options")
public void do_the_login_and_observe_the_my_account_page_options() {

	StartTimeprint();
    h = new Homepage();
    moveToElement(h.getLoginIcon());
	checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	actionClick(h.getLogin());
	Threadsleep(3000);
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


@When("User select the My account options in dashbord page")
public void user_select_the_my_account_options_in_dashbord_page() {

     l = new Loginpage();
	 Threadsleep(3000);
	 String title2 = driver.getTitle();
     checkpresentElement("To check user account  page",title2.contains("My Account"));
	 LOGGER.info("Login with password functionality is verified successfully");
     
	//  moveToElement(l.getMyAccountDashboard());
	//  l = new Loginpage();
    //  l.getMyAccountDashboard();
	//  System.out.println(l.getMyAccountDashboard().getText());
	 // checkpresentElement("To check My account dashboard is displayed",l.getMyAccountDashboard().isDisplayed());
	 
	 Threadsleep(10000);
	 implicitWait();
	 l = new Loginpage();
	 ClickElement(l.getMyOrder());
	 Threadsleep(3000);
	 String Url1 = driver.getCurrentUrl();
	 checkpresentElement("To check user account  page",Url1.contains("order"));
     LOGGER.info("My order is displayed");

}

@Then("Observe the redirection  page")
public void observe_the_redirection_page() {

     Threadsleep(3000);
	 implicitWait();
	 l = new Loginpage();
     ClickElement(l.getMyService());
	 Threadsleep(3000);
	 String Url2 = driver.getCurrentUrl();
	 checkpresentElement("To check user account  page",Url2.contains("service"));
     LOGGER.info("My Service page  is displayed");


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
	 LOGGER.info("Product name is entered in search box");
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
	 LOGGER.info("Product name is clicked and redirection is verified");
	 EndTimeprint();
}

@When("Observe the Seeall navigation  page {string}")
public void observe_the_seeall_navigation_page(String Keyword2) {

	 StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 PassValues(s.getSearchBox(), Keyword2);
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(3000);
	 javascriptclick(s.getSeeall());
	 Threadsleep(3000);
	 String Url4 = driver.getCurrentUrl();
	 checkpresentElement("To check user account  page",Url4.contains("Surface"));
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
public void verify_the_filter_options_in_slp_page() {

	 s = new Searchpage();
	 Threadsleep(4000);
	 ClickElement(s.getResidentialFilterSLP());
	 checkpresentElement("To check Residential Filter is displayed",s.getResidentialFilterSLP().isDisplayed());
	 LOGGER.info("Residential Filter is displayed");
	 String Url5 = driver.getCurrentUrl();
	 System.out.println(Url5);
	 LOGGER.info("Residential Filter is verified");
	 Threadsleep(3000);
	 ClickElement(s.getPopupclose());
	//  Threadsleep(3000);
	//  Scrolldownjavascript(s.getSurfaceFilterSLP());
	//  ClickElement(s.getSurfaceFilterSLP());
	//  checkpresentElement("To check Surface Filter is displayed",s.getSurfaceFilterSLP().isDisplayed());
	//  LOGGER.info("Surface Filter is displayed");
	//  Threadsleep(3000);
	//  //checkpresentElement("To check user account  page",Url6.contains("surface"));
	// Threadsleep(2000);
	 ClickElement(s.getClearall());
	 Threadsleep(3000);
	 LOGGER.info("Clearall button is verified");
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
	s = new Searchpage();
	ClickElement(s.getPopupclose());
  	LOGGER.info("Compare now button is displayed");
	EndTimeprint();
	
}

@Then("verify the added compare products in comparision page")
public void verify_the_added_compare_products_in_comparision_page() {
	 StartTimeprint();
	 lp = new Listingpage();
	 Threadsleep(3000);
	 implicitWait();
	 moveToElement(lp.getComparisonLink());
	 ClickElement(lp.getComparisonLink());
	 Threadsleep(3000);
	 String Url6 = driver.getCurrentUrl();
	 System.out.println(Url6);
	 checkpresentElement("To check user account  page",Url6.contains("product_compare"));
	 LOGGER.info("Compare now button is clicked and redirection is verified");
	 EndTimeprint();
}

}



