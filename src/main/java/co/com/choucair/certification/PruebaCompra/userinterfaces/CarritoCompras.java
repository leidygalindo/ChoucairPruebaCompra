package co.com.choucair.certification.PruebaCompra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoCompras extends PageObject {
    public static final Target LBL_BOLSO = Target.the(" Bolso en carro de compras").located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
    public static final Target LBL_CAMISA = Target.the(" camia en carro de compras").located(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
    public static final Target BUTTON_Checkout = Target.the("continuar con la compra").located(By.id("checkout"));

}
