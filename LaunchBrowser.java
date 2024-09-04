package week3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Title is verified");
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("title is not verified");
		}
		driver.close();
		
		

	}

}
