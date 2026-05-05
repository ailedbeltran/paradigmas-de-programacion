/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
public class Revista extends Material{
    // atributo
    private int numEdicion;

    //constructor vacío
    public Revista() {
        super();
        this.numEdicion = 0;
    }

    // constructor con parámetros
    public Revista(String titulo, String autor, int anioPublicacion, boolean prestado, int numEdicion) throws DatoInvalidoException{
        super(titulo, autor, anioPublicacion, prestado);
        this.numEdicion = numEdicion;
    }

    // Métodos de acceso 
    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }
    public int getNumEdicion() {
        return numEdicion;
    }
    
    // Método
    @Override
    public void prestar() throws MaterialNoDisponibleException{
        if(prestado == true){ //Si la revista ya está prestada
            throw new MaterialNoDisponibleException ("La revista no puede ser prestada");
        }
        else{ // En caso contrario ( que no esté prestado)
            prestado = true;
            System.out.println("La revista ha sido prestada correctamente");
        }
    
    }
    
}

