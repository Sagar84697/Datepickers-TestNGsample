package March3;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.get("https://demo.nopcommerce.com/");
	        driver.manage().window().maximize();
	        
	     /*   TakesScreenshot ts=(TakesScreenshot)driver;
	        
	        File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	        
	        File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
	        
	        sourcefile.renameTo(targetfile); */
	        
	   /*    WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	      File sourcefile=featuredproducts.getScreenshotAs(OutputType.FILE);
	      File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featured.png");
	      sourcefile.renameTo(targetfile); */
	        
	        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	        File sourcefile=logo.getScreenshotAs(OutputType.FILE);
	        File targetfile=new File(System.getProperty("user.dir")+"\\screenshots.logo.png");
	        sourcefile.renameTo(targetfile);
	        
	       
	}

}
