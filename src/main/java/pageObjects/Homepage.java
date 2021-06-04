package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Homepage extends Base {
	
	private By google = By.cssSelector("[title='Ara']");
	private By link= By.xpath("//a[@href='https://roofstacks.com/']");
	private By career = By.cssSelector("[title='Career']");
	
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
								
	}
	
	public void goRoofStacks()
	{
		driver.get("https://www.google.com.tr/");
		driver.findElement(google).sendKeys("Roof Stack Yazılım");
		driver.findElement(google).sendKeys(Keys.ENTER);
		driver.findElement(link).click();
	}
	public WebElement careerPage() 
	{
		return driver.findElement(career);
	}

	
}
