package co.com.devco.facts;

import co.com.devco.token.GetToken;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.facts.Fact;

public class AToken implements Fact {

    private String token;

    public static AToken toManageTheirProducts(){
        return new AToken();
    }

    @Override
    public void setup(Actor actor) {
        token = GetToken.toManageMyProducts().answeredBy(actor);

        //inyectar el token en el browser
    }

    public String toString(){
        return "token is " + token;
    }
}
