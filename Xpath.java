package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath{

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/login");
		String title = driver.getTitle();
		if (title.contains("UiBank")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("stewart@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Stewart@123");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Stewart");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Kirubaharan");
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Male");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Mr");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("01/05/2000");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Stewart Kirubaharan");
	}

}