package newpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Addtocart;
import pages.Navigation;
import pages.Searchpage;


public class AppTest extends Ecommerce
{
   Ecommerce Ecommercesearch;
   
   @BeforeMethod
   // Opening the Websiteurl
   
    public void shouldAnswerWithTrue() throws Throwable
    {
    	Ecommercesearch=new Ecommerce();
    	Thread.sleep(2000);
    	Ecommercesearch.sear(Ecommerce.getProperty("browser"));
    	
    	
    	
       
    }
   
   @Test(priority=0)
   public void Show() throws Throwable
   {
	   Searchpage search = new Searchpage();
     	search.newsearch();
	   
   }
   
   @Test(priority=1)
   public void how() throws Throwable 
   {
   
	   Searchpage search = new Searchpage();
	   search.earch();
   }
   
   @Test(priority=2) 
   public void ignup() throws Throwable
   {
	   pages.Signup sign = new pages.Signup();
	    sign.Signup();
   }
   
   @Test(priority=3) 
   public void Nav() throws Throwable
   {
	Navigation nav_women =new Navigation();
	nav_women.Nav_Women();
	
   }
   
   @Test(priority=4) 
   public void Nav_dres() throws Throwable
   {
	Navigation nav_dress =new Navigation();
	nav_dress.Dress();
	
   }
   
   
   @Test(priority=5) 
   public void Add_cart() throws Throwable
   {
	Addtocart shop =new Addtocart();
	shop.addtocart();
	
   }
   
   @AfterMethod
   public void screenshot() throws IOException
   {
	   TakesScreenshot scr= ((TakesScreenshot)driver);
       File file1= scr.getScreenshotAs(OutputType.FILE);
       
      FileUtils.copyFile(file1, new File("C:\\Users\\manideepreddy\\eclipse-workspace\\Ecommeice\\Screenshot.png"));
      
   }
   
   
   
}
