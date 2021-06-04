package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Careerpage extends Base {

	private By product = By.xpath("//h4[contains(text(),'Product')]");
	private By leadProduct = By.xpath("//h4[contains(text(),'Lead Product Tester')]");
	private By cvBtn = By.xpath("//small[contains(text(),'Send CV')]");
	private By email = By.id("email");
	private By uploadBtn = By.id("btn_upload");

	public Careerpage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement productPosition() {
		return driver.findElement(product);
	}

	public WebElement leadProduct() {
		return driver.findElement(leadProduct);
	}

	public String checkPage() {
		return driver.getTitle();
	}
	public void sendCV()
	{
		driver.findElement(cvBtn).click();
		driver.findElement(email).sendKeys("Sample Mail");
		driver.findElement(uploadBtn).click();
	}

}
