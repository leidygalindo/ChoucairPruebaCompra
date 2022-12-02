package co.com.choucair.certification.PruebaCompra.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.choucair.certification.PruebaCompra.userinterfaces.HomePage;


public class Verificar implements Question {
    public static Verificar resultado(){
        return new Verificar();
    }
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(HomePage.LBL_MENU).viewedBy(actor).asString();
    }
}
