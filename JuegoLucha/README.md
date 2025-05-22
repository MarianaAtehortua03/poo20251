Descripción

Este proyecto implementa un juego de lucha por turnos en Java, utilizando los principios fundamentales de la Programación Orientada a Objetos (POO): encapsulamiento, herencia, polimorfismo, composición y agregación.

El juego enfrenta a dos personajes: un Cazador y un Hechicero, cada uno con atributos y ataques distintos. Los personajes se alternan turnos para atacarse, hasta que uno pierde todos sus puntos de vida. El juego se ejecuta en consola y permite al usuario ingresar los nombres de los personajes y controlar el ataque por turnos.

Análisis previo
La idea central era representar una batalla sencilla en consola, con las siguientes condiciones:

Cada personaje tiene un nombre, puntos de vida y un arma.
Cada clase hija (Cazador, Hechicero) implementa su propio método atacar, con distintos niveles de daño.
Se creó una clase JuegoLucha que controla el flujo del juego.
El combate se repite en turnos hasta que uno de los dos jugadores pierda toda su vida.

Se usaron:

Clases y herencia: para representar personajes y sus comportamientos.
Ciclos while: para mantener la pelea mientras ambos estén vivos.
Condicionales if: para verificar opciones del jugador y determinar al ganador.

Principios POO Aplicados
Encapsulamiento: Los atributos de las clases están protegidos y se accede a ellos mediante métodos públicos (getters). Esto protege el estado interno de los objetos.

Herencia: La clase Personaje es abstracta y define la estructura común para los personajes del juego. Cazador y Hechicero heredan de esta clase y personalizan el comportamiento del método atacar.

Polimorfismo: El método atacar está declarado en la superclase como abstracto y es implementado de forma diferente en Cazador y Hechicero. Así al llamar atacar desde un objeto de tipo Personaje, se ejecuta la versión correspondiente según el tipo real del objeto.

Composición: Cada personaje tiene un arma, representada por un objeto de la clase Arma, que se le asigna en el constructor. El arma afecta el daño causado en el ataque.

Agregación: Las armas son creadas fuera de los personajes y luego asociadas a ellos. La relación entre Personaje y Arma no implica dependencia estricta (pueden existir por separado).

Estructura General del Código

Arma: clase que representa un arma con nombre y daño adicional.
Personaje: clase abstracta base que define los atributos y métodos comunes a todos los personajes.
Cazador: personaje con mayor vida base y ataque físico con daño aleatorio.
Hechicero: personaje con menos vida pero ataque mágico con daño aleatorio.
JuegoLucha: clase principal que ejecuta el juego, pide entrada del usuario, alterna turnos y determina al ganador.

Ejecución
El usuario debe ejecutar la clase JuegoLucha, ingresar los nombres de los personajes, y observar cómo se desarrolla la batalla turno a turno hasta que uno de ellos quede sin vida.
