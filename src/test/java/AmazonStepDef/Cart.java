package AmazonStepDef;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart {
	public WebDriver driver;
	@Given("user opens the testUrl")
	public void user_opens_the_test_url() {
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	}

	@When("user search for the {string}")
	public void user_search_for_the(String Product) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Product);
	   
	}

	@When("user click on search icon")
	public void user_click_on_search_icon() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("user clicks on first product")
	public void user_clicks_on_first_product() {
	    driver.findElement(By.xpath("//span[.='Apple iPhone 16 (128 GB) - Teal']")).click();
	    Set<String> pid = driver.getWindowHandles();
	   ArrayList<String> alw=new ArrayList<String>(pid);
	   for(String ch:alw)
	   {
		   driver.switchTo().window(ch);
	   }
	   
	}

	@When("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    
	}

	@Then("product should be added to the cart")
	public void product_should_be_added_to_the_cart() throws InterruptedException {
		Thread.sleep(6000);
		driver.close();
	    System.out.println("product successfully added to cart");
	}

}
