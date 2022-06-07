package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import  io.github.bonigarcia.wdm.WebDriverManager;
import utility.constant;

public class ravi {




	    public ravi()
	    {

	         WebDriverManager.chromedriver().setup();
	         WebDriver driver = new ChromeDriver();
	         driver.get("http://automationpractice.com/");
	         driver.manage().window().maximize();



	          String[] search = {"T-SHIRTS","WOMEN","DRESSES"};


	          for (String element : search) {
	        	  driver.findElement(By.id("search_query_top")).sendKeys(element);


	        	  driver.findElement(By.name("submit_search")).click();
	        	  driver.findElement(By.id("search_query_top")).clear();

	          }

	          constant sd = new constant();

	          driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	          driver.findElement(By.id("email")).sendKeys(constant.username);
	          driver.findElement(By.name("passwd")).sendKeys(constant.password);
	          driver.findElement(By.id("SubmitLogin")).click();


	    }
	}






