package co.com.choucair.certification.PruebaCompra.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.choucair.certification.PruebaCompra.userinterfaces.PageWeb;

public class Ingresar implements Task{
    public static Ingresar credenciales() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(PageWeb.TXT_USUARIO),
                Enter.theValue("secret_sauce").into(PageWeb.TXT_CONTRASENA),
                Click.on(PageWeb.BUTTON_LOGIN));

    }
}
