package week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//Button[text()='Tomorrow']")).click();
		
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//h5[@class='title']"));
		String bus = element.getText();
		System.out.println(bus);
		
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//div[@class='text-grey']"));
		String seat = element1.getText();
		System.out.println(seat);
		
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='5UA']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
		String Fare = element2.getText();
		System.out.println("Total Fare is: " + Fare);
		
		WebElement element3 = driver.findElement(By.xpath("//div[@class='selected-seat col auto']/div/div"));
		String Selectedseat = element3.getText();
		System.out.println("Selected seat is: " + Selectedseat);

	}

}
