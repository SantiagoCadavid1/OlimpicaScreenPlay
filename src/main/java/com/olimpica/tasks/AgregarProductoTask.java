package com.olimpica.tasks;

import com.olimpica.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.olimpica.userinterfaces.BusquedaProductoUI.getBtnProducto;
import static com.olimpica.userinterfaces.InicioUI.TXT_BUSCAR_PRODUCTO;
import static com.olimpica.userinterfaces.InicioUI.TXT_LOGIN_CORREO;
import static com.olimpica.userinterfaces.ProductoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductoTask implements Task {
    private String marca;
    private String producto;
    private String correo;

    public AgregarProductoTask(String marca, String producto, String correo){
        this.marca = marca;
        this.producto = producto;
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(marca).into(TXT_BUSCAR_PRODUCTO).thenHit(Keys.ENTER),
                EsperarElemento.forTime(getBtnProducto(producto), Duration.ofSeconds(5)),
                Scroll.to(getBtnProducto(producto)).andAlignToBottom(),
                HacerClick.on(getBtnProducto(producto)),
                EsperarElemento.forTime(BTN_AGREGAR_PRODUCTO, Duration.ofSeconds(5)),
                HacerClick.on(BTN_AGREGAR_PRODUCTO),
                IngresarTexto.into(TXT_CORREO_PRODUCTO, correo),
                HacerClick.on(BTN_CONTINUAR_PRODUCTO)
        );
        if (BTN_AGREGAR_DIRECCION.isVisibleFor(actor)){
            actor.attemptsTo( HacerClick.on(BTN_AGREGAR_DIRECCION));
        }
        actor.attemptsTo(
                HacerClick.on(OPT_DEPARTAMENTO),
                HacerClick.on(Target.the("").locatedBy("//*[contains(text(),'ANTIOQUIA')]")),
                HacerClick.on(OPT_CIUDAD),
                HacerClick.on(Target.the("").locatedBy("//*[contains(text(),'Medellín')]")),
                IngresarTexto.into(TXT_DIRECCION, "Carrera 80 52 71"),
                HacerClick.on(BTN_ENVIAR_DATOS),
                EsperarElemento.forTime(BTN_AGREGAR_CARRITO, Duration.ofSeconds(10)),
                HacerClick.on(BTN_AGREGAR_CARRITO),
                HacerClick.on(BTN_CARRITO),
                EsperarElemento.forTime(BTN_PAGAR, Duration.ofSeconds(5)),
                HacerClick.on(BTN_PAGAR)
        );

    }

    public static AgregarProductoTask agregarElProducto(String marca, String producto, String correo) {return new AgregarProductoTask(marca, producto, correo);}
}
