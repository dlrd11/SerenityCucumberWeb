package co.com.devco.stepdefinitions;

import co.com.devco.builders.Login;
import co.com.devco.facts.AToken;
import co.com.devco.questions.Login.CreditAvailableQuestion;
import co.com.devco.questions.Login.OverviewDataQuestion;
import co.com.devco.tasks.Login.DoLoginTask;
import co.com.devco.userinterfaces.Dashboard.DashboardPage;
import co.com.devco.userinterfaces.Search.SearchPage;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

//    @Cuando("^(.*) busca (.*) en Google Search$")
//    public void BuscaEnGoogleSearch(String actor, String palabra) {
//        theActorCalled(actor).attemptsTo(
//                BuscarEnGoogle.laPalabra(palabra)
//        );
//    }
//
//    @Entonces("^debe ver como primer resultado (.*)$")
//    public void debeVerComoPrimerResultado(String resultado) {
//        theActorInTheSpotlight().attemptsTo(
//                Ensure.that(PRIMER_RESULTADO).attribute("href").contains(resultado)
//        );
//    }

    @Dado("^(.*) has an activate account$")
    public void sergeyHasAnActivateAccount(String actor) {
        theActorCalled(actor).attemptsTo(Open.url(SearchPage.HOME_PAGE)
        );
    }

    @Dado("^(.*) has a token$")
    public void pepito_has_a_token(String actor) {
        theActorCalled(actor).has(AToken.toManageTheirProducts());
    }

    @Cuando("^he sends their valid credentials$")
    public void heSendsTheirValidCredentials() {
        theActorInTheSpotlight().attemptsTo(
                //DoLoginTask.withCredentials("pepito", "algo")
                Login.with().username("pepito").password("algo").rememberMe(true)
                //Login.with().username().password().rememberMe(false) opcion2
        );
    }

    @Entonces("he should have access to manage his account$")
    public void heShouldHaveAccessToManageHisAccount() {

        System.out.println(CreditAvailableQuestion.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("The displayed credit available", OverviewDataQuestion.creditAvailable(), equalTo("$17,800")),
                //seeThat("The displayed total balance", OverviewDataQuestion.totalBalance(), equalTo("$17,800")),
                seeThat("The displayed credit available", OverviewDataQuestion.creditAvailable(), equalTo("$17,800"))
        );

        theActorInTheSpotlight().attemptsTo(
                Click.on(DashboardPage.LEFT_MENU.CREDIT_CARD_LINK)
        );
    }

}
