package co.com.devco.tasks.Login;

import co.com.devco.userinterfaces.Login.LoginFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLoginTask implements Task {

//    private String palabra;
//
//    public BuscarEnGoogle(String palabra) {
//        this.palabra = palabra;
//    }
//
//    public static Performable laPalabra(String palabra) {
//        return instrumented(BuscarEnGoogle.class, palabra);
//    }
//
//    @Override
//    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(
//                Open.url(GOOGLE_HOME_PAGE),
//                WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
//        );
//    }
    private final String username;
    private final String password;

    public DoLoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password){
        return instrumented(DoLoginTask.class, username, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginFormPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginFormPage.PASSWORD_FIELD),
                Click.on(LoginFormPage.LOGIN_BUTTON)
        );
    }
}
