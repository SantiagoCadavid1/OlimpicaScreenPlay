package com.olimpica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EsperarElemento implements Interaction {
    private final Target target;
    private final Duration tiempoEspera;

    public EsperarElemento(Target target, Duration tiempoEspera) {
        this.target = target;
        this.tiempoEspera = tiempoEspera;
    }

    public static EsperarElemento forTime(Target target, Duration tiempoEspera) {
        return Tasks.instrumented(EsperarElemento.class, target, tiempoEspera);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), tiempoEspera);
        wait.until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
    }
}
