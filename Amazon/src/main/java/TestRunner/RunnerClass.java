package TestRunner;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.AssBase;


public class RunnerClass extends AssBase{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();

	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void Amazon()
	{

		try {
			driver.navigate().to("https://www.amazon.in");
			amzn.obj_search.sendKeys("mouse"); 
			amzn.obj_clk.click();
			amzn.obj_mouse.click();
			String Parent_Window = driver.getWindowHandle();
			// Switching from parent window to child window
			for (String Child_Window : driver.getWindowHandles())
			{
				driver.switchTo().window(Child_Window);
			}
			amzn.obj_buy.click();
			amzn.obj_email.sendKeys("abhijit.hath@gmail.com");
			amzn.obj_btn.click();
			amzn.obj_password.sendKeys("12345Abhi");
			amzn.obj_login.click();
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Select a payment method')]")));
			System.out.println("Payment Page:"+amzn.obj_payment.getText());


		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
