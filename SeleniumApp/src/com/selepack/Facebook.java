package com.selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "../SeleniumApp/msedgedriver.exe");  // value is path of the exe file
		WebDriver web = new EdgeDriver();
		web.get("https://www.facebook.com/");	
		
		//WebElement fbusername = web.findElement(By.id("email"));
		WebElement fbusername = web.findElement(By.name("email"));		
		
		if(fbusername.isDisplayed()==true)
		{
			if(fbusername.isEnabled()==true)
			{
				fbusername.sendKeys("gokuldhanush23@gmail.com");
				String fbuser =  fbusername.getAttribute("value");  // it will get the values form username textbox
				System.out.println(fbuser);				
			}
			else
				System.out.println("texbox is not enabled");
		}
		else
			System.out.println("texbox is not visible");
		Thread.sleep(3000);
		WebElement fbpass = web.findElement(By.name("pass"));
		if(fbpass.isDisplayed()==true)
		{
			if(fbpass.isEnabled()==true)
			{
				fbpass.sendKeys("Kingslayer@22");
				String fbpwd =  fbpass.getAttribute("value");  // it will get the values form username textbox
				System.out.println(fbpwd);
				web.findElement(By.name("login")).submit();
			}
			else
				System.out.println("texbox is not enabled");
		}
		else
			System.out.println("texbox is not visible");
		
		Thread.sleep(3000);// clear textbox content
		fbusername.clear();
		fbpass.clear(); 
	}

}
