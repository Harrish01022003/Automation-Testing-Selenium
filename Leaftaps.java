package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEAGLE");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harrish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harrish010203@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7548886065");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("udaya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("32A Gandhipuram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641012");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		if(title2.contains("View Lead")) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is not verified");
		}
		
		
	}

}
