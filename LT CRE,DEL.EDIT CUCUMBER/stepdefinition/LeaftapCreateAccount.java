package stepdefinition;
import org.openqa.selenium.By;
import base.ProjectSpecificMethodLeaftapApp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LeaftapCreateAccount extends ProjectSpecificMethodLeaftapApp {
	@When("Click on the Accounts tab")
	public void click_on_the_accounts_tab() {
		driver.findElement(By.linkText("Accounts")).click();
  	}
	@When("Click on the Create Account button")
	public void click_on_the_create_account_button() {
		driver.findElement(By.linkText("Create Account")).click();
	}
	@When("Enter an account name as {string}")
	public void enter_an_account_name_as(String accName) {
		driver.findElement(By.id("accountName")).sendKeys(accName);
	}
	@When("Enter a description as {string}")
	public void enter_a_description_as(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
	}
	@When("Click the Create Account button")
	public void click_the_create_account_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Verify the Account is created")
	public void verify_the_account_is_created() {
	    String accNameCreated = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	    System.out.println("Account is created successfully : "+accNameCreated);
	}
}