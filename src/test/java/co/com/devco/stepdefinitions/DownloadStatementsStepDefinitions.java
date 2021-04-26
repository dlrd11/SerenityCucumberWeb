package co.com.devco.stepdefinitions;

import co.com.devco.abilities.ReadPdf;
import co.com.devco.navigation.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DownloadStatementsStepDefinitions {

    String name;

    private EnvironmentVariables environmentVariables;//serenity se encarga de tomar automaticamente las variables definidas en el serenity.conf

    String downloadFolder;
    String fileName;

    @Given("Pepito has made purchases with this credit card")
    public void pepito_has_made_purchases_with_this_credit_card() {
        this.name = name;
        downloadFolder = environmentVariables.optionalProperty("download.filesFolder").orElseThrow(IllegalArgumentException::new);

        fileName = environmentVariables.optionalProperty("statements.fileName").orElseThrow(IllegalArgumentException::new);
    }

    @Given("he already downloaded his statements")
    public void he_already_downloaded_his_statements() throws InterruptedException {
        theActorCalled(name);
        withCurrentActor(NavigateTo.theDuckDuckGoHomePage());
        Thread.sleep(5000);
    }

    @When("he reviews his transactions")
    public void he_reviews_his_transactions() throws IOException {
        String statemenetFilePAth = String.format("%s/%s", downloadFolder, fileName);
        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPAth(statemenetFilePAth));
        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();
        System.out.println(pdfText);
    }

    @Then("he should see the transactions for last month")
    public void he_should_see_the_transactions_for_last_month() {
    }
}
