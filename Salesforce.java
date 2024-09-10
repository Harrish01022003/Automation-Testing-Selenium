package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement leadClick = driver.findElement(By.xpath("//span[text()='Leads']"));
		driver.executeScript("arguments[0].click()", leadClick);
		driver.findElement(By.xpath("//button[@name='New']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harrish");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Qeagle");
		driver.findElement(By.xpath("(//button[text() = 'Save'])[2]")).click();
		String title = driver.getTitle();
		if (title.contains("Lead Intelligence View")) {
			System.out.println("Title get verified");

		} else {

			System.out.println("Title not verified");
		}
		driver.close();
		
  	}

}
