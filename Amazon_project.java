package Flipkart.Project_1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_project {
	@Test
	
	public void Amazonproject() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Macbook");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//div[@id='p_90-title']"));
		if (dropdown.isSelected()) {
			System.out.println("dropdown is selected");
		} else {
			dropdown.click();
		}
		driver.findElement(By.xpath("//li[@aria-label='Get It by Tomorrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Apple MacBook Air Laptop M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 256GB SSD Storage, Backlit Keyboard, FaceTime HD Camera, Touch ID. Works with iPhone/iPad; Silver']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("abcd@gmail.com");
		driver.findElement(By.id("continue"));
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("123456");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}

		
		
		
		
		
		

