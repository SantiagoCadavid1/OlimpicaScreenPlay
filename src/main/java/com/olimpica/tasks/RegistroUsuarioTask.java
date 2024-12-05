package com.olimpica.tasks;

import com.olimpica.interactions.HacerClick;
import com.olimpica.interactions.IngresarTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.olimpica.userinterfaces.InicioUI.BTN_INICIO_SESION;
import static com.olimpica.userinterfaces.InicioUI.BTN_NUEVO_REGISTRO;
import static com.olimpica.userinterfaces.LoginUI.*;

public class RegistroUsuarioTask implements Task {
    private String correo;

    public RegistroUsuarioTask(String correo){this.correo=correo ;}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                HacerClick.on(BTN_INICIO_SESION),
                HacerClick.on(BTN_NUEVO_REGISTRO),
                HacerClick.on(BTN_REGISTRO),
                IngresarTexto.into(TXT_REGISTRO_EMAIL, correo),
                HacerClick.on(BTN_ENVIAR_REGISTRO)
        );
    }

    public static RegistroUsuarioTask conElCorreo(String correo) { return new RegistroUsuarioTask(correo); }
}
