package co.com.choucair.certification.PruebaCompra.tasks;

import co.com.choucair.certification.PruebaCompra.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {
    public static Seleccionar productos() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BUTTON_BOLSO),
                Click.on(HomePage.BUTTON_CAMISA));
    }
}
