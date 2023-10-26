package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	public Login_Page(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	     this.driver=driver;
	}
	
	@FindBy(id="username")
    private WebElement textFieldUserName;
    @FindBy(name="pwd")
    private WebElement tfPassword;
    @FindBy(id="loginButton")
    private WebElement btnLogin;
    @FindBy (id="logoutLink")
    private WebElement logot;
    
    /** 
     * Description: This method is used to Login to the application
     * 
     * @author CHANDRA OBULA REDDY
     * @param username
     * @param password
     */
    public void loginToTheApplica(String username,String password) {
    	try {
    		textFieldUserName.sendKeys(username);
			tfPassword.sendKeys(password);
			btnLogin.click();
			System.out.println("Logged in");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to login to the application");
		}
    	
    }
    
    
    /** 
     * Description: This method is used to Logged out from the application
     * 
     * @author CHANDRA OBULA REDDY
     */
    public void logoutFromTheApplica() {
    	try {
			logot.click();
			System.out.println("Logged out");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to log out from the application");
		}
    	
    }
    

}
