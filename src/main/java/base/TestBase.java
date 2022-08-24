package base;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import util.PropertiesFileReader;

public class TestBase extends PropertiesFileReader {
	
	protected static WebDriver driver;
	public static String baseUrl;
	
	public static WebDriver initialize() {
		
		readProperties();

		String browser = prop.get("browser").toString();
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shuhr\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		try {
			baseUrl = prop.get("url").toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return driver;
	}
}
