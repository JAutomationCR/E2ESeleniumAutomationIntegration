package org.automation.seleniumJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase_02 {
	@Test
	public void FBLogin() {
		
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Username1");
		driver.findElement(By.id("pass")).sendKeys("password1");
		driver.quit();
	
	}

}
