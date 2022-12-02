package co.com.choucair.certification.PruebaCompra.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.choucair.certification.PruebaCompra.userinterfaces.PageWeb;

public class Abrir implements Task {
    private PageWeb pageWeb;
    public static Abrir urlpagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((Open.browserOn(pageWeb)));
    }
}
