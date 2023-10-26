
package Basecl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseclass {
	public static WebDriver driver;
	 public static genericclass g1=new genericclass();;
	 public static WebElement us;
	 public static WebElement pwd;
	 public static	 WebElement log;
	 public static WebElement logot;
	 
	 public static String url;
	 public static String usa;
	 public static String psw;
	
    static {
    	try {
    		url = g1.property("url");
    		usa = g1.property("usn");
    		psw = g1.property("psw");
            }catch (Exception e) {
            e.printStackTrace();
            }
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
    @Test
    @BeforeClass
	public  static void base() throws InterruptedException, IOException {
		
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    System.out.println("Browser opened successfully");
	}
    
    @BeforeMethod
    public static  void setlogin() throws IOException, InterruptedException {
    	
    	
		driver.get(url);
//		System.out.println("Entered URL "+url);
//		Thread.sleep(2000);
//          us.sendKeys(usa);
//          Thread.sleep(2000);
//          pwd.sendKeys(psw);
//          log.click();
          System.out.println("Logged in suuccessfully");
    }
    
    
    @AfterMethod
    public static void setlogout() {
//    logot.click();
    System.out.println("Logged out");
}
    @AfterClass(alwaysRun = true)
    public static void closeme(){
    	driver.quit();
    	
    	System.out.println("Closed browser");
    }
}


