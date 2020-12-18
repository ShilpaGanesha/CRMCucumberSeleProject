package com.DealPages;

import java.sql.DriverManager;
//import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.reusableFunctions.SeleniumUtilities;

public class DealPage {
	WebDriver driver;
	By homedeals = By.xpath("//*[@id=\"main-nav\"]/div[5]/a/i");
	By newdealbutton =By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button");
	By title =By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input");
	
	By assignedTo=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div");
	By assignedTodd=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div");
	By company=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input");
	//By tag =By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/label[2]/div");
	By discription =By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/textarea");
	By comUsd =By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[2]/div/div/input");
    By amoUsd= By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/input");
    By stage= By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div");
    By closed=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/label");
    By status=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div[1]/div/div");
    By nextsteps = By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/textarea");
    By type=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[1]/div/div");
    By source=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[2]/div/div");
    By savedeal = By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]/i");
    By closedat= By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div[1]/div/input");
    By iden =By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[10]/div/div/div/input");
    String DDxpathStage ="//div[@name='stage']";
    By time=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[85]");
   By date=By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input");
                
  String fieldXpathassignesto="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div";
  By tag =By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/label[2]/div");
		 
  
    public DealPage(WebDriver driver) {
    	this.driver =driver;
          }
    public void dealsbutton() throws InterruptedException {
		driver.findElement(homedeals).click();
		//Thread.sleep(3000);
         }
    public void clicknewdeal() throws InterruptedException {
    	driver.findElement(newdealbutton).click();
    	Thread.sleep(3000);
			}	
    
    public void DealsCredsAndSave( List<String> dealrow) throws InterruptedException {
    	//direct data inputs
    	driver.findElement(title).sendKeys(dealrow.get(0));
    	
    	driver.findElement(company).sendKeys(dealrow.get(2));
    	driver.findElement(company).sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	//driver.findElement(closedat).click();
    	
    //	
     driver.findElement(closedat).clear();
    	//driver.findElement(time).click();
    	//driver.findElement(date).click();
   driver.findElement(closedat).sendKeys(dealrow.get(5));
   	driver.findElement(closedat).click();
   	Thread.sleep(3000);
    	Thread.sleep(3000);
    	driver.findElement(closed).click();
    	driver.findElement(amoUsd).sendKeys(dealrow.get(7));
    	driver.findElement(comUsd).sendKeys(dealrow.get(8));
    	driver.findElement(discription).sendKeys(dealrow.get(4));
    	driver.findElement(iden).sendKeys(dealrow.get(14));
    	driver.findElement(assignedTo).sendKeys(dealrow.get(1));;
    	
    	//Dropdown data inputs
    	//DropDown for Stage
     	
    	SeleniumUtilities su =new SeleniumUtilities(driver);
    	
    	su.dropdown("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div","//div[@name='stage']/div/div/span",dealrow.get(9));
    	
    	driver.findElement(source).sendKeys(dealrow.get(10));
   driver.findElement(savedeal).click();
   Thread.sleep(2000);
   driver.findElement(homedeals).click();
   driver.findElement(newdealbutton).click();
        	
   
   
    //TO ENTER MULTIPLE VALUES IN A FIELD
   driver.findElement(tag).click();
   
   
   
   
   
	}
    
      }
    
  /*  public void Discription(String disc) {
    //	driver.findElement(discription).sendKeys(disc);
			}
    public void comission(String comi) {
    	driver.findElement(comUsd).sendKeys(comi);
			}
    public void amount(String amou) {
    	driver.findElement(amoUsd).sendKeys(amou);
			}

    public void Stage (String stag) {
    	driver.findElement(stage).sendKeys(stag);
    	//ADD D
			}
    public void Closed() {
    	driver.findElement(closed).click();
			}
    public void  Status(String statu) {
    	driver.findElement(status).sendKeys(statu);
			}

    public void Type(String typ) {
    	driver.findElement(type).sendKeys(typ);
			}
    public void Source(String sourc ) {
    	driver.findElement(source).sendKeys(sourc);
			}
    public void SaveDeal() {
    	driver.findElement(savedeal).click();
			}
    
    public void Nextsteps(String steps) {
		driver.findElement(nextsteps).sendKeys(steps);
	}
    
    public void ID(String id) {
    	driver.findElement(iden).sendKeys("id");
		
	}*/
    
    
    
   /* public void dealcred(String titl,String disc,String comUSD,String amoUSD,String nexstps) {
    	driver.findElement(title).sendKeys(titl);
    	driver.findElement(discription).sendKeys(disc);
    	driver.findElement(comUsd).sendKeys(comUSD);
		driver.findElement(amoUsd).sendKeys(amoUSD);
		driver.findElement(nextsteps).sendKeys(nexstps);
		driver.findElement(closed).click();
	}*/
   
    /*	  public void dd(String stage,String status,String type,String source) {
    	driver.findElement(westage).click();
    	List<WebElement> stagelist = driver.findElements(By.xpath("//div[@name='stage']"));
    	for (WebElement stag : stagelist) {
			if (stag.getText().equals(stage)) {
				stag.click();
				break;
			}
		}

    	driver.findElement(westatus).click();
    	List<WebElement> statuslist = driver.findElements(By.xpath("//div[@name='status']"));
    	for (WebElement statu : statuslist) {
			if (statu.getText().equals(status)) {
				statu.click();
				break;
			}
		}
			
        	driver.findElement(wetype).click();
    	List<WebElement> typelist = driver.findElements(By.xpath("//div[@name='type']"));
    	for (WebElement type1 : typelist) {
			if (type1.getText().equals(type)) {
				type1.click();
				break;
			}
		}
    	    		
        	driver.findElement(wesource).click();
    	List<WebElement> sourcelist = driver.findElements(By.xpath("//div[@name='source']"));
		for (WebElement source1 : sourcelist) {
			if (source1.getText().equals(source)) {
				source1.click();
				break;
			}
		}
	}*/
    
	 	//  SeleniumUtilities su =new SeleniumUtilities(driver);
	  
	
	  
	  
	  

	  
    
    
    
    


