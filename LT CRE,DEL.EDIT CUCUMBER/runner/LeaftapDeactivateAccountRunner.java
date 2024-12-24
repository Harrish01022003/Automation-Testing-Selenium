package runner;
import base.ProjectSpecificMethodLeaftapApp;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
	    features = "src/test/java/feature/LeaftapDeleteAccount.feature",
	    glue = {"stepdefinition", "hooks"},
	    publish = true,
	    monochrome = true
	)
	public class LeaftapDeactivateAccountRunner extends ProjectSpecificMethodLeaftapApp {
	}