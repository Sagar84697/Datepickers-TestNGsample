package TestNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG2 {
	
	WebDriver Driver;
	
  @Test(priority=1)
  void openapp() {
	  Driver=new ChromeDriver();
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver.get("https://opensource-demo.orangehrmlive.com/");
	  Driver.manage().window().maximize(); 
  }
  
  @Test(priority=2)
   void logo() throws InterruptedException {
	  Thread.sleep(5000);
	  boolean status=Driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println(status);   
   }
  
  @Test(priority=3)
   void login() {
	  Driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  Driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  Driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  
  @Test(priority=4)
  void close() {
	  Driver.close();
  }
}
