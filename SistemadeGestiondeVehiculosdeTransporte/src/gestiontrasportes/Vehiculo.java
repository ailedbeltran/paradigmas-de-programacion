/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontrasportes;

/**
 *
 * @author Ailed Beltrán
 */

// CLASE BASE
public abstract class Vehiculo {

    // Atributos privados del vehículo
    private String marca;
    private String modelo;
    private int anio;

    // Indica si el vehículo está disponible
    protected boolean disponible;

    // Constructor vacío
    public Vehiculo() {

        this.marca = "";
        this.modelo = "";
        this.anio = 0;
        this.disponible = true;
    }

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo,
                     int anio, boolean disponible)
            throws DatoInvalidoException {

        // Validación del año
        if (anio < 1900) {

            // Lanza excepción si el año es inválido
            throw new DatoInvalidoException(
                    "El anio no puede ser menor a 1900");
        }

        // Inicialización de atributos
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.disponible = disponible;
    }

    // Getter de marca
    public String getMarca() {
        return marca;
    }

    // Setter de marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter de modelo
    public String getModelo() {
        return modelo;
    }

    // Setter de modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter de año
    public int getAnio() {
        return anio;
    }

    // Setter de año
    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Getter de disponibilidad
    public boolean isDisponible() {
        return disponible;
    }

    // Setter de disponibilidad
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método abstracto que deberán implementar las clases hijas
    public abstract void rentar()
            throws VehiculoNoDisponibleException;
}