package orange.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.pageScripts.LoginPage;

public class LoginPageObject {

	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@placeholder='Username']")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement submitButton(WebDriver driver) { return
	 * driver.findElement(By.cssSelector("button[type='submit']")); }
	 * 
	 * public static WebElement forgotPassword(WebDriver driver) { return
	 * driver.findElement(By.className("orangehrm-login-forgot")); }
	 * 
	 * 
	 */

	@FindBy(xpath = "//*[@placeholder='Username']")
	public static WebElement username;

	@FindBy(name = "password")
	public static WebElement password;

	@FindBy(css = "button[type='submit']")
	public static WebElement submitButton;

	WebElement forgotPassword;

}
