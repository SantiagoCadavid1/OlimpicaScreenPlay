package com.olimpica.stepDefinitions;

import com.olimpica.questions.ValidarProductoAgregado;
import com.olimpica.tasks.AgregarProductoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.olimpica.userinterfaces.CarritoUI.LBL_PRODUCTO_CARRITO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class AgregarProductoStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Cuando("Busco la marca {string} y selecciono el producto {string} y agrego el producto al carrito con el correo {string}")
    public void buscoLaMarcaMarcaYSeleccionoElProductoProductoYAgregoElProductoAlCarrito(String marca, String producto, String correo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProductoTask.agregarElProducto(marca, producto, correo)
        );
    }

    @Entonces("Validare que el producto {string} haya sido agregado al carrito")
    public void validareQueElProductoProductoHayaSidoAgregadoAlCarrito(String producto) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarProductoAgregado.is(LBL_PRODUCTO_CARRITO, producto))
        );
    }
}
