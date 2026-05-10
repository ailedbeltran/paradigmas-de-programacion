/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */
// segunda herencia de vehiculo
public class Motocicleta extends Vehiculo {

    // atributos
    private int cilindrada;

    // constructor vacío
    public Motocicleta() {

        this.cilindrada = 0;
    }

    // constructor con parametros
    public Motocicleta(String marca, String modelo,
                       int anio, boolean disponible,
                       int cilindrada)
            throws DatoInvalidoException {

        // se llama al constructor de la clase padre
        super(marca, modelo, anio, disponible);

        // validación de cilindrada
        if (cilindrada < 0) {

            // lnzamos la excepción si el valor es inválido
            throw new DatoInvalidoException(
                    "Cilindrada no valida");
        }

        // se inicializa el atributo
        this.cilindrada = cilindrada;
    }

    // método rentar
    @Override
    public void rentar()
            throws VehiculoNoDisponibleException {

        // verifica disponibilidad con el if
        if (!disponible) {

            // Lanza excepción si ya está rentada
            throw new VehiculoNoDisponibleException(
                    "La motocicleta ya se encuentra rentada rentada");
        }

        // Cambia el estado del vehiculo
        disponible = false;

        // Mensaje de éxito
        System.out.println("La motocicleta fue rentada correctamente");
    }

    // Getter de cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    // Setter de cilindrada
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}