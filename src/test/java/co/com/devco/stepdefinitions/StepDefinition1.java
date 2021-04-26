package co.com.devco.stepdefinitions;


import co.com.devco.conf.SessionVariables;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition1 {

    @Cuando("^he tries to remember (.*)$")
    public void he_tries_to_remember_Foo(String value) {
        theActorInTheSpotlight().remember(SessionVariables.FOO.toString(), value);
    }


}
