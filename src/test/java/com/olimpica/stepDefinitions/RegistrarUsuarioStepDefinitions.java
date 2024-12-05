package com.olimpica.stepDefinitions;

import com.olimpica.questions.ValidarRegistroUsuario;
import com.olimpica.tasks.RegistroUsuarioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.olimpica.userinterfaces.LoginUI.TXT_CODIGO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistrarUsuarioStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("Que me encuentro en la pagina de Olimpica")
    public void queMeEncuentroEnLaPaginaDeOlimpica() {
        WebDriverManager.chromedriver().setup();
        theActorCalled("usuario").wasAbleTo(Open.url("https://www.olimpica.com/"));
    }

    @Cuando("Me dirijo a la seccion de registro e ingreso mi correo {string}")
    public void meDirijoALaSeccionDeRegistroIngresoMiCorreo(String correo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroUsuarioTask.conElCorreo(correo)
        );

    }

    @Entonces("Se me indicara que he recibido un correo con un codigo")
    public void seMeIndicaraQueHeRecibidoUnCorreoConUnCodigo() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarRegistroUsuario.is(TXT_CODIGO, "Ingrese su código de acceso"))
        );

    }
}
