package co.com.choucair.certification.PruebaCompra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class PageWeb extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Ingresar el Usuario").located(By.id("user-name"));
    public static final Target TXT_CONTRASENA = Target.the("Ingresar contraseña").located(By.id("password"));
    public static final  Target BUTTON_LOGIN = Target.the("Boton ingresar").located(By.id("login-button"));
}
