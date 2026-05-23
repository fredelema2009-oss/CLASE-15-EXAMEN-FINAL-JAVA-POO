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

// Definimos la clase padre que representa a cualquier mascota del sistema
public class Mascota {

    // Declaramos los atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private int edad;

    // Construimos el objeto mascota con sus datos iniciales
    public Mascota(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

     // Retornamos el id de la mascota
    public int getId() {
        return id;
    }

    // Asignamos un nuevo id a la mascota
    public void setId(int id) {
        this.id = id;
    }

    // Retornamos el nombre de la mascota
    public String getNombre() {
        return nombre;
    }

    // Asignamos un nuevo nombre a la mascota
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Retornamos la edad de la mascota
    public int getEdad() {
        return edad;
    }

    // Asignamos una nueva edad a la mascota
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Mostramos la información general de la mascota en consola
    public void mostrarInfo() {
        System.out.println("------------------------------");
        System.out.println("ID     : " + id);
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad + " año(s)");
        System.out.println("Tipo   : " + this.getClass());
        System.out.println("Sonido : " + hacerSonido());
        System.out.println("------------------------------");
    }

    // Retornamos un sonido genérico, las subclases lo sobreescriben
    public String hacerSonido() {
        return "... sonido genérico ...";
    }
}
