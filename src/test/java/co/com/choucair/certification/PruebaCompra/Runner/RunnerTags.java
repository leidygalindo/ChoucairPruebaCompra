package co.com.choucair.certification.PruebaCompra.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src/test/resources/features/Ingresar.feature",
        tags = "@HistoriaDeUsuario,@CasoAgregar,@CasoCompra",
        glue = "co.com.choucair.certification.PruebaCompra.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}
