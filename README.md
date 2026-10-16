# 2026_bateria_ejercicios

Este repositorio tiene un montón de clases Java para repasar. Lo ideal sería tener un proyecto por cada enunciado, pero para no crear 40 repositorios, los dejaré todos aquí.

## Termostato

Crea una clase Termostato. Todo termostato empieza marcando 20 grados. La temperatura del termostato puede subir o bien grado a grado o bien un número de grados "de golpe". Lo mismo ocurre cuando baja la temperatura.

Añade un método que devuelve la temperatura del termostato y otro que imprima la temperatura actual.

La clase principal deberá crear dos termostatos y, en uno, poner la temperatura a 10 grados y mostrarla y, en otro, poner la temperatura a 30 grados y mostrarla.

##  Conversor de unidades

Crea una aplicación que modele un Conversor de unidades. Un conversor puede pasar de kilómetros a millas (1km=0,621 millas) y de grados celsius a fahrenheit (f=c*1,88+32).

La clase principal deberá pedir un número de km al usuario y mostrar cuántas millas son y pedir una temperatura en grados celsius y mostrar cuántos grados farenheit son.

## Libros

Un Libro tiene título, autor, número de páginas y una referencia a la página en la que nos encontramos. El título, autor y número de páginas se indica al crear el libro. La página actual empieza siempre en cero. Un libro tendrá un método leer que avanzará una única página y un método que indica cuántas páginas faltan para terminarlo. El resultado de imprimir un objeto de la clase Libro es algo así como: "El Quijote (Cervantes) - Página 120 de 1250".

## Teléfonos y baterías

Un movil nuevo tiene una batería. Por defecto, una batería tiene 3.000 mAh de capacidad. También se puede crear un móvil con una batería de una capacidad distinta. Cuando el móvil hace una llamada de X minutos, la batería pierde 20 mAh por minuto. Cuando el móvil hace una foto, la batería pierde 5 mAh. Si hace varias fotos, pierde 5 mAh por foto. La batería puede cargarse, ganando 50 mAh por minuto de carga. Cada operación debe imprimir la carga restante. Tú, como usuario, solo te comunicas con el teléfono, es el teléfono el que se comunica con la batería.

## Caballeros y dragones

Crea una clase Caballero y otra Dragon. Los dos tienen nombre y puntos de vida. El caballero empieza con 120 y el dragón con 300. el caballero tiene un nivel de armadura de 20 puntos que es indestructible (sus puntos nunca bajan).

El dragón puede atacar a un caballero con unos puntos de daño. Un dragón siempre ataca, como mínimo, con 20 puntos de ataque. El caballero pierde el daño menos su armadura. Por ejemplo: con daño 30 y armadura 10, pierde 20.

El caballero puede atacar al dragón con unos puntos de daño. El dragón no tiene armadura.

El caballero puede beber una poción que le cura 25 puntos, o los puntos indicados.

Tanto los caballeros como los dragones tienen que tener un método para obtener sus puntos de vida restantes y un toString().

En la clase principal, simula un combate de 4 turnos y muestra el estado final. Cada acción de los personajes tiene que ser impresa por pantalla.

## Peces

Un Pez tiene nombre y niveles de hambre, energía y peso en gramos.

Cada pez tiene un nombre distinto, pero todos empiezan con 30 de hambre, 80 de energía y 50 de peso.

Un pez puede comer unos gramos de comida. Por cada gramo, su hambre baja 4 puntos y su peso sube 1 punto.

Un pez puede nadar un número determinado de minutos. Por cada minuto, su energía baja 3 puntos y su hambre sube 2.

Un pez puede descansar un número de horas. Por cada hora, su energía sube 10 y su hambre sube 1.

Implementa un método mostrarEstado() y un toString() para el pez.