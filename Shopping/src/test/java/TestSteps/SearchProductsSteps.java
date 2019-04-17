package TestSteps;

import com.Filpkart.Shopping.PageElements;

import cucumber.api.java.en.When;

public class SearchProductsSteps {
	
	
@When("^user Search the \"([^\"]*)\"$")
public void user_Search_the_Product(String Product) throws Throwable {
PageElements.Search.sendKeys(Product);   
}

							
}