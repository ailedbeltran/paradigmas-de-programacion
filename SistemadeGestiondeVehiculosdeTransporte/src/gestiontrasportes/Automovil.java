/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */
// herencia con vehiculo 
public class Automovil extends Vehiculo {

    // Atributos
    private int numeroPuertas;

    // Constructor vacío
    public Automovil() {

        this.numeroPuertas = 0;
    }

    // Constructor con parametros
    public Automovil(String marca, String modelo,int anio, boolean disponible,int numeroPuertas)
    throws DatoInvalidoException {

        // llamamos al constructor de la clase base
        super(marca, modelo, anio, disponible);

        // validamos el numero de puertas
        if (numeroPuertas < 0) {

            // se lanza la excepción si el valor es inválido
            throw new DatoInvalidoException(
                    "Numero de puertas invalido");
        }

        // Inicializamos el atributo
        this.numeroPuertas = numeroPuertas;
    }

    // Sobrescritura del método rentar
    @Override
    public void rentar()
            throws VehiculoNoDisponibleException {

        // Verifica si el vehículo ya está rentado
        if (!disponible) {

            // Lanza excepción si no está disponible
            throw new VehiculoNoDisponibleException(
                    "El automovil se encuentra rentado por el momento");
        }

        // Cambia el estado a no disponible
        disponible = false;

        // Mensaje de confirmación
        System.out.println("El automovil fue rentado correctamente");
    }

    // getters y setters :) 
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
 