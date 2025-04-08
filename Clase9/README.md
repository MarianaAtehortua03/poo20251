Este proyecto fue desarrollado como ejercicio práctico para aplicar los conceptos de Programación Orientada a Objetos en Java. El sistema simula la creación de pedidos que incluyen productos como cámaras y servicios de impresión de fotos. También incluye el registro de clientes y el manejo de información relevante como la fecha del pedido y la forma de pago.

Conceptos aplicados

1. Herencia y Polimorfismo
Utilicé herencia creando una clase general llamada Producto, que tiene un atributo común llamado numero. Luego cree dos clases hijas que heredan de Producto: Camara e Impresion. Esto me permitió reutilizar el atributo numero sin tener que duplicar código.
Apliqué polimorfismo al momento de guardar diferentes tipos de productos (como una cámara o una impresión) dentro de un mismo arreglo de tipo Producto. Gracias a esto puedo manejar todos los productos de forma general en el arreglo, pero cada uno sigue comportándose de forma distinta según su clase específica.

2. Composición y Agregación
Use composición en la clase Impresion, ya que una impresión contiene varias fotos. Si se elimina la impresión las fotos dejan de tener sentido en este contexto. Por eso las fotos están totalmente contenidas en la impresión.
Por otro lado implemente agregación en la clase Pedido, ya que un pedido tiene productos y un cliente, pero estos objetos existen por sí mismos. Es decir, si se borra el pedido, los productos y el cliente podrían seguir existiendo de manera independiente.

3. ¿Arreglos o ArrayList?
Para este proyecto decidí usar arreglos, ya que es lo que hemos trabajado en clase y cumple bien con lo que necesito: almacenar una cantidad fija de productos y fotos.

Sin embargo si el sistema creciera o si necesitara que los usuarios agregaran productos o fotos dinámicamente (sin saber cuántos exactamente desde el inicio) entonces sería más conveniente usar ArrayList. ArrayList permite agregar o quitar elementos fácilmente y tiene métodos útiles que facilitan el trabajo, pero también introduce más complejidad.