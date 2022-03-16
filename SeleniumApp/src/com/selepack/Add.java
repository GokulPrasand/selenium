package com.selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Add {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "..//Casestudy3//msedgedriver.exe"); // value is path of the exe file
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:9001/myjdbcapp/addemp");
		driver.findElement(By.name("txtEname")).sendKeys("supra");
		Thread.sleep(3000);
		driver.findElement(By.name("txtJob")).sendKeys("developer");
		Thread.sleep(3000);
		driver.findElement(By.name("txtSal")).sendKeys("30000");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmail")).sendKeys("supra@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPass")).sendKeys("supra123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).submit();

	}

}
