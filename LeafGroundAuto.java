package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundAuto {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select obj=new Select(element);
		obj.selectByVisibleText("Selenium");
		
		driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		
		
		WebElement element2 = driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		element2.sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		
		
		
		element2.sendKeys("play");
		Thread.sleep(1000);  
		driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
		
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[@data-label='Three']")).click();
		}

}
