package cucmbers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class registration {
   WebDriver driver;
   
	@Given("User Launch the chrome browser")
	public void user_Launch_the_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("User navigates to application")
	public void user_navigates_to_application() {
	   
	}
	@Given("User clicks on SignUp button")
	public void user_clicks_on_SignUp_button() {
		  driver.findElement(By.linkText("SignUp")).click();
	    
	}
	@Given("User enters as usernamre {string}")
	public void user_enters_as_usernamre(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
		System.out.println("username"+string);
	}

	@Given("User enters as firstname {string}")
	public void user_enters_as_firstname(String string) {
		driver.findElement(By.id("firstName")).sendKeys(string);
		System.out.println("username"+string);
	}

	@Given("User enters as lastname {string}")
	public void user_enters_as_lastname(String string) {
		driver.findElement(By.id("lastName")).sendKeys(string);

		System.out.println("lastname"+string);
	}

	@Given("User enters as password {string}")
	public void user_enters_as_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);

		System.out.println("password"+string);
	}
	@Given("User enters as confirmpassword {string}")
	public void user_enters_as_confirmpassword(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);

		System.out.println("confirmpassword"+string);
	}

	@Given("User clicks the gender option")
	public void user_clicks_the_gender_option() {
		driver.findElement(By.xpath(("//input[@name='gender' and @value='female']"))).click();

	}
	@Given("User clicks the gender as {string}")
	public void user_clicks_the_gender_as(String string) {
		driver.findElement(By.xpath(("//input[@name='gender' and @value='Female']"))).click();

	}

	@Given("User enters as email {string}")
	public void user_enters_as_email(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);

		System.out.println("email"+string);
	}

	@Given("User enters as ph_no {string}")
	public void user_enters_as_ph_no(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);

		System.out.println("ph_no"+string);
	}

	@Given("User enters as DOB {string}")
	public void user_enters_as_DOB(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);

		System.out.println("DOB"+string);
	}

	@Given("User enters as address {string}")
	public void user_enters_as_address(String string) {
		driver.findElement(By.name("address")).sendKeys(string);

		System.out.println("address"+string);
	}

	@Given("User enters as security Question {string}")
	public void user_enters_as_security_Question(String string) {
		System.out.println("security_Question"+string);
		Select s11=new Select(driver.findElement(By.name("securityQuestion")));
		s11.selectByVisibleText(string);
	
	}

	@Given("User enters as answer {string}")
	public void user_enters_as_answer(String string) {
		
		driver.findElement(By.name("answer")).sendKeys("amulu1");

		System.out.println("answer"+string);
	}
	@Given("User clicks on Register button")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.xpath(("//input[@name='Submit' and @value='Register']"))).click();		

		
	}
	@Given("validate login success")
	public void validate_login_success() {

	}
}
