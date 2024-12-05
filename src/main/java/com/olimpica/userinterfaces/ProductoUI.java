package com.olimpica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class ProductoUI {

    public static final Target BTN_AGREGAR_PRODUCTO =Target.the("Boton para agregar un producto al carrito")
            .locatedBy("//p[contains(text(),'Agregar')]");

    public static final Target TXT_CORREO_PRODUCTO = Target.the("Campo de texto para ingresar el correo")
            .locatedBy("//label[@class='vtex-input w-100']//input[@placeholder='Escribe tu correo']");

    public static final Target BTN_CONTINUAR_PRODUCTO = Target.the("Boton para agregar producto al carrito, luego de escribir correo")
            .locatedBy("//button//div[contains(text(),'Continuar')]");

    public static final Target BTN_AGREGAR_DIRECCION = Target.the("Boton para agregar producto al carrito, luego de escribir correo")
            .locatedBy("//button//div[contains(text(),'Agregar otra dirección')]");


    public static final Target OPT_DEPARTAMENTO = Target.the("Campo para seleccionar el departamento")
            .locatedBy("(//div[@class='css-dvua67-singleValue'])[1]");

    public static final Target OPT_CIUDAD = Target.the("Campo para seleccionar la ciudad")
            .locatedBy("(//div[@class='css-dvua67-singleValue'])[2]");

    public static final Target TXT_DIRECCION = Target.the("Campo de texto para ingresar la direccion")
            .locatedBy("//input[@id='autocomplete']");

    public static final Target BTN_ENVIAR_DATOS = Target.the("Boton para enviar datos de compra")
            .locatedBy("//div[@class='olimpica-advance-geolocation-0-x-buttonStyleAddShipping flex flex-row justify-center']//button");

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton para agregar producto al carrito")
            .locatedBy("//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--custom-btn-add']");

    public static final Target BTN_CARRITO = Target.the("Boton para ver el carrito")
            .locatedBy("//span[@class='vtex-minicart-2-x-minicartIconContainer gray relative']");

    public static final Target BTN_PAGAR = Target.the("Boton para ir a pagar")
            .locatedBy("//button[@id='proceed-to-checkout']");
}