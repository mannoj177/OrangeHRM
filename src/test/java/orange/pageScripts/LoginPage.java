package orange.pageScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import orange.pageObjects.LoginPageObject;

public class LoginPage {
	public WebDriver driver;
	
	@Test
	public void logic() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.findElement(By.className("orangehrm-login-forgot")).click();
		
		
		//LoginPageObject loginObject = new LoginPageObject();
		//LoginPageObject.username(driver).sendKeys("Admin");
		//LoginPageObject.password(driver).sendKeys("admin123");
		//LoginPageObject.submitButton(driver).click();
		//LoginPageObject.forgotPassword(driver);
		
		
		
		LoginPageObject.username.sendKeys("Admin");
		LoginPageObject.password.sendKeys("admin123");
		LoginPageObject.submitButton.click();

	}

}
