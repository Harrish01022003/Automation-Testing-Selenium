package stepdefinition;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SalesForceAccountCreationStep {
	public ChromeDriver driver;
	
	@Given("Launch the browser and load the URL")
	public void launch_the_browser_and_load_the_url() {
		 // Disable browser notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
	}
	@When("Enter the Salesforce user name as {string}")
	public void enter_the_salesforce_user_name_as(String UserName) {
		driver.findElement(By.id("username")).sendKeys(UserName);
	}
	@When("Enter the Password as {string}")
	public void enter_the_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	@Then("Verify Login is successful")
	public void verify_login_is_successful() {
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		if (title.contains("Lightning Experience")) {
			System.out.println("SalesForce login page is loaded successfully");
		} else {
			System.out.println("Error occured during login");
		}
	}
	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	}
	@When("Click view All")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@When("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		WebElement legalEntitiesLink = driver.findElement(By.xpath("//span[text()='Accounts']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", legalEntitiesLink);
	}
	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@When("Enter {string} as account name")
	public void enter_as_account_name(String accountName) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountName);
	}
	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		WebElement ownershipDropdown = driver
				.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div//button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ownershipDropdown);
		WebElement publicValue = driver.findElement(By.xpath("//span[text()='Public']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", publicValue);
	}
	@When("Click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("verify Account name")
	public void verify_account_name() {
		String accountNameCreated = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"))
				.getText();
		System.out.println("Account Created with the name : " + accountNameCreated);
	}
}