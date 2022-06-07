package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newpackage.Ecommerce;

public class Navigation extends Ecommerce {

	public Navigation()
	{
		PageFactory.initElements(driver, this);

		}

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement Clcik;

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement Nav;

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement Dress;

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
	WebElement causaldress;






	public void Nav_Women() throws Throwable
	{

		Actions act =new Actions(driver);
		  act.moveToElement(Nav).perform();
		  Thread.sleep(2000);
		  Clcik.click();


		}

	public void Dress() throws Throwable
	{

		Actions act =new Actions(driver);
		  act.moveToElement(Dress).perform();
		  Thread.sleep(2000);
		  causaldress.click();


		}







}
