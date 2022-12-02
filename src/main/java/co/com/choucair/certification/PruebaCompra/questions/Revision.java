package co.com.choucair.certification.PruebaCompra.questions;

import co.com.choucair.certification.PruebaCompra.userinterfaces.CompraCompletada;
import co.com.choucair.certification.PruebaCompra.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Revision implements Question {
    public static Revision Completada() { return new Revision();}


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CompraCompletada.LBL_COMPLETE).viewedBy(actor).asString();
    }
}
