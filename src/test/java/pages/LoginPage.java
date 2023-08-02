package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Base {

	public void user_enter_valid_username_and_valid_password() {
		setup();
		WebElement userName = driver.findElement(By.cssSelector("input#user-name"));
		userName.sendKeys("standard_user");

		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("secret_sauce");

	}

	private void setup() {
		// TODO Auto-generated method stub

	}

	public void User_click_on_login_button() {
		WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));
		loginBtn.click();
	}

	public void Validate_User_login_into_the_application_successfully() {
		System.out.println("login");

	}

}
