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

// Iniciamos la aplicacion desde el metodo main, punto de entrada del programa
public class App {

    public static void main(String[] args) {

        // Creamos el gestor que controlara todo el sistema de mascotas
        GestorMascotas gestor = new GestorMascotas();

        // ---- CASOS DE PRUEBA: registrar mascotas ----

        // Registramos mascotas validas de distintos tipos
        gestor.registrarMascota(new Perro(1, "Firulais", 3));
        gestor.registrarMascota(new Gato(2, "Michi", 5));
        gestor.registrarMascota(new Ave(3, "Piolín", 1));

        // Registramos con ID igual a 0 (debe mostrar error)
        gestor.registrarMascota(new Perro(0, "Rex", 2));

        // Registramos con edad negativa (debe mostrar error)
        gestor.registrarMascota(new Gato(4, "Luna", -1));

        // ---- Mostramos todas las mascotas registradas ----
        gestor.mostrarTodasLasMascotas();

        // ---- Ejecutamos sonido buscando por ID ----
        gestor.ejecutarSonidoPorId(2);

        // ---- Buscamos una mascota que existe por nombre ----
        gestor.buscarPorNombre("Firulais");

        // ---- Buscamos una mascota que NO existe (debe mostrar "no encontrada") ----
        gestor.buscarPorNombre("Thor");
    }
}

