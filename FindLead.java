package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7548886065");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement capture = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadId = capture.getText();
		
		driver.findElement(By.xpath("////div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		/*
		WebElement noRecordsMsg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		if (noRecordsMsg.isDisplayed()) {
		    System.out.println("Lead ID: " + leadId + " was successfully deleted.");
		} else {
		    System.out.println("Lead ID: " + leadId + " was NOT deleted.");
		}
		
		*/
		WebElement noRecord = driver.findElement(By.xpath("//div[text()='No records to display']"));
        String text = noRecord.getText();
		if(text.equals("No records to display")) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("not deleted");
		}
		
		
		
		
		
	}
}