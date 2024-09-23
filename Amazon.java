package week6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=2155330438691621333&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9197671&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		
		for (int i = 0; i < element.size(); i++) {
			String text = element.get(i).getText();
			
			System.out.println(text);
		}

	}

}
