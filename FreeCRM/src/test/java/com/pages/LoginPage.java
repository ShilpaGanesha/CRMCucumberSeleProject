package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseClasses.Library;

public class LoginPage extends Library {
	
	WebDriver driver;
    By loginlink= By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a");
    By email=By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input");
    By password= By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input");
    By loginbutton= By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
    By setting = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div");
    By logout = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/div/a[5]/span");
    
    public LoginPage(WebDriver driver) {
		this.driver=driver;
          }	
		public void clickloginlink() {
			driver.findElement(loginlink).click();
		}
	public void login(String mail,String pass ) {
		
		driver.findElement(email).sendKeys( mail);
		driver.findElement(password).sendKeys(pass);
	}
	public  void click() {
		
	
		driver.findElement(loginbutton).click();
	}	
		
	public void logout1() {
		driver.findElement(setting).click();
		driver.findElement(logout).click();
	}
		
		
		
		
	
}
