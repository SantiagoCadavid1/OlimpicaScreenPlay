package com.olimpica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target LBL_PRODUCTO_CARRITO = Target.the("Campo donde se puede ver el nombre del producto en el carrito")
            .locatedBy("//td[@class='product-name']//a");

}
