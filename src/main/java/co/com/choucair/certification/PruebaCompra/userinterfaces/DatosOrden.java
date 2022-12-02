package co.com.choucair.certification.PruebaCompra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosOrden extends PageObject {
    public static final Target TXT_NOMBRE= Target.the("Ingresar el nombre").located(By.id("first-name"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar el apellido").located(By.id("last-name"));
    public static final Target TXT_POSTAL = Target.the("Ingresar la Postal").located(By.id("postal-code"));
    public static final Target BUTTON_CONTINUE = Target.the("Boton Continuar").located(By.id("continue"));

}
