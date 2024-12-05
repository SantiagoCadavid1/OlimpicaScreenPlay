#language: es

Característica:  Registrar usuario pagina Olimpica

  @RegistrarUsuario

  Esquema del escenario: Registro usuario

    Dado  Que me encuentro en la pagina de Olimpica
    Cuando  Me dirijo a la seccion de registro e ingreso mi correo '<Correo>'
    Entonces Se me indicara que he recibido un correo con un codigo

    Ejemplos:
      | Correo                         |
##@externaldata@parametros/Datos.xlsx@Registro
   |registro_olimpica1@yopmail.com|
