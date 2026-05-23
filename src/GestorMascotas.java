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

import mascotas.Mascota;
import mascotas.Perro;
import mascotas.Gato;
import mascotas.Ave;

import java.util.ArrayList;

// Gestionamos toda la logica del sistema: registro y visualizacion de mascotas
public class GestorMascotas {

    // Inicializamos la lista que almacenara todas las mascotas registradas
    ArrayList<Mascota> listaMascotas = new ArrayList<>();

    // Registramos una nueva mascota y la agregamos a la lista
    public void registrarMascota(Mascota mascota) {

        // Validamos que el ID sea mayor a 0
        if (mascota.getId() <= 0) {
            System.out.println("Error: el ID debe ser mayor a 0. Registro cancelado.");
            return;
        }

        // Validamos que la edad sea mayor a 0
        if (mascota.getEdad() <= 0) {
            System.out.println("Error: la edad debe ser mayor a 0. Registro cancelado.");
            return;
        }

        // Agregamos la mascota a la lista si paso las validaciones
        listaMascotas.add(mascota);
        System.out.println("Mascota registrada: " + mascota.getNombre());
    }
    // Mostramos todas las mascotas registradas recorriendo la lista
    public void mostrarTodasLasMascotas() {
        System.out.println("--- LISTA DE MASCOTAS ---");

        // Verificamos si la lista no tiene ninguna mascota
        if (listaMascotas.size() == 0) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        // Recorremos la lista y mostramos la informacion de cada mascota
        // Aplicamos polimorfismo: cada objeto ejecuta su propio hacerSonido()
        for (Mascota m : listaMascotas) {
            m.mostrarInfo();
            System.out.println("Sonido : " + m.hacerSonido());
            System.out.println("----------------------");
        }
    }

    // Buscamos una mascota por ID y ejecutamos su sonido
    public void ejecutarSonidoPorId(int idBuscado) {
        System.out.println("--- SONIDO POR ID ---");

        // Recorremos la lista buscando la mascota con ese ID
        boolean encontrada = false;

        for (Mascota m : listaMascotas) {
            if (m.getId() == idBuscado) {
                // Ejecutamos el sonido del objeto encontrado (polimorfismo)
                System.out.println(m.getNombre() + " dice: " + m.hacerSonido());
                encontrada = true;
            }
        }

        // Informamos si no se encontro ninguna mascota con ese ID
        if (encontrada == false) {
            System.out.println("Mascota no encontrada.");
        }
    }
}
