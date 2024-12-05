package com.olimpica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.targets.Target;


public class ValidarRegistroUsuario implements Question<Boolean> {
    private final Target elemento;
    private final String placeholder;

    public ValidarRegistroUsuario(Target elemento, String placeholder){
        this.elemento = elemento;
        this.placeholder = placeholder;
    }

    @Override
    public Boolean answeredBy(Actor actor){
        String actualPlaceholder = Attribute.of(elemento).named("placeholder").answeredBy(actor);
        return placeholder.equals(actualPlaceholder);
    }

    public static ValidarRegistroUsuario is(Target elemento, String placeholder){
        return new ValidarRegistroUsuario(elemento, placeholder);
    }
}
