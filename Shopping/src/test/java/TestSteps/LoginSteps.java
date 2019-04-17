package TestSteps;
//login steps

import org.openqa.selenium.WebDriver;

import com.Filpkart.Shopping.PageElements;
import com.Filpkart.Shopping.WebdriverSingleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	WebdriverSingleton web;
	
	String url="https://www.flipkart.com/";
	
@Given("^User is on HomePage$")
public void User_is_on_HomePage() {
	String actualTitle;
	String expected="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	web=WebdriverSingleton.getInstanceOfSingletonBrowserClass();
	driver=web.getDriver();
	driver.get(url);
	driver.manage().window().maximize();
	actualTitle=driver.getTitle();
	System.out.println(actualTitle)	;
	Assert.assertEquals(expected, actualTitle);
		
	}
@When("^users enters the authentication details to login$")
public void users_enters_the_authentication_details_to_login() throws Throwable {
PageElements.loginID.sendKeys("test");
PageElements.password.sendKeys("test");
PageElements.loginbutton.click();

}
}	


