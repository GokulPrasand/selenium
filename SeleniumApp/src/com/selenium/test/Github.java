package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Github {
// edge browser
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "..//SeleniumApp//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();		
		driver.get("https://github.com/login");
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(2000);		
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(2000);		
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.cssSelector("input[value='Sign in']")));		
	}
		
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:violet')", element);
	}

}
