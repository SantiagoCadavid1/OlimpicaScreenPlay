package com.olimpica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarInicioSesion implements Question<Boolean> {
    private final Target elemento;
    private final String correo;
    private final String nombre;

    public ValidarInicioSesion(Target elemento, String correo, String nombre){
        this.elemento = elemento;
        this.correo = correo;
        this.nombre = nombre;
    }

    @Override
    public Boolean answeredBy(Actor actor){
        String textoElemento = Text.of(elemento).answeredBy(actor).toString();
        return (textoElemento.equals(correo))||(textoElemento.equals(nombre)) ;
    }

    public static ValidarInicioSesion is(Target elemento, String correo, String nombre){
        return new ValidarInicioSesion(elemento, correo, nombre);
    }
}
