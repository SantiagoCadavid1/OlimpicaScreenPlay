#language: es

Característica:  Agregar producto al carrito de Olimpica

  @AgregarProducto

  Esquema del escenario: Agregar producto al carrito

    Dado  Que me encuentro en la pagina de Olimpica
    Cuando  Busco la marca '<Marca>' y selecciono el producto '<Producto>' y agrego el producto al carrito con el correo '<Correo>'
    Entonces Validare que el producto '<Producto>' haya sido agregado al carrito

    Ejemplos:
      | Marca | Producto | Correo |
##@externaldata@parametros/Datos.xlsx@AgregarProducto
   |Iphone   |iPhone 15 de128Gb Rosa   |login_olimpica1@yopmail.com|

