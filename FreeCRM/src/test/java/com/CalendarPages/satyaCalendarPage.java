package com.CalendarPages;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.reusableFunctions.SeleniumUtilities;

	public class satyaCalendarPage{
		WebDriver driver;

		@FindBy(xpath = "//*[@id=\"main-nav\"]/div[2]/a/i")
		WebElement calendarIcon;
		@FindBy(xpath = "//button[@class='ui linkedin button']")
		WebElement newBtn;
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")
		WebElement title;
		@FindBy(xpath = "//div[@name='calendar']")
		WebElement calDD;
		@FindBy(xpath = "//div[@name='calendar']/div/div/span")
		List<WebElement> calList;
		@FindBy(xpath = "//input[@name='calendarName']")
		WebElement newCalName;
		@FindBy(xpath = "//div[@class='ui small modal transition visible active']/div[3]/button[2]/i")
		WebElement newCalSave;
		@FindBy(xpath = "//div[@class='visible menu transition']/div[4]/span")
		WebElement calName;
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input")
		WebElement startDate;
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/div/input")
		WebElement endDate;

		@FindBy(xpath = "//div[@name='category']/i")
		WebElement categoryDD;
		@FindBy(xpath = "//div[@class='visible menu transition']/div[@name='category']/span")
		List<WebElement> categoryList;

		@FindBy(xpath = "//div[@class='ui toggle checkbox']/input")
		WebElement allDayToggleBox;

		@FindBy(xpath = "//div[@name='task']/input")
		WebElement task;
		@FindBy(xpath = "//div[@name='task']/div/div/span")
		WebElement addTask;

		@FindBy(xpath = "//div[@name='minutesBefore']/i")
		WebElement alertBefore;
		@FindBy(xpath = "//div[@name='minutesBefore']/div[2]/div")
		List<WebElement> alertList;

		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")
		WebElement tag;
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div/div/span")
		List<WebElement> tagList;
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div/div[@data-additional='true']/span")
		WebElement addTag;

		@FindBy(xpath = "//div[@name='deal']/input")
		WebElement deal;
		@FindBy(xpath = "//div[@name='deal']/div[2]/div/span")
		List<WebElement> dealList;
		@FindBy(xpath = "//div[@name='deal']/div/div[@data-additional='true']/span")
		WebElement addDeal;

		@FindBy(xpath = "//div[@name='company']/input")
		WebElement company;

		@FindBy(xpath = "//textarea[@name='description']")
		WebElement description;

		@FindBy(xpath = "//button[@class='ui linkedin button']/i")
		WebElement saveBtn;

		@FindBy(xpath = "//textarea[@name='location']")
		WebElement location;

		@FindBy(xpath = "//div[@name='case']/input")
		WebElement caseSearch;
		@FindBy(xpath = "//div[@class='field'][1]/div/div/span/p")
		WebElement finalTitle;
		
		
		@FindBy(xpath="//button/span[text()='Day']")
		WebElement dateBtn;

		public satyaCalendarPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void clickOnCalIcon() {
			Actions action = new Actions(driver);
			action.click(calendarIcon).build().perform();
			// calendarIcon.click();
		}

		public void clickOnNewBtn() {
			newBtn.click();
		}

		public void enterTitle(String titleName) throws Exception {
			title.clear();
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(title).build().perform();
			action.sendKeys(title, titleName).build().perform();
			// title.sendKeys(titleName);
		}

		/*
		 * public void enterNewCal(String calName) { calDD.click(); List<WebElement>
		 * newList = driver.findElements(calList); int size = newList.size(); int
		 * last=size-1; newList.get(last).click(); newCalName.sendKeys(calName);
		 * newCalSave.click();
		 * 
		 * }
		 */
//		public void enterCalendarName() {
//			calDD.click();
//			calName.click();
//		}

		public void enterExistingCalendar(String calName) {
			calDD.click();
			for (WebElement cal : calList) {
				if (cal.getText().equals(calName)) {
					cal.click();
				}

			}

		}

		public void enterNewCalendarName(String Name) {
			calDD.click();
			int size = calList.size();
			int last = size - 1;
			calList.get(last).click();
			newCalName.sendKeys(Name);
			newCalSave.click();
			enterExistingCalendar(Name);

		}

		/*
		 * public void enterCalendarName(String cal) { calDD.click(); for(int
		 * i=0;i<calList.size();i++) { if(calList.get(i).getText().equals(cal))
		 * calList.get(i).click();
		 * 
		 * else enterNewCalendarName(cal); } }
		 */
		public void enterStartDate(String sdate) {
			startDate.clear();
			startDate.sendKeys(sdate);
		}

		public void enterEndDate(String edate) throws Exception {
			endDate.clear();
			Thread.sleep(2000);
			endDate.clear();
			endDate.sendKeys(edate);
		}

		public void selectCategory(String catName) {
			categoryDD.click();
			for (WebElement category : categoryList) {
				if (category.getText().equals(catName)) {
					category.click();
				}

			}

		}

		public void clickOnAllDay() {
			if (!allDayToggleBox.isSelected()) {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click()", allDayToggleBox);
				// allDayToggleBox.click();

			}

		}

		public void addTask(String taskNames) {

			task.click();
			task.sendKeys(taskNames);
			task.sendKeys(Keys.ENTER);

		}

		public void selectAlertTime(String time) {
			alertBefore.click();
			for (WebElement alert : alertList) {
				if (alert.getText().equals(time)) {
					alert.click();
					break;
				}

			}
		}

		public void enterTagValue(String tagName) throws Exception {
			tag.click();
			tag.sendKeys(tagName);
			Thread.sleep(1000);
			tag.sendKeys(Keys.ENTER);
		}

		public void enterDeals(String dealValues) {
			deal.click();
			deal.sendKeys(dealValues);
			deal.sendKeys(Keys.ENTER);

		}

		public void enterCompany(String companyName) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			company.sendKeys(companyName);
			company.sendKeys(Keys.ENTER);

		}

		public void clickOnSaveBtn() {
			saveBtn.click();
		}

		public void enterDescription(String des) {
			description.sendKeys(des);
		}

		public void enterLocation(String loc) {
			location.sendKeys(loc);
		}

		public void enterCase(String caseName) {
			caseSearch.sendKeys(caseName);
			caseSearch.sendKeys(Keys.ENTER);
		}

		public String getEventTitle() {
			return finalTitle.getText();
		}

	
	}
	

