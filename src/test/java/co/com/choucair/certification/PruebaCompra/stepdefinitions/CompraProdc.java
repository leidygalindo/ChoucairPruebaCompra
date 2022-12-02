package co.com.choucair.certification.PruebaCompra.stepdefinitions;
import co.com.choucair.certification.PruebaCompra.questions.Revision;
import co.com.choucair.certification.PruebaCompra.questions.Validar;
import co.com.choucair.certification.PruebaCompra.questions.Verificar;
import co.com.choucair.certification.PruebaCompra.tasks.Abrir;
import co.com.choucair.certification.PruebaCompra.tasks.Checkout;
import co.com.choucair.certification.PruebaCompra.tasks.Ingresar;
import co.com.choucair.certification.PruebaCompra.tasks.Seleccionar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class CompraProdc {

    @Given("^verifica los articulos que se encuentran en el carrito de compras$")
    public void verificaLosArticulosQueSeEncuentranEnElCarritoDeCompras() {
        OnStage.theActorCalled("Leidy").wasAbleTo(Abrir.urlpagina(), Ingresar.credenciales());
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.productos());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.productosCP(), Matchers.equalTo("Sauce Labs Backpack")));
    }

    @When("^procede a realizar la orden de compra$")
    public void procedeARealizarLaOrdenDeCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.Compra());
    }

    @Then("^Finaliza la orden de compra$")
    public void finalizaLaOrdenDeCompra() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Revision.Completada(), Matchers.equalTo("CHECKOUT: COMPLETE!")));

    }
}
