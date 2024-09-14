package week3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditSalesforce {

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
			driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce Automation by Harrish");
			
			Thread.sleep(5000);
			
			WebElement element = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button']"));
			driver.executeScript("arguments[0].click();", element);
			Thread.sleep(5000);
			WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
			driver.executeScript("arguments[0].click();", edit);
			driver.findElement(By.xpath("//input[@name='CloseDate']")).clear();
			driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("15/09/2024");
			driver.findElement(By.xpath("//lightning-base-combobox[@class='slds-combobox_container']//span[text()='Needs Analysis']")).click();
			driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
			
			WebElement element2 = driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]"));
			driver.executeScript("arguments[0].click()", element2);
			driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']")).click();
			driver.findElement(By.xpath("//textarea[@part='textarea']")).sendKeys("SalesForce");
			driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
			
			WebElement title = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
			String verify = title.getText();
			if(verify.equals("Perception Analysis")) {
				System.out.println("Stage is Verified");
			}
			else {
				System.out.println("Stage is not verified");
			}
			

	}

}
