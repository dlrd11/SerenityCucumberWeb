//https://youtu.be/LXo7MdTz9b8
package co.com.devco.builders;

import co.com.devco.userinterfaces.Login.LoginFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String username;
    private String password;
    private boolean rememberMe;

    public Login(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public static LoginWith with(){
        return new LoginWith();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginFormPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginFormPage.PASSWORD_FIELD)
        );

        if (rememberMe)
            actor.attemptsTo(
                    Click.on(LoginFormPage.REMEMBER_ME)
            );
        actor.attemptsTo(
                Click.on(LoginFormPage.LOGIN_BUTTON)
        );
    }

    public static class LoginWith{
        private String username;
        private String password;

        public LoginWith username(String username){
            this.username = username;
            //this.username = ""; opcion 2 eliminar parametro
            return this;
        }

        public LoginWith password(String password){
            this.password = password;
            //this.password = ""; opcion 2 eliminar parametro
            return this;
        }
        //para poder llamar esto dentro del actor attempsTo

        public Performable rememberMe(boolean rememberMe){
            return new Login(username, password, rememberMe);
        }

    }
}
