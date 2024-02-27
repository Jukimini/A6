package orangehrm;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class orangehrmDemo1 {
	@Test
	
		//public void f()
		public static void main(String[]args)throws InterruptedException 
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aishwarya Abishek\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.manage().window().maximize(); 
   		driver.manage().timeouts().pageLoadTimeout(250,TimeUnit.SECONDS);
   		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
   		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
     
  	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        
       
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Krish");
      driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("er");
      driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("cg");
      driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
      
      Thread.sleep(3000);
	}

}
