package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;


public class UserLogin {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		//Initiating your ChromeDriver
		WebDriver driver=  new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//open browser with specified URL
		//driver.get("https://testdds.ddsolutions.tech/mini/login");
		driver.navigate().to("https://testdds.ddsolutions.tech/mini/login");
		
		//maximise window
		driver.manage().window().maximize();
		
		//check if page title matches
		Assert.assertTrue(driver.getTitle().matches("DDS"), null);
		
		//print feedback 
		System.out.println("Site Matches");
		
		//identify input elements by xpath
		// //*[@id="name"]   //*[@id="password"]	
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("alex@ddsolutions.tech");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@w3s0m3 @DD5");
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/div/mat-card/mat-card-actions/div/div[2]/button")).click();
		
		//sleep
		Thread.sleep(60000);

		//print feedback 
		System.out.println("Log in Successfull");
		
		//closing the browser
		driver.close();

		}

}
