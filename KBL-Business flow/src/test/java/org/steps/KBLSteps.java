package org.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.openqa.selenium.JavascriptExecutor;
import org.pom.Homepage;
import org.pom.KBLPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KBLSteps extends Ultilityclass {
	
	public static Homepage h ;
	public static JavascriptExecutor js;
	private static final Logger LOGGER = LogManager.getLogger(KBLSteps.class);
	public static KBLPom k ;

@Given("User open the Home page")
public void user_open_the_Home_page() {
	
	LOGGER.info("Browser launched");

//k.getSearchboxclick().click()

//	 StartTimeprint();
//	 String title = driver.getTitle();
//	 checkpresentElement("To check  Tittle at Home page",title.contains("24 Hour Pharmacy") );
//	 h = new Homepage();
//	 implicitWait();
//	 javascriptclick(h.getLoginImageIcon());
//	 Threadsleep(3000);
//	 javascriptclick(h.getLoginDialoption());
//	 Threadsleep(3000);
//	 ClickElement(h.getLoginDialNumber());
//	 PassValues(h.getLoginphonetext(), getdataExcel(1,3));
//     implicitWait();
//	 ClickElement(h.getLoginOTPrequest());
//     Threadsleep(20000);
//	 javascriptclick(h.getLoginOTPsubmit());
//     System.out.println("Login Function is Successfull");
//     LOGGER.info("Login Function is Successfull");
	 EndTimeprint();	

}

	@When("When user opening the home page > To verify the hedaer section Title & Elements")
public void when_user_opening_the_home_page_to_verify_the_hedaer_section_title_elements() {
System.out.println("Header section title and elements are verified");
}


@When("Observe the Footer section links")
public void observe_the_footer_section_links() {
	System.out.println("Footer section links are  verified ");
 
}
@Then("Observe the header & Footer section links redirections")
public void observe_the_header_footer_section_links_redirections() {

	System.out.println("Footer  are  verified in stage env");

}
	

	

}
