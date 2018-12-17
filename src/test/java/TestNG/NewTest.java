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
			wdriver.get("http://ec2-13-233-102-85.ap-south-1.compute.amazonaws.com:3002/");
			
			wdriver.findElement(By.name("login")).sendKeys("devops");
			wdriver.findElement(By.name("password")).sendKeys("test");
			wdriver.findElement(By.name("click")).click();;
	  }
	  @BeforeTest
	  public void beforeTest() {
		  String absolutePath=System.getProperty("user.dir");
		  String filePath=absolutePath+"//chmod 777 google-chrome-stable_current_amd64.deb";
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