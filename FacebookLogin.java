package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Harrish");
		driver.findElement(By.name("lastname")).sendKeys("A");
		driver.findElement(By.name("reg_email__")).sendKeys("harrish@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("harrish123");
		String title = driver.getTitle();
        if (title.contains("Facebook")) {
			System.out.println("Title is verified");
		}
        else {
        	System.out.println("Title is not verified");
        }

		
	}

}
