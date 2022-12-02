package co.com.choucair.certification.PruebaCompra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompra extends PageObject {
    public static final Target BUTTON_FINALIZAR = Target.the("Finalizar compra").located(By.id("finish"));

}
