package org.testingmasters.pageLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testingmasters.pageobjects.LoginPage;

public class LoginLib {
    WebDriver driver;
	public LoginLib(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password) {
		
		LoginPage lPO = new LoginPage(driver);
		lPO.getUsername().sendKeys(username);
		lPO.getPassword().sendKeys(password);
		lPO.getLoginButton().click();

	
	
	}
	
	public void login2() {
		
		//LoginPage lPO = new LoginPage(driver);
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("testing");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("testing");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		

	
	
	}

}
