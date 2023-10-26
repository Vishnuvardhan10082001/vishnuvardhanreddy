package demo;

import org.testng.annotations.Test;

import Basecl.baseclass;
import pom.Login_Page;

public class Demo1 extends baseclass{

	@Test
	public void test() {
		
		Login_Page login=new Login_Page(driver);
		
		login.loginToTheApplica(usa, psw);
		
		login.logoutFromTheApplica();
		
	}
}
