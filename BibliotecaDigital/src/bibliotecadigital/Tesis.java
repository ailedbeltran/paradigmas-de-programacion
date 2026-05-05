/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
public class Tesis extends Material {
    //atributo
    private String universidad;
    
    //constructor vaciooo
    public Tesis() {
    }
    //con parametros
    public Tesis(String universidad, String titulo, String autor, int anioPublicacion, boolean prestado) throws DatoInvalidoException {
        super(titulo, autor, anioPublicacion, prestado);
        this.universidad = universidad;
    }

    // métodos de acceso
    //setter
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
    //getter

    public String getUniversidad() {
        return universidad;
    }
    
    
    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (isPrestado()) {
            throw new MaterialNoDisponibleException("La tesis ya fue prestada");
        }

        setPrestado(true);
        System.out.println("Tesis correctamente prestada");
    }
}