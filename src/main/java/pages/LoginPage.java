package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;



	@FindBy(id = "session_key")
	WebElement username;

	@FindBy(id = "session_password")
	WebElement Password;

	@FindBy(className = "sign-in-form__submit-button")
	WebElement SignIn;
	
	
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterUsername(String string) {
		username.sendKeys("sfhhghrt");

	}

	public void EnterPassword(String string) {
		Password.sendKeys("aSFHDGrgjhtjhj");
	}

	public void SignInButton(String string) {
		SignIn.click();

	}

}
