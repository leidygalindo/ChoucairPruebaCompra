package co.com.choucair.certification.PruebaCompra.tasks;


import co.com.choucair.certification.PruebaCompra.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Checkout implements Task {
    public static Checkout Compra() {
        return Tasks.instrumented(Checkout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BUTTON_CARRITO),
                Click.on(CarritoCompras.BUTTON_Checkout),
                Enter.theValue("Pepito").into(DatosOrden.TXT_NOMBRE),
                Enter.theValue("Perez").into(DatosOrden.TXT_APELLIDO),
                Enter.theValue("502").into(DatosOrden.TXT_POSTAL),
                Click.on(DatosOrden.BUTTON_CONTINUE),
                Click.on(ConfirmarCompra.BUTTON_FINALIZAR));
    }
}
