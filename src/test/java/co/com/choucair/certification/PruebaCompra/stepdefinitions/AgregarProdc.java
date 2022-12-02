package co.com.choucair.certification.PruebaCompra.stepdefinitions;

import co.com.choucair.certification.PruebaCompra.questions.Validar;
import co.com.choucair.certification.PruebaCompra.tasks.Abrir;
import co.com.choucair.certification.PruebaCompra.tasks.Ingresar;
import co.com.choucair.certification.PruebaCompra.tasks.Seleccionar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AgregarProdc {

    @Given("^que Leidy quiere comprar un bolso y una casmisa en el sitio web$")
    public void queLeidyQuiereComprarUnBolsoYUnaCasmisaEnElSitioWeb() {
        OnStage.theActorCalled("Leidy").wasAbleTo(Abrir.urlpagina(), Ingresar.credenciales());
    }

    @When("^agregar el bolso y camisa al carrito de compras$")
    public void agregarElBolsoYCamisaAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.productos());
    }

    @Then("^ella valida los articulos en el carrito de compras$")
    public void ellaValidaLosArticulosEnElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.productosCP(), Matchers.equalTo("Sauce Labs Backpack")));
    };

}
