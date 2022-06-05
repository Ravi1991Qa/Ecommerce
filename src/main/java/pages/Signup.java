package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newpackage.Ecommerce;

public class Signup extends Ecommerce {


		public Signup()
		{
			PageFactory.initElements(driver, this);
			
			}
		
		@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
		WebElement SignupClcik;
		
		@FindBy(id="email")
		WebElement email;
		
		@FindBy(name="passwd")
		WebElement password;
		
		@FindBy(id="SubmitLogin")
		WebElement submit;
		
		
		
		
		
		
		public void Signup() throws Throwable
		{
			Thread.sleep(2000);
			SignupClcik.click();
			
			email.sendKeys(Ecommerce.getProperty("username"));
			password.sendKeys(Ecommerce.getProperty("password"));
			submit.click();
			
			
			
			}
		
		
		
		
	
		
		
		
		
		
		}



