package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	WebDriver wdriver;
	  @Test
	  public void f() {
			wdriver.manage().window().maximize();
			wdriver.get("http://newtours.demoaut.com");
			wdriver.findElement(By.linkText("SIGN-ON"));
			wdriver.findElement(By.name("userName")).sendKeys("testing");
			wdriver.findElement(By.name("password")).sendKeys("testing");
			wdriver.findElement(By.name("login")).click();;
	  }
	  @BeforeTest
	  public void beforeTest() {
		  String absolutePath=System.getProperty("user.dir");
		  String filePath=absolutePath+"//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", filePath);
			//System.setProperty("webdriver.chrome.driver",
			//		"C:\\WorkSpace\\eclipse-workspace\\Flight_Reservation\\chromedriver.exe");
			wdriver = new ChromeDriver();
	  }

	  @AfterTest
	  public void afterTest() {
		  wdriver.quit();	
	  }
		
}	