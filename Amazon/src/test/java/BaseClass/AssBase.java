package BaseClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.AmazonObj;

public class AssBase {

	public static WebDriver driver = null;
	public static AmazonObj amzn = null;


	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		amzn = new AmazonObj(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	}
}
