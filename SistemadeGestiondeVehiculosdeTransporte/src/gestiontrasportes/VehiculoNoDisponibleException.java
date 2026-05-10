/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */
//excepciones personalizadas clase vehiculonodisponible
public class VehiculoNoDisponibleException
        extends Exception {

    // Constructor vacío
    public VehiculoNoDisponibleException() {

    }

    // Constructor con mensaje
    public VehiculoNoDisponibleException(String mensaje) {

        // Envía el mensaje a la clase Exception
        super(mensaje);
    }
}
