package org.testingmasters.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='userName']")
	private WebElement username;

	public WebElement getUsername() {
		return username;

	}

	@FindBy(css = "input[name='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(css = "input[name='login']")
	private WebElement login;

	public WebElement getLoginButton() {
		return login;

	}
}
