package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.EnviromentError;
import io.cucumber.java.es.Dado;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompromisedStepDefenitions {

    @Dado("^(.*) Failed1$")
    public void pepito_Failed1(String name) {
        theActorCalled(name).should(seeThat("failed 1", actor -> true, equalTo(false)));
    }


    @Dado("^(.*) Failed2$")
    public void pepito_Failed2(String name) {
        theActorCalled(name).should(seeThat("failed 2", actor -> true, equalTo(false)));
    }

    @Dado("^(.*) compromised$")
    public void pepito_compromised(String name) {
        theActorCalled(name).should(seeThat("", act -> true, equalTo(false)).orComplainWith(EnviromentError.class, "no se tiene conexion con el thridparty"));
    }

}
