Juego de Lucha en Java

Descripción General: Este proyecto implementa un juego de lucha por turnos en Java, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO): encapsulamiento, herencia, polimorfismo, composición y agregación.

El juego enfrenta a dos personajes: un Cazador y un Hechicero, cada uno con un arma propia y ataques con rangos de daño diferentes. Los personajes se alternan para atacarse hasta que uno de ellos pierde todos sus puntos de vida. El juego se ejecuta completamente por consola y permite ingresar los nombres de los personajes, viendo el desarrollo del combate paso a paso.

Descripción de la solución
Para abordar este ejercicio, diseñé una estructura basada en clases que me permitiera reutilizar código, separar responsabilidades y aplicar los principios de la POO de manera clara. El proceso fue:

Diseñar una clase abstracta Personaje con los atributos comunes: nombre, puntos de vida y arma. Esta clase define el método atacar() como abstracto para que las subclases implementen su propio comportamiento.

Crear las subclases Cazador y Hechicero que heredan de Personaje, con su lógica de ataque diferenciada. El Cazador tiene un rango de daño entre 15 y 25, mientras que el Hechicero tiene un rango de daño entre 10 y 20.

Aplicar encapsulamiento, haciendo que los atributos clave sean privados o protegidos y controlando el acceso a través de métodos públicos donde es necesario (por ejemplo, getters para el nombre o verificación de si el personaje sigue con vida).

Usar composición, ya que cada personaje tiene un objeto Arma que modifica su ataque.

Usar agregación, permitiendo que los objetos Arma sean creados externamente y luego asociados a un personaje, manteniéndose independientes.

Desarrollar la clase JuegoLucha, que controla el flujo del combate con estructuras while para los turnos y if para controlar las condiciones de victoria.

Análisis previo
Al plantear la solución, identifiqué las siguientes condiciones:

El combate debía ser por turnos, permitiendo alternancia entre los personajes.

Cada personaje tiene un nombre, puntos de vida y un arma.

Las subclases deberían tener su propio comportamiento de ataque.

El juego debe terminar cuando uno de los dos quede sin puntos de vida.

Estructura del proyecto
Arma: Clase simple con nombre y daño adicional.

Personaje (abstracta): Contiene atributos y comportamientos comunes a todos los personajes.

Cazador: Personaje con más vida base y ataque físico entre 15 y 25 puntos.

Hechicero: Personaje con menos vida pero ataque mágico entre 10 y 20 puntos.

JuegoLucha: Clase principal que maneja la ejecución del combate, lectura de datos y turnos.

Principios de POO aplicados
Encapsulamiento: Los atributos están protegidos y no se accede directamente a ellos desde fuera.

Herencia: Cazador y Hechicero extienden de Personaje.

Polimorfismo: El método atacar() es implementado de forma distinta según el tipo de personaje.

Composición: Personaje contiene un objeto Arma que modifica el daño causado.

Agregación: El arma se asocia al personaje pero puede existir por separado.

Ejecución
Para ejecutar el juego:

Corre la clase JuegoLucha.

Ingresa los nombres para el Cazador y el Hechicero.

Observa cómo se desarrolla el combate, turno por turno.

El juego termina cuando uno de los personajes pierde toda su vida y se anuncia al ganador.

