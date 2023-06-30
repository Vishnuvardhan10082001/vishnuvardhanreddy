package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	public WebDriver driver;

	@FindBy(id="logoutLink")
	private WebElement loggedout;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasktab;
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setlogout() {
		loggedout.click();
	}
	public void settasktab() {
		tasktab.click();
	}
}
