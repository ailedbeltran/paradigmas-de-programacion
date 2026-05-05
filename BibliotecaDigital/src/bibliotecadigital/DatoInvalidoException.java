/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
// cuando se ingresa un dato invalido (ej. año negativo)
public class DatoInvalidoException extends Exception {
    
    public DatoInvalidoException() {
    }
    
    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}