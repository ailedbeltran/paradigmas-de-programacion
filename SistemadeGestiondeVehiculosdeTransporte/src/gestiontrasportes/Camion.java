/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */
// tercera herencia de vehiculo
public class Camion extends Vehiculo {

    // Atributooo 
    private double capacidadCarga;

    // constructor vacio
    public Camion() {

        this.capacidadCarga = 0;
    }

    // Constructor con parametro
    public Camion(String marca, String modelo,
                  int anio, boolean disponible,
                  double capacidadCarga)
            throws DatoInvalidoException {

        // Llamada al constructor de la clase padre
        super(marca, modelo, anio, disponible);

        // Validacioj de la capacidad de carga
        if (capacidadCarga < 0) {

            
            throw new DatoInvalidoException(
                    "capacidad invalida");
        }

        // Inicializa el atributo
        this.capacidadCarga = capacidadCarga;
    }

    // Sobrescritura 
    @Override
    public void rentar()
            throws VehiculoNoDisponibleException {

        // se verifica si el camion está disponible
        if (!disponible) {

            // Lanza la excepción si ya está rentado
            throw new VehiculoNoDisponibleException(
                    "El camion se encuentra rentado");
        }

        // cambia el estado del vehículo
        disponible = false;

        // mensaje para confirmar :D
        System.out.println(" El camion fue rentado correctamente");
    }

    // Getters y setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}