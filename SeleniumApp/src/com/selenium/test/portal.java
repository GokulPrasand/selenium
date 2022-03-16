package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class portal {
// edge browser
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "..//SeleniumApp//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.gecko.driver", "..//SeleniumApp//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Handson/portal.html");
		
		WebElement obj = driver.findElement(By.name("name"));
		if(obj.isEnabled()==true)
		{
			obj.sendKeys("Samantha");
			String gettext = obj.getAttribute("value");
			System.out.println("Given name : " + gettext);
			Thread.sleep(2000);			
			obj.clear();
			Thread.sleep(2000);
			driver.quit(); // browser will close
		}
		else
			System.out.println("Textbox is not enabled");
	}
}
