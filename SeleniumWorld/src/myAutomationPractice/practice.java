package myAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class practice extends SuperClass{
	  
	private By firstNameTxt           =               By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[1]/input");
	private By lastNameTxt                   =        By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input");
	private By addressTxt                    =        By.xpath(".//*[@id='basicBootstrapForm']/div[2]/div/textarea");
	private By emailTxt                      =        By.xpath("//*[@id='eid']/input");
	private By contactNumberEdtbox           =        By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input");
	private By genderRadBtn                  =        By.xpath( "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input");
    private By hobbies1chkbox                =        By.id("checkbox1");
    private By hobbies2chkbox                =        By.id("checkbox2");
    private By skillsDropdown                =        By.id("Skills");
    private By countryName                   =        By.cssSelector("[id='countries']");
    private By selectCountryNameLst          =        By.cssSelector("[id='country']");
    private By yearDropdown                  =        By.id("yearbox");
    private By monthDropdown                 =        By.xpath(".//*[@id='basicBootstrapForm']/div[11]/div[2]/select");
    private By dateDropdown                  =        By.xpath(".//*[@id='daybox']");
    private By passwordtxtBox                =        By.xpath(".//*[@id='firstpassword']");       
	private By confirmPassword               =        By.xpath(".//*[@id='secondpassword']");
	private By submitBtn                     =        By.xpath(".//*[@id='submitbtn']");
	
	//for testcase 2
	private By firstNameTxt2                 =        By.name("firstname");  
	private By lastNameTxt2                  =        By.name("lastname");
	private By genderRdBtn                   =        By.id("sex-1");
	private By yearsOfExperienceRadBtn       =        By.id("exp-2");
	private By datePickerTxtBx               =        By.id("datepicker");
	private By favouriteTeaChkbox            =        By.id("tea2");
	private By aboutTeaChkbox                =        By.id("tool-2");  
	private By continentsDropdwn             =        By.id("continents");
	private By endOfOrderingTea              =        By.id("selenium_commands");
	private By submit2Btn                    =        By.id("submit");

	
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
	driver.manage().window().maximize();
	inputInTextBox(firstNameTxt,"Neha");
	inputInTextBox(lastNameTxt,"Sharma");
	inputInTextBox(addressTxt,"sydney ");
	inputInTextBox(emailTxt,"test@gmail.com");
	inputInTextBox(contactNumberEdtbox,"1344365");
	
	
	
	 elementToBeClicked(genderRadBtn);
	  shortWait(1000);
	  elementToBeClicked(hobbies1chkbox);
	  elementToBeClicked(hobbies2chkbox);
      shortWait(1000);
	
	
	selectFromDropdownByValue(skillsDropdown,"C++");
     shortWait(1000);
	
	selectFromDropdownByValue(countryName,"Australia");
	waitforElement(selectCountryNameLst);
	shortWait(5000);
	
	selectFromDropdownByValue(selectCountryNameLst,"India");
	waitforElement(yearDropdown);
	
	selectFromDropdownByVisibleText(yearDropdown,"1988");
	waitforElement(monthDropdown);
	
    selectFromDropdownByVisibleText(monthDropdown,"10");
	waitforElement(dateDropdown);
	
	selectFromDropdownByVisibleText(dateDropdown,"16");
	shortWait(5000);
	
	waitforElement(passwordtxtBox);
	
	inputInTextBox(passwordtxtBox,"alliswell");	
	inputInTextBox(confirmPassword,"alliswell");
	elementToBeClicked(submitBtn);
	//driver.close();
	
	}
	@Test
	public void runTest2() throws InterruptedException{
		driver.get("http://www.practiceselenium.com/practice-form.html");
		String url=driver.getCurrentUrl();
		System.out.println("This is the current Url  : "+url);
		
		inputInTextBox(firstNameTxt2 ,"Neha");
		waitforElement(lastNameTxt2);
		
		inputInTextBox(lastNameTxt2,"Sharma");
		waitforElement(genderRdBtn);
		
		elementToBeClicked(genderRdBtn);
		waitforElement(yearsOfExperienceRadBtn);
		
		elementToBeClicked(yearsOfExperienceRadBtn); 
		waitforElement(datePickerTxtBx);
		
		inputInTextBox(datePickerTxtBx,"11 sep 2017"); 
		
		waitforElement(favouriteTeaChkbox );
		elementToBeClicked(favouriteTeaChkbox );
		
		waitforElement(aboutTeaChkbox);
		elementToBeClicked(aboutTeaChkbox);
		
		waitforElement(continentsDropdwn);
		selectFromDropdownByVisibleText(continentsDropdwn,"Asia");
		
		waitforElement(endOfOrderingTea);
		selectFromDropdownByVisibleText(endOfOrderingTea,"Switch Commands");
		
		waitforElement(submit2Btn);
	    elementToBeClicked(submit2Btn);
		shortWait(5000);
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		if(url.contains("http://www.practiceselenium.com/"))
		{ 
			System.out.println("Testcase is passed....");
		}
		else
		{
			System.out.println("Testcase is Failed ........");	
		 }
		
	}
	
	@Test
	public void runtest3(){
		
		driver.findElement(By.cssSelector("a[id='wsb-button-00000000-0000-0000-0000-000450914890'] span[class='button-content wsb-button-content'][style='white-space:nowrap']")).click();
		driver.findElement(By.cssSelector("a[id='wsb-button-00000000-0000-0000-0000-000451955160'] span[class='button-content wsb-button-content'][style='white-space:nowrap']")).click();
	
	
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		if(url2.contains("http://www.practiceselenium.com/check-out.html"))
		{	
			System.out.println("we are on the right path");
		}
		else{
			System.out.println("we are on the wrong path");
		    }
		
	   inputInTextBox(By.id("email"),"genius@gmail.com");
	   inputInTextBox(By.id("name"),"Neha");
	   inputInTextBox(By.id("address"),"Sydney Australia");
	   selectFromDropdownByVisibleText(By.id("card_type"),"Mastercard");
	   inputInTextBox(By.id("card_number"),"1234567812345678");
	   inputInTextBox(By.id("cardholder_name"),"Murli Prasad");
	   inputInTextBox(By.id("verification_code"),"mera naam joker");
	   elementToBeClicked(By.cssSelector("[class='btn btn-primary']"));
	   
	}
	@Test
	public void runtest4(){
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[id='wsb-button-00000000-0000-0000-0000-000450914897'] span[class='button-content wsb-button-content'][style='white-space:nowrap']")).click();
		driver.findElement(By.cssSelector("a[id='wsb-button-00000000-0000-0000-0000-000451959280'] span[class='button-content wsb-button-content'][style='white-space:nowrap']")).click();
		inputInTextBox(By.id("email"),"genius1@gmail.com");
	    inputInTextBox(By.id("name"),"Rudra");
		inputInTextBox(By.id("address")," Australia");
		selectFromDropdownByVisibleText(By.id("card_type"),"Mastercard");
		inputInTextBox(By.id("card_number"),"1234967812345678");
		inputInTextBox(By.id("cardholder_name"),"circuit Prasad");
		inputInTextBox(By.id("verification_code"),"mera nahi joker");
		elementToBeClicked(By.cssSelector("[class='btn btn-primary']"));
		
	}
	
	
}
	
	
	
	
	