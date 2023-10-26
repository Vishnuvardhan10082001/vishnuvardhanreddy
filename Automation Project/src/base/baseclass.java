
package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.common;
import pom.homepage;
import pom.loginpage;

public class baseclass {

	public static WebDriver driver;
	loginpage lp;
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@BeforeClass
	public void openbroswer() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		loginpage lp=new loginpage(driver);
		common co=new common();
		String url = co.property("url");
		String usn = co.property("usn");
		String psw = co.property("psw");
		driver.get(url);
		Thread.sleep(6000);
		lp.setlogin(usn, psw);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	@AfterMethod
	public void loggedout() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		homepage hp=new homepage(driver);
		hp.setlogout();
	}
	@AfterClass
	public void closebroswer() {
		driver.close();
	}


}
