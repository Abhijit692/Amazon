package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonObj {


	public AmazonObj(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	public WebElement obj_search;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement obj_clk;

	@FindBy(xpath = "//span[text()='Lenovo 300 Wired USB Mouse, GX30M39704']")
	public WebElement obj_mouse;

	@FindBy(id = "buy-now-button")
	public WebElement obj_buy;

	@FindBy(id = "ap_email")
	public WebElement obj_email;

	@FindBy(className = "a-button-input")
	public WebElement obj_btn;

	@FindBy(id="ap_password")
	public WebElement obj_password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	public WebElement obj_login;

	@FindBy(xpath = "//h1[contains(text(),'Select a payment method')]")
	public WebElement obj_payment;
}
