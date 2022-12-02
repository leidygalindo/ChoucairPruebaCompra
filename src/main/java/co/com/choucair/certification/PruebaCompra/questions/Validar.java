package co.com.choucair.certification.PruebaCompra.questions;

import co.com.choucair.certification.PruebaCompra.userinterfaces.CarritoCompras;
import co.com.choucair.certification.PruebaCompra.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question {

    public static Validar productosCP(){

        return new Validar();
    }
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(CarritoCompras.LBL_BOLSO).viewedBy(actor).asString() ;
    }
}
