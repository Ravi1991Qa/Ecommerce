package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newpackage.Ecommerce;

public class Addtocart  extends Ecommerce
{




		public Addtocart()
		{
			PageFactory.initElements(driver, this);

			}

		@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
		WebElement addtocart;

		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]")
		WebElement shoppingcart;

		@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
		WebElement add;


		@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
		WebElement quantity;



		@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
		WebElement cart;




		public void addtocart() throws Throwable
		{
			addtocart.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			shoppingcart.click();
			Thread.sleep(2000);
			quantity.click();
			add.click();
			Thread.sleep(2000);
			cart.click();




	          }

			}













