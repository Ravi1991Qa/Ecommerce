package newpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce {
	
	 public static WebDriver driver;
	 public static Properties Ecommerce;
	
	public Ecommerce()
	 {
		 Ecommerce =new Properties();
		 try {
			Ecommerce.load(new FileInputStream("C:\\Users\\manideepreddy\\eclipse-workspace\\Ecommeice\\src\\main\\java\\newpackage\\Ecommerce.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
	 public void sear(String string)
		{
		 String ho=Ecommerce.getProperty("browser");
			if(ho.equals("chrome"))
			{
				 WebDriverManager.chromedriver().setup();
		        driver= new ChromeDriver();
			}
			else if(ho.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
		        driver= new FirefoxDriver();
				}
			
			
			driver.get(Ecommerce.getProperty("url"));
			driver.manage().window().maximize();
			}
	
}
