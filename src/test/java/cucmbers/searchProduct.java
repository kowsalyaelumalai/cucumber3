package cucmbers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class searchProduct {
	WebDriver driver;
	WebElement s;
	@Given("User Launches the chrome")
	public void user_Launches_the_chrome() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   
	}

	@Given("User navigate to testme")
	public void user_navigate_to_testme() {
	   
	}

	@Given("User clicks on Signin button")
	public void user_clicks_on_Signin_button() {
		  driver.findElement(By.linkText("SignIn")).click();

	}
	@Given("User entered as {string}")
	public void user_entered_as(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);

	}
	@Given("User enter password as {string}")
	public void user_enter_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);

	}


	@Given("User click on login buttons")
	public void user_click_on_login_buttons() {
		driver.findElement(By.name("Login")).click();
  
	}

	@Given("user search products on textbox")
	public void user_search_products_on_textbox() {
		driver.findElement(By.name("products")).sendKeys("Headphone");
		driver.findElement(By.xpath(("/html/body/div[1]/form/input"))).click();
		driver.findElement(By.xpath(("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"))).click();
		driver.findElement(By.xpath(("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"))).click();
		String s12=driver.findElement(By.xpath(("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4"))).getText();
		Assert.assertEquals( s12,"Headphone");
	}

}
