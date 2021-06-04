package roofstacks.homework;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.junit.Assert;
import pageObjects.Careerpage;
import pageObjects.Homepage;
import resources.Base;

public class TestHomework extends Base {
	
	public Homepage hp;
	public Careerpage cp;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	@Test(priority = 0)
	public void goRoofStacksPage() throws InterruptedException {

		hp= new Homepage(driver);
		hp.goRoofStacks();
		
	}
	@Test(priority = 1)
	public void goCareerPage() throws InterruptedException {

		hp.careerPage().click();
	}
	@Test(priority = 2)
	public void goProductPosition()
	{
		cp= new Careerpage(driver);
		cp.productPosition().click();
	}
	@Test(priority = 3)
	public void goLeadProductTesterPage()
	{
		cp.leadProduct().click();
	}
	@Test(priority = 4)
	public void checkLeadProductTesterPage()
	{
		Assert.assertEquals(getProp().getProperty("pageTitle"), cp.checkPage());
	}
	@Test(priority = 5)
	public void sendCV()
	{
		cp.sendCV();
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
}
