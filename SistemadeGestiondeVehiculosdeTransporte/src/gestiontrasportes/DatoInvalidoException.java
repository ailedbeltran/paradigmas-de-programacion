/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */
//excepciones personalizadas clase datoinvalido
public class DatoInvalidoException
        extends Exception {

    // Constructor vacío
    public DatoInvalidoException() {

    }

    // Constructor con mensaje
    public DatoInvalidoException(String mensaje) {

        // Envía el mensaje a la clase Exception
        super(mensaje);
    }
}
