package co.com.choucair.certification.PruebaCompra.stepdefinitions;
import co.com.choucair.certification.PruebaCompra.tasks.Seleccionar;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import co.com.choucair.certification.PruebaCompra.questions.Verificar;
import co.com.choucair.certification.PruebaCompra.tasks.Abrir;
import co.com.choucair.certification.PruebaCompra.tasks.Ingresar;


public class IngresarStep {

    @Before
    public void iniciarEscenario (){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^que leidy ingrea al sitio web$")
    public void que_leidy_ingrea_al_sitio_web() {

        OnStage.theActorCalled("Leidy").wasAbleTo(Abrir.urlpagina());
    }
    @When("^digita las credenciales usuario y contrasena del sitio web$")
    public void digitaLasCredencialesUsuarioYContrasenaDelSitioWeb() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }
    @Then("^Valida que logro ingresar correctamente$")
    public void valida_que_logro_ingresar_correctamente()  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("PRODUCTS")));
    }


}
