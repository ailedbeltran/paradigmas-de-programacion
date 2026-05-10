/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */

public class Principal {
    public static void main(String[] args) {

        try {

            // Creación de un objeto Automovil
            Automovil auto =
                    new Automovil(
                            "Toyota",
                            "Corolla",
                            2020,
                            true,
                            4);

            // Creación de un objeto Motocicleta
            Motocicleta moto =
                    new Motocicleta(
                            "Honda",
                            "CBR",
                            2021,
                            true,
                            600);

            // Creación de un objeto Camion
            Camion camion =
                    new Camion(
                            "Ford",
                            "FH",
                            2019,
                            true,
                            20.5);

            // Mensaje de confirmación
            System.out.println("Vehiculos registrados");

            // Renta del automóvil
            auto.rentar();

            // Intenta volver a rentar el mismo automóvil
            auto.rentar();

        // Captura errores de datos inválidos
        } catch (DatoInvalidoException e) {

            // Muestra mensaje de error
            System.out.println(
                    "Error de datos: "
                            + e.getMessage());

        // Captura errores de disponibilidad
        } catch (VehiculoNoDisponibleException e) {

            // Muestra mensaje de error
            System.out.println(
                    "Error en renta: "
                            + e.getMessage());
        }

        try {

            // Intento de crear un automóvil con año inválido
            Automovil autoError =
                    new Automovil(
                            "Kia",
                            "Focus",
                            1800,
                            true,
                            4);

        // Captura excepción por datos inválidos
        } catch (DatoInvalidoException e) {

            // Muestra mensaje de error
            System.out.println(
                    "Error: "
                            + e.getMessage());
        }
    }
}