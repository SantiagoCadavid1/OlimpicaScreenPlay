package com.olimpica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class LoginUI {

    public static final Target BTN_REGISTRO = Target.the("Boton registro de usuario")
            .locatedBy("//a[@class='vtex-login-2-x-dontHaveAccount link dim c-link t-small']");

    public static final Target TXT_REGISTRO_EMAIL = Target.the("Campo de texto para ingresar correo")
            .locatedBy("//input[@name='email']");

    public static final Target BTN_ENVIAR_REGISTRO = Target.the("Boton para enviar registro")
            .locatedBy("//button//span[contains(text(),'Enviar')]");

    public static final Target TXT_CODIGO = Target.the("Campo de texto para ingresar codigo de acceso")
            .locatedBy("//label[@class='vtex-input w-100']//input[@name='token']");


}
