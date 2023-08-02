package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base{
	
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		
			FileInputStream file = ;
			try {
				file = new FileInputStream("C:\\Users\\User\\Automation\\Swaglab\\src\\test\\java\\Resources\\env.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Properties prop= new Properties();
				try {
					prop.load(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	
	public void user_launch_site_url() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}

}