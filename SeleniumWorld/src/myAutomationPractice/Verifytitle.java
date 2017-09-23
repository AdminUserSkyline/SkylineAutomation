package myAutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

  public class Verifytitle {

	public static void main(String[] args) {
	 WebDriver driver=new InternetExplorerDriver();
    driver.get("https://www.google.com.au/?gfe_rd=cr&ei=LgA1Wey0FdLu8weFjJDwBg&gws_rd=ssl");
	 String Title = driver.getTitle();
	 if (Title.equals("Google"))
      System.out.print("Test passed");
	 else
	 System.out.print("Test failed");
	 driver.close();
	}
  }
