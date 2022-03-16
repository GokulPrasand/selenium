package com.selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class Login {



public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "../SeleniumApp/msedgedriver.exe"); // value is path of the exe file
WebDriver web = new EdgeDriver();
web.get("http://localhost:3306/myjdbcapp/ab");
Thread.sleep(1000);
web.findElement(By.id("username")).sendKeys("school");
Thread.sleep(3000);
web.findElement(By.id("password")).sendKeys("campus");
Thread.sleep(1000);
WebElement userTypeDropdown = web.findElement(By.id("Selc"));
Select typeoption = new Select(userTypeDropdown);
typeoption.selectByVisibleText("Admin");
Thread.sleep(1000);
web.findElement(By.name("submit")).click();

}



}