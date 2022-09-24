package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class assertion {

	
   @Test
   public  void assertion() {
	   System.setProperty("webdriver.chrome.driver", "C:\\extract\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	   
	   
	   String expected_title="wellcome to fb ";
	   String actual_title=driver.getTitle();
	   Assert.assertEquals(expected_title, actual_title);
	   
	   SoftAssert sassert=new SoftAssert();
	 //  String expected_title1="wellcome to fb ";
	  // String actual_title1=driver.getTitle();
	  
	   sassert.assertEquals(actual_title, expected_title);
	   sassert.assertAll();
   }
	}


