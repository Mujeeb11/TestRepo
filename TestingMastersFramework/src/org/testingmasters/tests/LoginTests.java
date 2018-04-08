package org.testingmasters.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testingmasters.commonutils.SelectBrowser;
import org.testingmasters.pageLib.LoginLib;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTests {
	static Properties prop = new Properties();
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws IOException {
		FileInputStream fis = new FileInputStream("./config.properties");
		prop.load(fis);
		
		driver = SelectBrowser.selectBrowser(prop.getProperty("browser"));
		 driver.get(prop.getProperty("url"));
	}
	
	@Test(priority = 1)
	public void loginValidCredentials() {
		LoginLib lb= new LoginLib(driver);
		lb.login(prop.getProperty("username"), prop.getProperty("password"));
		String title= driver.getTitle();
		assertEquals(title, "Find a Flight: Mercury Tours:");
		
	}
	@Test(priority =2)
	public void loginInValidCredentials() {
		LoginLib lb= new LoginLib(driver);
		lb.login("sdhdshb", "dsds");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
