package com.CalendarPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClasses.Library;
import com.reusableFunctions.SeleniumUtilities;

public class CRMCalendarPage extends Library {
	WebDriver driver;
	@FindBy(xpath="//*[@id='ui']/div[1]/div[1]/a[2]/span[1]")
	WebElement calendar;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement newCalBtn;
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	@FindBy(xpath="//div[@name='calendar']")
	WebElement calDropDown;
	@FindBy(xpath="//div[@class='visible menu transition']/div[5]")
	WebElement selectCal;
	@FindBy(xpath="//*[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement startDate;
	@FindBy(xpath="//*[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement endDate;
	@FindBy(xpath="//*[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement saveBtn;
	
	SeleniumUtilities su;






	public CRMCalendarPage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnCalendar() {
		calendar.click();
	}
	public void clickOnNew() {
		newCalBtn.click();
	}

	public void enterTitleValues(String titleName) {
		title.sendKeys(titleName);		
	}
	public void enterCalendarValue() {
		calDropDown.click();
		selectCal.click();

	}
	public void enterStartDate(String date) {
		String dat1 = startDate.getAttribute("type");
		System.out.println(dat1);
		su  =new SeleniumUtilities(driver);
		su.datePickerwithJS(startDate, date);

	}

	public void enterEndDate(String date) {
		
		su.datePickerwithJS(endDate, date);
	}
	public void clickOnSaveBtn() {
		saveBtn.click();
	}





}

}
