package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	public WebDriver driver;

	public WebDriver initilizeDriver() throws IOException {
		// To read properties file

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + 	"\\src\\main\\java\\resources\\data.properties");

		Properties prop = new Properties();
		prop.load(fis);

		// load Browser from properties file

		String browserName = prop.getProperty("browser");

		// Choosing browser from Data.Properties file

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Chrome Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			// firefox code
		} 
						
		else if (browserName.equals("IE")) {
			// IE Code
		}

		else {

			System.out.println("You should choose anyone of above browser");

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

	@BeforeMethod
	public void launchBrowser() throws IOException {

		driver = initilizeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

	}

}
