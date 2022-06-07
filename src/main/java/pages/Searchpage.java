package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newpackage.Ecommerce;




	public class Searchpage extends Ecommerce



	{

		public Searchpage()
		{
			PageFactory.initElements(driver, this);

			}

		@FindBy(id="search_query_top")
		WebElement Search;

		@FindBy(id="search_query_top")
		WebElement Clear;

		@FindBy(name="submit_search")
		WebElement submit;





		public void earch() throws Throwable
		{
			 String[] search = {"T-SHIRTS","WOMEN","DRESSES"};


	          for (String element : search) {
	        	Search.sendKeys(element);
	        	  submit.click();
	        	 Clear.clear();

	          }

			}

		public void newsearch()
		{
			Search.sendKeys("T-SHIRTS");
			Clear.clear();
		}








		}

