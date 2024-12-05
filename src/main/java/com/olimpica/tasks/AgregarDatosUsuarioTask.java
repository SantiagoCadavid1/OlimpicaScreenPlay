package com.olimpica.tasks;

import com.olimpica.interactions.EsperarElemento;
import com.olimpica.interactions.HacerClick;
import com.olimpica.interactions.IngresarTexto;
import com.olimpica.utils.DatosExcel;
import io.cucumber.java.hu.Ha;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Scroll;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.olimpica.userinterfaces.BusquedaProductoUI.getBtnProducto;
import static com.olimpica.userinterfaces.DatosUsuarioUI.*;
import static com.olimpica.userinterfaces.InicioUI.BTN_MI_CUENTA;
import static com.olimpica.userinterfaces.InicioUI.LBL_CORREO;
import static com.olimpica.userinterfaces.ProductoUI.BTN_AGREGAR_CARRITO;
import static com.olimpica.userinterfaces.ProductoUI.BTN_AGREGAR_DIRECCION;

public class AgregarDatosUsuarioTask implements Task {
    private String cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String departamento;
    private String ciudad;
    private String direccion;

    public AgregarDatosUsuarioTask(){}

    @Override
    public <T extends Actor> void performAs(T actor){

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("Parametros/DatosUsuario.xlsx","DatosUsuario");
            this.cedula = dataExcel.get(0).get("Cedula");
            this.nombre = dataExcel.get(0).get("Nombre");
            this.apellido = dataExcel.get(0).get("Apellido");
            this.celular = dataExcel.get(0).get("Celular");
            this.departamento = dataExcel.get(0).get("Departamento");
            this.ciudad = dataExcel.get(0).get("Ciudad");
            this.direccion = dataExcel.get(0).get("Direccion");
        } catch (IOException e){
            e.printStackTrace();
        }

        actor.attemptsTo(
                HacerClick.on(LBL_CORREO),
                HacerClick.on(BTN_MI_CUENTA),
                EsperarElemento.forTime(TXT_VALIDACION_CEDULA, Duration.ofSeconds(15))
        );

        if (TXT_VALIDACION_CEDULA.isVisibleFor(actor)){
            actor.attemptsTo(
                    IngresarTexto.into(TXT_VALIDACION_CEDULA, cedula),
                    HacerClick.on(BTN_CONTINUAR_CEDULA)
            );
        }

        actor.attemptsTo(
                EsperarElemento.forTime(TXT_NOMBRE_DATOS, Duration.ofSeconds(45)),
                Clear.field(TXT_NOMBRE_DATOS),
                IngresarTexto.into(TXT_NOMBRE_DATOS, nombre),
                IngresarTexto.into(TXT_APELLIDO_DATOS, apellido),
                IngresarTexto.into(TXT_CELULAR_DATOS, celular),
                HacerClick.on(SLC_DEPARTAMENTO_DATOS),
                HacerClick.on(getOpt(departamento)),
                HacerClick.on(SLC_CIUDAD_DATOS),
                HacerClick.on(getOpt(ciudad)),
                IngresarTexto.into(TXT_DIRECCION_DATOS, direccion),
                Scroll.to(BTN_GUARDAR_CAMBIOS).andAlignToBottom(),
                HacerClick.on(getChB("1")),
                HacerClick.on(getChB("2")),
                HacerClick.on(getChB("3")),
                HacerClick.on(BTN_GUARDAR_CAMBIOS),
                HacerClick.on(BTN_CERRAR_POPUP)
        );


    }

    public static AgregarDatosUsuarioTask datosGenericos(){ return new AgregarDatosUsuarioTask() ;}
}
