package com.olimpica.stepDefinitions;

import com.olimpica.questions.ValidarInicioSesion;
import com.olimpica.questions.ValidarRegistroUsuario;
import com.olimpica.tasks.InicioSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static com.olimpica.userinterfaces.InicioUI.LBL_CORREO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class IniciarSesionStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Cuando("Selecciono la opcion para iniciar sesion ingreso mi correo {string} y clave {string}")
    public void seleccionoLaOpcionParaIniciarSesionIngresoMiCorreoCorreoYClaveClave(String correo, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioSesionTask.conLasCredenciales(correo, clave)
        );
    }

    @Entonces("Validare que haya iniciado sesion con el correo {string} o con el nombre {string}")
    public void validareQueHayaIniciadoSesionConElCorreoCorreo(String correo, String nombre) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarInicioSesion.is(LBL_CORREO, correo, nombre))
        );
    }
}
