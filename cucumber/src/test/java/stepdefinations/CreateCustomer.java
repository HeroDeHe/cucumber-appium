package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Settings;

public class CreateCustomer {
	WebDriver driver;
	
	public CreateCustomer() {
		// TODO Auto-generated constructor stub
		this.driver = Settings.driver;
	}
	
	@Given("^I open the Chrome application$")
	public void I_open_the_Chrome_application() throws Exception{
		System.out.println("--------------------START-----------------------");
		Settings.setUpAppium();
		this.driver = Settings.driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@And("^I input username$")
	public void I_input_username() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='' and @password='false']")).sendKeys("mngr157846");  
	}
	
	@And("^I input password$")
	public void I_input_password() {
		driver.findElement(By.xpath("//android.widget.EditText[@text='' and @password='true']")).sendKeys("gurasyj");   
	}
	
	@And("^I tap on Login button$")
	public void I_tap_on_Login_button() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='LOGIN']")).click();   
	}

	@Then("^Manager Home Page displays$")
	public void Manager_Home_Page_displays() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Never']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='Welcome To Manager's Page of Guru99 Bank']")).isDisplayed();
		System.out.println("--------------------END-------------------");   
	}
}
