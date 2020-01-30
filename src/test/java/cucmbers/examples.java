package cucmbers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class examples {
	WebDriver driver;
	@Given("User Launch the chrome")
	public void user_Launch_the_chrome() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   }

	@Given("User navigates to testme")
	public void user_navigates_to_testme() {
	    
	}
	@Given("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		  driver.findElement(By.linkText("SignIn")).click();
	  
	}

	@Given("User enters as {string}")
	public void user_enters_as(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);

	}

	@Given("User enter as {string}")
	public void user_enter_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);

	  
	}
	@Given("User clicks on login buttons")
	public void user_clicks_on_login_buttons() {
		driver.findElement(By.name("Login")).click();

		
	    
	}

	@Given("validate login success!")
	public void validate_login_success() {
	   
	}
	
}
