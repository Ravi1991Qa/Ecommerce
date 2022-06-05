package newpackage;

import  io.github.bonigarcia.wdm.WebDriverManager;
import utility.constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ravi {
	
	

	
	    public ravi()
	    {
	        
	         WebDriverManager.chromedriver().setup();
	         WebDriver driver = new ChromeDriver();
	         driver.get("http://automationpractice.com/");
	         driver.manage().window().maximize();
	        
	        
	         
	          String[] search = {"T-SHIRTS","WOMEN","DRESSES"};
	          
	          
	          for(int i = 0;i<search.length;i++)
	          {
	        	  driver.findElement(By.id("search_query_top")).sendKeys(search[i]);
	        	 
	        	  
	        	  driver.findElement(By.name("submit_search")).click();
	        	  driver.findElement(By.id("search_query_top")).clear();
	        	  
	          }
	          
	          constant sd = new constant();
	          
	          driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	          driver.findElement(By.id("email")).sendKeys(sd.username);
	          driver.findElement(By.name("passwd")).sendKeys(sd.password);
	          driver.findElement(By.id("SubmitLogin")).click();
	          
	          
	    }
	}






