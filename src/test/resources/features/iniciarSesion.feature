#language: es

Característica:  Iniciar sesion pagina Olimpica

  @IniciarSesion

  Esquema del escenario: Inicio de sesion

    Dado  Que me encuentro en la pagina de Olimpica
    Cuando  Selecciono la opcion para iniciar sesion ingreso mi correo '<Correo>' y clave '<Clave>'
    Entonces Validare que haya iniciado sesion con el correo '<Correo>' o con el nombre '<Nombre>'

    Ejemplos:
      | Correo | Clave | Nombre |
##@externaldata@parametros/Datos.xlsx@InicioSesion
   |login_olimpica1@yopmail.com   |Pruebas1   |Pruebas|
   |login_olimpica2@yopmail.com   |Pruebas2   |Pruebas|
   |login_olimpica3@yopmail.com   |Pruebas3   |Pruebas|

