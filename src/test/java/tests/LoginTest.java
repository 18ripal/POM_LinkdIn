package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars//geckodriver.exe");
		 driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50) );
		 driver.get("https://www.linkedin.com/");

	}

	@Test(priority = 1)
	public void EnterUserid() {
		LoginPage page = new LoginPage(driver);
		page.EnterUsername("gshfdjhgfxhkjgf");

	}

	@Test(priority = 2)
	public void EnterUserPassword() {
		LoginPage page = new LoginPage(driver);
		page.EnterPassword("eturutuyuygshfdjhgfxhkjgf");

	}

	@Test(priority = 3)
	public void ClickonSignInButton() {
		LoginPage page = new LoginPage(driver);
		page.SignInButton("gshfdjhgfxhkjgf");

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
