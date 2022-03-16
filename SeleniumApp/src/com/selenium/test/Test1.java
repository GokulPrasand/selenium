package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "..//SeleniumApp//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Tesla");
		//driver.findElement(By.name("q")).submit();
		
		WebElement obj = driver.findElement(By.name("q"));
		obj.sendKeys("Wonders of the World");
		obj.submit();

	}

}
