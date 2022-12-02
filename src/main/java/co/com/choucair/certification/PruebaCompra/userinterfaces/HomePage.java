package co.com.choucair.certification.PruebaCompra.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {
    public static final Target LBL_MENU = Target.the(" productos").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    public static final Target BUTTON_BOLSO = Target.the("Seleccionar Bolso").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BUTTON_CAMISA = Target.the("Seleccionar camisa").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BUTTON_CARRITO =Target.the("Boton carrito").located(By.id("shopping_cart_container"));
}
