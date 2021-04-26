package co.com.devco.questions.Login;

import co.com.devco.userinterfaces.Dashboard.FinancialOverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CreditAvailableQuestion implements Question<String> {

    /*las siguientes pueden ir en una sola clase de question para evaluar varios elementos, esto es lambda
    public static Question<String> creditAvailable(){
        return actor -> TextContent.of(FinancialOverview.CREDIT_AVAILABLE).viewedBy(actor).asString();
    }

    public static Question<String> totalBalance(){
        return actor -> TextContent.of(FinancialOverview.TOTAL_BALANCE).viewedBy(actor).asString();
    }*/

    /*se puede crear un metodo static de tipo Question, no llamaria directamente el Question con la palabra reservada new si no que entra a tres ves de value que tipo como metodo el new
    public static Question<String> value(){ return new nombreClase();}
    * */

    public static Question<String> value(){ return new CreditAvailableQuestion();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverviewPage.CREDIT_AVAILABLE).getText();
    }
}
