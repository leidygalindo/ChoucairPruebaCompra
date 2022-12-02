package co.com.choucair.certification.PruebaCompra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraCompletada extends PageObject {
    public static final Target LBL_COMPLETE = Target.the("Compra completada").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

}
