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