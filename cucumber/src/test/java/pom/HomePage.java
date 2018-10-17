package pom;

import java.io.File;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class HomePage {
	WebDriver driver;
	By txtmail = By.xpath("//input[@name=\"emailid\"]");
	By logIn = By.xpath("//input[@name=\"btnLogin\"]");
	By txtuserName = By.xpath("//table/tbody/tr[4]/td[2]");
	By txtpassWord = By.xpath("//table/tbody/tr[5]/td[2]");
	
	By btnlogIn = By.xpath("//input[@name=\"btnLogin\"]");
	By userName = By.xpath("//input[@name=\"uid\"]");
	By passWord = By.xpath("//input[@name=\"password\"]");
	By changePass = By.partialLinkText("Change Password");
	By oldPass = By.xpath("//input[@name=\"oldpassword\"]");
	By newPass = By.xpath("//input[@name=\"newpassword\"]");
	By confirmPass = By.xpath("//input[@name=\"confirmpassword\"]");
	By btnSubmit = By.xpath("//input[@name=\"sub\"]");
	By logOut = By.partialLinkText("Log out");
	
	By newCustomer = By.partialLinkText("New Customer");
	By name = By.xpath("//input[@name=\"name\"]");
	By address = By.xpath("//textarea[@name=\"addr\"]");
	By city = By.xpath("//input[@name=\"city\"]");
	By state = By.xpath("//input[@name=\"state\"]");
	By pin = By.xpath("//input[@name=\"pinno\"]");
	By mobile = By.xpath("//input[@name=\"telephoneno\"]");
	By email = By.xpath("//input[@name=\"emailid\"]");
	By pass = By.xpath("//input[@name=\"password\"]");
	By dob = By.xpath("//input[@name=\"dob\"]");
	By female = By.xpath("//input[@value=\"f\"]");
	
	By checkname = By.xpath("//table/tbody/tr/td/table/tbody/tr[5]/td[2]");
	By checkgender = By.xpath("//table/tbody/tr/td/table/tbody/tr[6]/td[2]");
	By checkaddress = By.xpath("//table/tbody/tr/td/table/tbody/tr[8]/td[2]");
	By checkcity = By.xpath("//table/tbody/tr/td/table/tbody/tr[9]/td[2]");
	By checksate = By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[2]");
	By checkpin = By.xpath("//table/tbody/tr/td/table/tbody/tr[11]/td[2]");
	By checkmobile = By.xpath("//table/tbody/tr/td/table/tbody/tr[12]/td[2]");
	By checkemail = By.xpath("//table/tbody/tr/td/table/tbody/tr[13]/td[2]");
	By logOutCustomer = By.xpath("//*[@href='Logout.php']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void setMail(String email) {
		driver.findElement(txtmail).sendKeys(email);
	}

	public void SubmitEmail() {
		driver.findElement(logIn).click();
	}
	
	public String GetUserName()
	{
		return driver.findElement(txtuserName).getText();
	}
	
	public String GetPassWord()
	{
		return driver.findElement(txtpassWord).getText();
	}	
	
	public void Login(String userName,String passWord) {
		driver.findElement(this.userName).sendKeys(userName);
		driver.findElement(this.passWord).sendKeys(passWord);
		driver.findElement(btnlogIn).click();
	}	
	
	public void ClickChangePass()
	{
		driver.findElement(changePass).click();
	}
	
	public void ChangePass(String oldPass, String newPass)
	{
		driver.findElement(this.oldPass).sendKeys(oldPass);
		driver.findElement(this.newPass).sendKeys(newPass);
		driver.findElement(this.confirmPass).sendKeys(newPass);		
	}
	
	public void cickSubmit()
	{
		driver.findElement(btnSubmit).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void ClickLogOut()
	{
		driver.findElement(logOut).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void ClickNewCustomer()
	{
		driver.findElement(newCustomer).click();
	}
	
	public void CreateCustomer(String CustomerName, String Gender, String DoB, String Address, String City, String State, String PIN, String Mobile, String Email, String Password)
	{
		driver.findElement(this.name).sendKeys(CustomerName);
		driver.findElement(this.address).sendKeys(Address);
		driver.findElement(this.city).sendKeys(City);
		driver.findElement(this.state).sendKeys(State);
		driver.findElement(this.pin).sendKeys(PIN);
		driver.findElement(this.mobile).sendKeys(Mobile);
		driver.findElement(this.email).sendKeys(Email);
		driver.findElement(this.pass).sendKeys(Password);
		driver.findElement(this.dob).sendKeys(DoB);
		if (Gender.toLowerCase().contains("female"))
		{
			driver.findElement(this.female).click();
		}
	}
	
	public void cickSubmitCustomer()
	{
		driver.findElement(btnSubmit).click();
	}
	
	public void checkInput(String CustomerName, String Gender, String DoB, String Address, String City, String State, String PIN, String Mobile, String Email, String Password) {	
		Assert.assertTrue(driver.findElement(this.checkname).getText().contains(CustomerName));
		Assert.assertTrue(driver.findElement(this.checkgender).getText().contains(Gender));
		Assert.assertTrue(driver.findElement(this.checkaddress).getText().contains(Address));
		Assert.assertTrue(driver.findElement(this.checkcity).getText().contains(City));
		Assert.assertTrue(driver.findElement(this.checksate).getText().contains(State));
		Assert.assertTrue(driver.findElement(this.checkpin).getText().contains(PIN));
		Assert.assertTrue(driver.findElement(this.checkmobile).getText().contains(Mobile));
		Assert.assertTrue(driver.findElement(this.checkemail).getText().contains(Email));
	}
	
	public void chuphinh() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		scrFile.renameTo(new File("screenshot", String.format("%td%tm%tY%tH%tM%tS.jpg", LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now(),LocalDateTime.now())));
	}
	
	
}
