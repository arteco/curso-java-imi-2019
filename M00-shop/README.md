# curso-java-imi-2019


## __Objetivos__
- _Crear una aplicación web_ de cero con:
  - Spring Boot (IoC + MVC)
  - Vistas html thymeleaf
  - Formularios con validaciones
  - Con test unitarios
  - Con diferentes backends para los datos

- _Crear una aplicación web_ de cero con:
  - Separación de responsabilidades
  - Diseño de componentes
  - Encapsulado con interfaces
  - Aprendizaje de Spring Framework


- _Crear una aplicación web_ que consista en:
  - Creación de una __TIENDA ONLINE__
  - Con requisitos funcionales
  - Sin incluir el proceso de pago


## __Requisitos__
- _Perfiles de usuario_ :
  - __GESTOR__: puede gestionar el stock de productos
  - __CLIENTE__: puede comprar uno o más productos

- _Requisitos funcionales_ :
  - El gestor debe poder dar de alta, modificar, consultar y eliminar cualquier producto de su stock
  - El gestor debe poder asignar un precio y cantidad a los productos de su stock

- _Requisitos funcionales_ :
  - El comprador puede comprar cualquier producto disponible
  - El comprador partirá con un carrito vacío y podrá comprar cualquier producto disponible en stock
  - Al añadir un producto al carrito, el stock disponible en la tienda se debe reducir

- _Requisitos funcionales_ :
  - Si el cliente cancela la compra se debe restaurar el stock
  - Si el cliente confirma la compra se debe registrar la compra
  - El gestor debe poder ver un resumen de las compras realizadas


## __Modelo de datos__
- Definición de _item_:
  - _id_: Long
  - _name_: String
  - _unitPrice_: BigDecimal
  - _stock_: Long


## __Diseño técnico__
- Un único punto de entrada _ShopEnvironment_:
~~~
ShopEnvironment env = new InMemmoryShopEnvironment();
Shop shop = env.getShop();
shop.addItemToStock(new Item(1L,"Awesome item",100.), 3);
Asserts.assertTrue(shop.countStock()>0);
~~~


- Debe ser una __Interfaz__.
- El resto de objetos deben obtenerse desde él.
- Ejemplo: _getShop_, _getNewCustomer_,...
- Para el manager: _getManager_(usu,pass)


## __Metodología__
- 1º __escribir los tests del gestor__: El gestor debe poder interactuar con el stock
- Ejemplo: _añadir item_, _eliminar item_, _consultar el stock_,...

- 2º __crear una implementación de Shop__, por ejemplo _ShopImpl_ que contenga el cuerpo de los métodos de la interfaz.
- En este punto deberían ejecutarse bien todos los tests.

- 3º, mejorar la implementación para que se cubran _todos los casos de test del manager_: Altas de nuevo stock, bajas, modificaciones (de precio, de cantidades, de la descripción), etc.
- 4º, Realizar los mismos pasos para el _cliente_.


## __Cómo__ empezar
- Herramienta de construcción:
  - __MAVEN__
- Quick Start:
  - <https://start.spring.io>
- Desarrollo orientado a Tests (TDD):
  - Web y Junit: [Guía Oficial Spring](https://spring.io/guides/gs/testing-web/)


- Crear de _nuevo proyecto_ 
- Inclusión de _dependencias_
- Creación de _modelo de datos_
- Creación de los _test unitarios_


## _Gracias_ ;)

- __Ramón Arnau__
  - Director de Operaciones
    - Ingeniero Informático
    - MBA / MTIN y Formador en TIC
  - [rarnau@arteco-consulting.com](mailto:rarnau@arteco-consulting.com)
  - [\@ramonchu](http://twitter.com/ramonchu)
  - [Arteco Consulting Sl](http://www.arteco-consulting.com)