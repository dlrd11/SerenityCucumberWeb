package co.com.devco.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		tags = {"@dev"},
		features = "src/test/resources/features/login.feature",
		glue = {"co.com.devco.stepdefinitions"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {

}
