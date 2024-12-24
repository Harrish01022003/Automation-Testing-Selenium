package stepdefinition;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import base.ProjectSpecificMethodLeaftapApp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LeaftapDeactivateAccount extends ProjectSpecificMethodLeaftapApp{
	@When("Cick on Deactivate Account button")
	public void cick_on_deactivate_account_button() {
		driver.findElement(By.xpath("//a[text()='Deactivate Account']")).click();
	}
	@When("click on OK button on Alert posted as Are you sure to deactivate the account")
	public void click_on_ok_button_on_alert_posted_as_are_you_sure_to_deactivate_the_account() {
		Alert alert =  driver.switchTo().alert();
		alert.accept();		
	}
	@Then("Verify the Account is deactivated")
	public void verify_the_account_is_deactivated() {
		String warningMessage = driver.findElement(By.xpath("//span[@class='subSectionWarning']")).getText();
		System.out.println("Account is sucessfully deactivated : "+warningMessage);
	}
}