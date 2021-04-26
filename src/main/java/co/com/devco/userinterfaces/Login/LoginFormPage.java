package co.com.devco.userinterfaces.Login;

import org.openqa.selenium.By;

public class LoginFormPage {
//    public static final Target RESULTADOS_BUSQUEDA = Target.the("resultados de bsuqueda").located(By.xpath("//div[@id='search']"));
//    public static final Target PRIMER_RESULTADO = Target.the("Primer resultado de busqueda").located(By.xpath("//div[@id='search']//div[@class='g' and position()=1]//link"));

    public static By USERNAME_FIELD = By.id("username");
    public static By PASSWORD_FIELD = By.id("password");
    public static By REMEMBER_ME = By.xpath("/html/body/div/div/form/div[3]/div[1]/label/input");
    public static By LOGIN_BUTTON = By.id("log-in");
}
