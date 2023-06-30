package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public WebDriver driver; 
	@FindBy(id="username")
	private WebElement usernametext;
	@FindBy(name="pwd")
	private WebElement pwdtext;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbton;

	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setlogin(String usrname,String password) {
		usernametext.sendKeys(usrname);
		pwdtext.sendKeys(password);
		loginbton.click();
	}
}

