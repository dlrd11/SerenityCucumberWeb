package co.com.devco.stepdefinitions;

import co.com.devco.conf.SessionVariables;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition2 {

    @Entonces("he should get Foo")
    public void he_should_get_Foo() {
        String valueRecall = theActorInTheSpotlight().recall(SessionVariables.FOO.toString());
    }
}
