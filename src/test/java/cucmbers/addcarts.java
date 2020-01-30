package cucmbers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class addcarts {
	WebDriver driver;
	@Given("user launches the application")
	public void user_launches_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("user click the sigin")
	public void user_click_the_sigin() {
		  driver.findElement(By.linkText("SignIn")).click();

	}

	@Given("user enter username")
	public void user_enter_username() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");

	}

	@Given("user enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("password123");

	}

	@Given("user click the login")
	public void user_click_the_login() {
		driver.findElement(By.name("Login")).click();

	}

	@Given("user search the product and add the cart")
	public void user_search_the_product_and_add_the_cart() {
		driver.findElement(By.name("products")).sendKeys("Headphone");
		driver.findElement(By.xpath(("//input[@name='val' and @value='FIND DETAILS']"))).click();
		String s=driver.findElement(By.xpath(("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"))).getText();
		Assert.assertEquals( s,"cart");

	}
}