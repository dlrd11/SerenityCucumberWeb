package co.com.devco.questions.Login;

import co.com.devco.userinterfaces.Dashboard.FinancialOverviewPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewDataQuestion {

    public static Question<String> creditAvailable(){
        return actor -> TextContent.of(FinancialOverviewPage.CREDIT_AVAILABLE).viewedBy(actor).asString().trim();
    }

    public static Question<String> totalBalance(){
        return actor -> TextContent.of(FinancialOverviewPage.TOTAL_BALANCE).viewedBy(actor).asString();
    }
}
