package com.olimpica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DatosUsuarioUI {

    public static final Target TXT_VALIDACION_CEDULA = Target.the("Campo de texto para ingresar la cedula por primera vez")
            .locatedBy("//label[@class='olimpica-account-0-x-mb20 olimpica-account-0-x-displayBlock']//input[@class='olimpica-account-0-x-inputText olimpica-account-0-x-expanded']");

    public static final Target BTN_CONTINUAR_CEDULA = Target.the("Boton para enviar cedula de validacion")
            .locatedBy("//button[@class='olimpica-account-0-x-buttonRed olimpica-account-0-x-buttonRed--expanded']");

    public static final Target TXT_NOMBRE_DATOS = Target.the("Campo de texto para ingresar el nombre del usuario")
            .locatedBy("//input[@placeholder='Escribe tus nombres']");

    public static final Target TXT_APELLIDO_DATOS = Target.the("Campo de texto para ingresar el apellido del usuario")
            .locatedBy("//input[@placeholder='Escribe tu primer apellidos']");

    public static final Target TXT_CELULAR_DATOS = Target.the("Campo de texto para ingresar el celular del usuario")
            .locatedBy("//input[@placeholder='Escribe tu número de celular']");

    public static final Target TXT_DIRECCION_DATOS = Target.the("Campo de texto para ingresar la direccion del usuario")
            .locatedBy("//input[@placeholder='Escribe tu dirección de contacto']");

    public static final Target SLC_DEPARTAMENTO_DATOS = Target.the("Select para seleccion del departamento")
            .locatedBy("//select[@data-gtm-form-interact-field-id]");

    public static final Target SLC_CIUDAD_DATOS = Target.the("Select para seleccion de ciudad")
            .locatedBy("//select[option[contains(text(),'Seleccione una ciudad')]]");

    public static final Target BTN_GUARDAR_CAMBIOS = Target.the("Boton para guardar cambios")
            .locatedBy("//button[contains(text(),'Guardar cambios')]");

    public static final Target BTN_CERRAR_POPUP = Target.the("Boton para cerrar pop up")
            .locatedBy("//div[@class='olimpica-account-0-x-close']//img[@src='https://olimpica.vtexassets.com/_v/public/assets/v1/published/olimpica.account@0.0.24/public/react/479e907b22b8a5a3866ad8ae88f3004e.svg']");

    public static Target getOpt (String lugar){
        return Target.the(String.format("Boton para seleccionar %s", lugar))
                .locatedBy(String.format("//option[@value='%s']", lugar));
    }

    public static Target getChB (String index){
        return Target.the(String.format("Boton para seleccionar el checkbox numero %s", index))
                .locatedBy(String.format("//div[@class='olimpica-account-0-x-flex olimpica-account-0-x-alignItemsCenter']//label[%s]", index));
    }

}
