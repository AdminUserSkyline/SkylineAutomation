package passionTeaCompany_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myAutomationPractice.SuperClass;

public class pageObjects_HomePage extends SuperClass{
	
	private By welcomeLink               =        By.xpath("//*[@id=wsb-nav-00000000-0000-0000-0000-000450914915]/ul/li[1]/a");
	
	private By ourPassionLink            =        By.xpath("//*[@id=wsb-nav-00000000-0000-0000-0000-000450914915]/ul/li[2]/a");
	private By menulink                  =        By.xpath("//*[@id=wsb-nav-00000000-0000-0000-0000-000450914915]/ul/li[3]/a");
	private By letsTalkTeaLink           =        By.xpath("//*[@id=wsb-nav-00000000-0000-0000-0000-000450914915]/ul/li[4]/a");
	private By checkOutLink		         =        By.xpath("//*[@id=wsb-nav-00000000-0000-0000-0000-000450914915]/ul/li[5]/a");
			
	private By herbalTeaCollectionBtn    =        By.xpath("//*[@id=wsb-button-00000000-0000-0000-0000-000450914890]/span");
	private By looseTeaCollectionBtn     =        By.xpath("//*[@id=wsb-button-00000000-0000-0000-0000-000450914897]/span");
	private By flavoredTeaCollectionBtn  =        By.xpath("//*[@id=wsb-button-00000000-0000-0000-0000-000450914899]/span");
		
	private WebDriver driver = null;
	
	
	@BeforeTest            
	public void setDriver(){
		driver = super.getDriver();
	}
	
	/**
	 * Function to click on Welcome Link
	 * @throws InterruptedException
	 */
	;
	@Test
	public void clickOnWelcomeLnk() throws InterruptedException{
		driver.findElement(welcomeLink).click();
		shortWait(2);
		
		
	}
	/**
	 * Function to click on passion Link
	 * @throws InterruptedException
	 */public void clickOnPassionTeaLink() throws InterruptedException{
			driver.findElement(ourPassionLink).click();
			shortWait(2);
	 }
		/**
		 * Function to verify if Our passion text is displayed
		 */

	 
			public boolean isPassionLinkDisplayed(){
				boolean value = driver.findElement(ourPassionLink).isDisplayed();
				return value;
		}
	 /**
		 * Function to click on Menu Link
		 * @throws InterruptedException
		 */
	
		 public void clickOnMenuLink() throws InterruptedException{
				driver.findElement(menulink).click();
				shortWait(2);
			}
		 /**
			 * Function to click on LetsTalkTeaLink
			 * @throws InterruptedException
			 */
	 
	 public void clickOnletsTalkTeaLink () throws InterruptedException{
					driver.findElement(letsTalkTeaLink).click();
					shortWait(2);
				}
			 /**
				 * Function to click on checkOnLink
				 * @throws InterruptedException
				 */
	 
	 public void checkOnLink () throws InterruptedException{
						driver.findElement(checkOutLink).click();
						shortWait(2);
					}
	
	/**
	 * Function to verify if herbal tea Btn is displayed
	 */
	 
	public boolean isHerbalTeaBtnDisplayed(){
		boolean value = driver.findElement(herbalTeaCollectionBtn).isDisplayed();
		return value;
	}
	/**
	 * Function to click on see herbal tea collection
	 * @throws InterruptedException
	 */
	public void clickOnHerbalTeaCollectionBtn() throws InterruptedException{
		driver.findElement(herbalTeaCollectionBtn).click();
		shortWait(2);
	}
	
	/**
	 * Function to click on see Loose tea collection
	 * @throws InterruptedException
	 */
	
	public void clickOnLooseTeaBtn() throws InterruptedException{
		driver.findElement(looseTeaCollectionBtn).click();
		shortWait(2);
	}
	
	/**
	 * Function to click on flavored tea collection
	 * @throws InterruptedException
	 */
	
	public void clickOnflavoredTeaBtn() throws InterruptedException{
		driver.findElement(flavoredTeaCollectionBtn).click();
		shortWait(2);
	}
	
	/**
	 * Function to navigate to Home page
	 * @throws InterruptedException 
	 */
	@Test
	public void navigateToHomePage(String URL) throws InterruptedException{
		navigateToSpecifiedURL(URL);
	}
	
	
}
