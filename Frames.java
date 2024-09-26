package week6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		driver.switchTo().frame("iframeResult");
		WebElement tryItButton = driver.findElement(By.xpath("//h2[text()='The confirm() Method']//following::button"));
		tryItButton.click();
		Alert alert = driver.switchTo().alert();
        alert.accept();
		driver.switchTo().defaultContent();
		

	}

}
