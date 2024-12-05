package com.olimpica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaProductoUI {


    public static Target getBtnProducto (String producto){
        return Target.the(String.format("Boton del producto %s", producto))
                .locatedBy(String.format("//span[contains(text(),'%s')]", producto));
    }

}
