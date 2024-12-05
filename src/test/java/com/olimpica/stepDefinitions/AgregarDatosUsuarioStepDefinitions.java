package com.olimpica.stepDefinitions;

import com.olimpica.tasks.AgregarDatosUsuarioTask;
import com.olimpica.tasks.InicioSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class AgregarDatosUsuarioStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Y("Me dirijo a mi cuenta y completo los campos necesarios")
    public void meDirijoAMiCuentaYCompletoLosCamposNecesarios() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarDatosUsuarioTask.datosGenericos()
        );
    }

    @Entonces("Validare que los datos hayan sido correctamente guardados")
    public void validareQueLosDatosHayanSidoCorrectamenteGuardados() {
    }

}
