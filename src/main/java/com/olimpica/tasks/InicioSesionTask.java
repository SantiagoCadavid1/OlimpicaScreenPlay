package com.olimpica.tasks;

import com.olimpica.interactions.EsperarElemento;
import com.olimpica.interactions.HacerClick;
import com.olimpica.interactions.IngresarTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.time.Duration;

import static com.olimpica.userinterfaces.InicioUI.*;

public class InicioSesionTask implements Task {
    private String correo;
    private String clave;

    public InicioSesionTask(String correo, String clave){
        this.clave = clave;
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                HacerClick.on(BTN_INICIO_SESION),
                EsperarElemento.forTime(BTN_LOGIN_CORREO, Duration.ofSeconds(5)),
                HacerClick.on(BTN_LOGIN_CORREO),
                EsperarElemento.forTime(TXT_LOGIN_CORREO, Duration.ofSeconds(5)),
                IngresarTexto.into(TXT_LOGIN_CORREO, correo),
                IngresarTexto.into(TXT_LOGIN_CLAVE, clave),
                HacerClick.on(BTN_LOGIN_SEND)
                //SendKeys.of("ANTIOQUIA").into(Target)
        );
    }

    public static InicioSesionTask conLasCredenciales(String correo, String clave) {return new InicioSesionTask(correo, clave);}
}
