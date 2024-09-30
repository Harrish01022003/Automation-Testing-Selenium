package week7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> windowList = new ArrayList<String>(allWindows);
	    driver.switchTo().window(windowList.get(1));
		Thread.sleep(10000);
		
		WebElement element = driver.findElement(By.xpath("//img[@id='landingImage']"));
		element.click();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//div[@id='ivLargeImage']"));
		File src = element2.getScreenshotAs(OutputType.FILE); 
		File dst = new File("./snap/dest.png");
		FileUtils.copyFile(src, dst);
		
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']")).click();
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
		
		String cost = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText();
		System.out.println(cost);
		String verify = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
		System.out.println(verify);
		if(cost.equals(verify)) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}
	
	}

}
