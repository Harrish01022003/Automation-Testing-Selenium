package stepdefinition;
import org.openqa.selenium.By;
import base.ProjectSpecificMethodLeaftapApp;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStep extends ProjectSpecificMethodLeaftapApp{
	
		@When("Enter the username as {string}")
		public void enter_the_username_as_demo_sales_manager(String uName) {
			driver.findElement(By.id("username")).sendKeys(uName);
		}
		@When("Enter the password as {string}")
		public void enter_the_username_as_crmsfa(String pass) {
			driver.findElement(By.id("password")).sendKeys(pass);
		}
		@When("Click on the Login button")
		public void click_on_the_login_button() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		@Then("Verify the Login is successful")
		public void verify_the_login_is_successful() throws InterruptedException {
		    String title = driver.getTitle();
		    if(title.contains("Leaftaps")) {
		    	System.out.println("Leaftap login page is loaded successfully -  Test case Passed");
		    } else {
		    	System.out.println("Error occured during login -  Test case Failed");
		    }
		   
		}
		
		@But("Verify the Login is not successful")
		public void verify_the_login_is_not_successful() throws InterruptedException {
		    String title = driver.getTitle();
		    if(title.contains("Leaftaps")) {
		    	System.out.println("Leaftap login page is not loaded as expected -  Test case Passed");
		    } else {
		    	System.out.println("Leaftap login page is loaded successfully - Test case Failed");
		    }
   		}
		
		@When("Click on CRM\\/SFA link")
		public void click_on_crm_sfa_link() {
			driver.findElement(By.linkText("CRM/SFA")).click();
		    }
}