package stepdefinition;
import org.openqa.selenium.By;
import base.ProjectSpecificMethodLeaftapApp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LeaftapEditAccount extends ProjectSpecificMethodLeaftapApp{
	@When("Click on the Finds Account Link under shortcuts")
	public void click_on_the_finds_account_link_under_shortcuts() {
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	}
	
	@When("Enter an account name as {string} in search box")
	public void enter_an_account_name_as_in_search_box(String accName) {
	  driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(accName);
	}
	@When("Click on Find Accounts Button")
	public void click_on_find_accounts_button() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	@When("Click the Account ID link {string}")
	public void click_the_account_id_link(String accName) {
		driver.findElement(By.xpath("//a[contains(text(),'"+accName+"')]")).click();
	}
	@When("Cick on Edit button")
	public void cick_on_edit_button() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@When("Enter the updated description as {string}")
	public void enter_the_updated_description_as(String description) {
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys(description);
	}
	@When("Enter a Site Name as {string}")
	public void enter_a_site_name_as(String siteName) {
		driver.findElement(By.id("officeSiteName")).sendKeys(siteName);
	}
	
	@When("Click on the Save Button")
	public void click_on_the_save_button() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	@Then("Verify the Account is updated")
	public void verify_the_account_is_updated() {
		  String accNameCreated = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		  System.out.println("Account is updated successfully : "+accNameCreated);
	}
}