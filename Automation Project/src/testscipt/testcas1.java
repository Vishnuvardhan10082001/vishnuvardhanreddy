package testscipt;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.baseclass;
import pom.TaskListPage;
import pom.homepage;
import pom.loginpage;
@Listeners(pom.Listeners.class)
public class testcas1  extends baseclass  {
	@Test
	public void createCustomer() throws InterruptedException {
		loginpage lp=new loginpage(driver);

		homepage hp=new homepage(driver);


		hp.settasktab();
		TaskListPage tlp=new TaskListPage(driver);
		Thread.sleep(4000);
		tlp.setAddnew();
		Thread.sleep(4000);
		System.out.println("set add new ");
		tlp.setNewcustomer();
		Thread.sleep(4000);
		System.out.println("set new customer");
		tlp.setEnterNmae();
		Thread.sleep(4000);
		System.out.println("set enter name");
		tlp.setDescription();
		Thread.sleep(4000);
		System.out.println("set description");
		tlp.setDropdown();
		Thread.sleep(4000);
		System.out.println("set drop down");
		tlp.setBigban();
		Thread.sleep(4000);
		System.out.println("set big ban");
		tlp.setCreatecustomer();
		Thread.sleep(4000);
		System.out.println("set create custmer here");
		tlp.setintu();

	}	
}
