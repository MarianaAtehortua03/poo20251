Mariana Atehortua Grajales - Daniel Arboleda Valencia - Anwar Joseph Palacios Bejarano

Este proyecto en Java fue desarrollado como ejercicio práctico para aplicar los conceptos fundamentales de la programación orientada a objetos.

Simula un sistema de pedidos de productos fotográficos (como cámaras e impresiones), incluyendo relaciones como herencia, polimorfismo, composición y agregación.

Conceptos 

1. Herencia y Polimorfismo
- Las clases “Camara” e “Impresion” heredan de “Producto”.
- Cada una sobreescribe el método “getDescripcion()” para mostrar una descripción personalizada. Este es un ejemplo de polimorfismo.

2. Composición y Agregación
- “Pedido” tiene un atributo “Cliente” y un arreglo de “Producto[]”, esto es agregación, el cliente y productos existen independientemente del pedido.
- “Impresion” contiene un arreglo de “Foto[]”, lo que representa composición, las fotos no existen sin la impresión.

3. ¿Arreglos o ArrayList?
Para este proyecto decidimos usar arreglos, ya que es lo que hemos trabajado en clase y cumple bien con lo que necesitamos: almacenar una cantidad fija de productos y fotos.

Sin embargo si el sistema creciera o si necesitara que los usuarios agregaran productos o fotos dinámicamente (sin saber cuántos exactamente desde el inicio) entonces sería más conveniente usar ArrayList. ArrayList permite agregar o quitar elementos fácilmente y tiene métodos útiles que facilitan el trabajo, pero también introduce más complejidad.

Mejoras implementadas

Encapsulamiento: Todos los atributos de las clases se mantienen "private". Se añadieron métodos "getters" y "setters" donde fue necesario.

Validaciones básicas: Se implementaron validaciones en los constructores, por ejemplo: El "Cliente" no puede tener una cédula o nombre vacío y la "Foto" no se puede crear con un nombre de archivo vacío o nulo.

Métodos utiles adicionales
Se agregó el método "mostrarFotos()" en la clase "Impresion", que imprime todas las fotos asociadas.
El método "toString()" de la clase "Pedido" ahora utiliza "SimpleDateFormat" para mostrar la fecha en formato legible.