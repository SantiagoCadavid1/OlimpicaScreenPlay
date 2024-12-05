package com.olimpica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarProductoAgregado implements Question<Boolean> {
    private final Target elemento;
    private final String producto;

    public ValidarProductoAgregado(Target elemento, String producto){
        this.elemento = elemento;
        this.producto = producto;
    }

    @Override
    public Boolean answeredBy(Actor actor){
        String textoElemento = Text.of(elemento).answeredBy(actor).toString().toLowerCase();
        return textoElemento.equals(producto.toLowerCase());
    }

    public static ValidarProductoAgregado is(Target elemento, String producto){
        return new ValidarProductoAgregado(elemento, producto);
    }
}
