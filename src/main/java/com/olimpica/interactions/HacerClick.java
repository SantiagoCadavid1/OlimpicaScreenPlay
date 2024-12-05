package com.olimpica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class HacerClick implements Interaction {
    private final Target target;

    public HacerClick(Target target) {
        this.target = target;
    }

    public static HacerClick on(Target target) {
        return Tasks.instrumented(HacerClick.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).click();
    }
}
