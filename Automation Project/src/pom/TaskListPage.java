package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.baseclass;

public class TaskListPage{
	public WebDriver driver;

	@FindBy(xpath="(//div[@class='downIcon'])[1]")
	private WebElement addnew;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterNmae;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	@FindBy(xpath="(//div[@class='emptySelection'])")
	private WebElement dropdown;
	@FindBy(xpath="//div[@class='searchItemList']/child::div[text()='Big Bang Company']")
	private WebElement bigban;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomer;
	@FindBy(id="//div[@id='customerLightBoxCloseButton']")
	private WebElement intu;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void setAddnew() {
		try {
			addnew.click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public void setNewcustomer() {
		newcustomer.click();;
	}

	public void setEnterNmae() {
		enterNmae.sendKeys("vardhan1");
	}

	public void setDescription() {
		description.sendKeys("forming");
	}

	public void setDropdown() {
		dropdown.click();
	}

	public void setBigban() {
		bigban.click();
	}

	public void setCreatecustomer() {
		createcustomer.click();
	}
	public void setintu() {
		intu.click();
	}
}