/*
CLASE 15: EXAMEN FINAL — PROGRAMACIÓN (JAVA POO)
Autor: Frederick Lema

Curso: Bootcamp Programación Cero a POO
Clase: 15 — Examen Final

Fecha: 22 de mayo del 2026
Tema:Sistema de gestión de mascotas

Enunciado: Sistema de gestión de mascotas
Se desea desarrollar una aplicación en consola que permita gestionar diferentes
tipos de mascotas.
El sistema debe permitir crear mascotas, almacenarlas en una lista, mostrarlas y
ejecutar acciones propias de cada tipo de mascota.
Todas las mascotas comparten características generales, pero cada tipo tiene un
comportamiento diferente.
*/

// Heredamos de Mascota para representar específicamente a un gato
public class Gato extends Mascota {

    // Construimos el objeto Gato pasando los datos al constructor padre
    public Gato(int id, String nombre, int edad) {
        // Llamamos al constructor de la clase padre
        super(id, nombre, edad);
    }

    // Sobreescribimos el sonido específico que hace un gato
    @Override
    public String hacerSonido() {
        return "¡Miau!";
    }
}
