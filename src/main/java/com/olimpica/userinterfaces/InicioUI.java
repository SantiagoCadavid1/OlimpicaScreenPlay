package com.olimpica.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {

    public static final Target BTN_INICIO_SESION =Target.the("Boton de inicio sesion")
            .locatedBy("//div[@class='vtex-login-2-x-container flex items-center fr']//button");

    public static final Target BTN_NUEVO_REGISTRO = Target.the("Boton registro de usuario nuevo")
            .locatedBy("//a[@href='/login?returnUrl=%2Faccount%23%2Fsignup']");

    public static final Target BTN_LOGIN_CORREO = Target.the("Boton para iniciar sesion con correo")
            .locatedBy("//div[@class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn']//button");

    public static final Target TXT_LOGIN_CORREO = Target.the("Campo de texto para ingresar correo")
            .locatedBy("//div[@class='vtex-login-2-x-inputContainer vtex-login-2-x-inputContainerEmail']//input");

    public static final Target TXT_LOGIN_CLAVE = Target.the("Campo de texto para ingresar la clave")
            .locatedBy("//div[@class='vtex-login-2-x-inputContainer vtex-login-2-x-inputContainerPassword pv3 flex flex-column']//input");

    public static final Target BTN_LOGIN_SEND = Target.the("Boton para completar el login")
            .locatedBy("//div[@class='vtex-login-2-x-sendButton ml-auto']//span");

    public static final Target LBL_CORREO = Target.the("Etiqueta donde se encuentra el nombre o correo del usuario")
            .locatedBy("//span[@class='vtex-login-2-x-profile truncate t-action--small order-1 pl4 gray dn db-l']");

    public static final Target TXT_BUSCAR_PRODUCTO = Target.the("Campo de texto para buscar un producto")
            .locatedBy("//input[@id='downshift-0-input']");

    public static final Target BTN_MI_CUENTA = Target.the("Boton para ir a la seccion de mi cuenta")
            .locatedBy("//a[@href='/account#/myprofile']");
}
