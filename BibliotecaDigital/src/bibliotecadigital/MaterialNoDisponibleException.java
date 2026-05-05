/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
//cuando se intenta prestar un material ya prestado
public class MaterialNoDisponibleException extends Exception {
    
    public MaterialNoDisponibleException() {
    }

    public MaterialNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}