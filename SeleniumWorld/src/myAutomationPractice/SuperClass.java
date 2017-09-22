package myAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class SuperClass {
	WebDriver driver = null;
	int longWait = 50;
	
	@BeforeTest
	public void test(){
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
	}
	
/**
 * Function to select value from drop down using select by value
 * @param locator
 * @param selectValue
 */
	public void selectFromDropdownByValue(By locator,String selectValue){
		Select sel=new Select(driver.findElement(locator));
		sel.selectByValue(selectValue);
	}
	
	/**
	 *  Function to select value from drop down using select by index
	 * @param locator
	 * @param index
	 */
	public void selectFromDropdownByIndex(By locator,int index){
		Select sel=new Select(driver.findElement(locator));
		sel.selectByIndex(index);
	}
	/**
	 *  Function to select value from drop down using select by visibleText
	 * @param locator
	 * @param visibleText
	 */
	public void selectFromDropdownByVisibleText(By locator,String visibleText){
		Select sel=new Select(driver.findElement(locator));
		sel.selectByVisibleText(visibleText);
	}
	/**
	 *Function to wait for an element
	 * @param locator
	 */
	public void waitforElement(By locator){
	WebDriverWait wait=new WebDriverWait(driver,longWait);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
 /**
  *Function for taking input 
  * @param locator
  * @param input
  */
	public void inputInTextBox(By locator,String input){
	driver.findElement(locator).sendKeys(input);
           		
}
	/**
	 * Function for clickable elements
	 * @param locator
	 */
	public void elementToBeClicked(By locator){
	driver.findElement(locator).click();
	}
	public void shortWait(int a) throws InterruptedException{
		Thread.sleep(a);
	}
	
	
}		
		
			    