package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceCreate {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement leadClick = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", leadClick);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Harrish");
		//driver.findElement(By.xpath("//input[@id='input-247']")).sendKeys("Harrish");
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		//driver.findElement(By.xpath("//input[@id='input-240']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("13/09/2024");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='--None--']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		if (title.contains("New Opportunity | Salesforce")) {
			System.out.println("Title is verified");

		} else {

			System.out.println("Title not verified");
		}
		
		

	}

}
