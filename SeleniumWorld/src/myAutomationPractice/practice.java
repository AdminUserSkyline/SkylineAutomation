package myAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class practice extends SuperClass{
	  
	private By firstNameTxt           =       By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[1]/input");
	private By lastNameTxt            =       By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input");
	private By addressTxt                =       By.xpath(".//*[@id='basicBootstrapForm']/div[2]/div/textarea");
	private By emailTxt                  =       By.xpath("//*[@id='eid']/input");
	private By contactNumberEdtbox          =       By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input");
	private By gender                 =       By.xpath( "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input");
    private By hobbies1               =       By.id("checkbox1");
    private By hobbies2               =       By.id("checkbox2");
    private By skills                 =       By.id("Skills");
    private By countryName            =       By.cssSelector("[id='countries']");
    private By selectCountryNameLst   =       By.cssSelector("[id='country']");
    private By year                   =       By.id("yearbox");
    private By month                  =       By.xpath(".//*[@id='basicBootstrapForm']/div[11]/div[2]/select");
    private By date                   =       By.xpath(".//*[@id='daybox']");
          
    private By password               =       By.xpath(".//*[@id='firstpassword']");       
	private By confirmPassword        =       By.xpath(".//*[@id='secondpassword']");
	private By submitBtn              =       By.xpath(".//*[@id='submitbtn']");
	
	private WebDriver driver = null;
	  
	@BeforeTest            
	public void setDriver(){
		driver = super.driver;
	}
	               
	@Test
	public void runTest() throws InterruptedException{
	driver.get("http://demo.automationtesting.in/Register.html");
	String url=driver.getCurrentUrl();
	System.out.println("This is the current Url  : "+url);
	
	Inputhandler(firstNameTxt,"Neha");
	Inputhandler(lastNameTxt,"Sharma");
	Inputhandler(addressTxt,"sydney ");
	Inputhandler(emailTxt,"test@gmail.com");
	Inputhandler(contactNumberEdtbox,"1344365");
	
	
	 elementToBeClicked(gender);
	  shortWait(1000);
	  elementToBeClicked(hobbies1);
	  elementToBeClicked(hobbies2);
      shortWait(1000);
	
	
	selectFromDropdownByValue(skills,"C++");
     shortWait(1000);
	
	selectFromDropdownByValue(countryName,"Australia");
	waitforElement(selectCountryNameLst);
	shortWait(5000);
	
	selectFromDropdownByValue(selectCountryNameLst,"India");
	waitforElement(year);
	
	selectFromDropdownByVisibleText(year,"1988");
	waitforElement(month);
	
    selectFromDropdownByVisibleText(month,"10");
	waitforElement(date);
	
	selectFromDropdownByVisibleText(date,"16");
	shortWait(5000);
	
	waitforElement(password);
	
	Inputhandler(password,"alliswell");	
	Inputhandler(confirmPassword,"alliswell");
	
	
	elementToBeClicked(submitBtn);
	
	}
	}