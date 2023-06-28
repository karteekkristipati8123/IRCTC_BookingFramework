package base_pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Page {
	public static WebDriver driver;
	public static Properties prop;

	public void Base()
		{		
		try {
				prop = new Properties();
				FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
				prop.load(fis);
				}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
				
		}
		

	public static void takescreenshot(WebDriver driver,String filename) throws IOException
	{
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("//Screenshots//"+filename+".png"));
	}
	
	public static void setup() throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctctourism.com/");
	
		Thread.sleep(5000);
	}

}
