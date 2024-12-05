#language: es

Característica:  Agregar datos de usuario en la pagina de Olimpica (puntos extra)

  @DatosUsuario

  Esquema del escenario: Agregar datos de usuario

    Dado  Que me encuentro en la pagina de Olimpica
    Cuando  Selecciono la opcion para iniciar sesion ingreso mi correo '<Correo>' y clave '<Clave>'
    Y Me dirijo a mi cuenta y completo los campos necesarios
    Entonces Validare que los datos hayan sido correctamente guardados

    Ejemplos:
      | Correo | Clave |
##@externaldata@parametros/Datos.xlsx@InicioSesion
   |login_olimpica1@yopmail.com   |Pruebas1|
