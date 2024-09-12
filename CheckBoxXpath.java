package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[2]//div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("par");
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
	}

}
