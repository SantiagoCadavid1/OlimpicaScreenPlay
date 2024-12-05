package com.olimpica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickJavaScript implements Interaction {
    private final Target target;

    public ClickJavaScript(Target target) {
        this.target = target;
    }

    public static ClickJavaScript on(Target target) {
        return Tasks.instrumented(ClickJavaScript.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement element = target.resolveFor(actor);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
}
