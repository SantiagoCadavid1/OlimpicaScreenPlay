package com.olimpica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarTexto implements Interaction {
    private final Target target;
    private final String texto;

    public IngresarTexto(Target target, String texto) {
        this.target = target;
        this.texto = texto;
    }

    public static IngresarTexto into(Target target, String texto) {
        return Tasks.instrumented(IngresarTexto.class, target, texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).sendKeys(texto);
    }
}
