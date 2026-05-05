/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
public class Libro extends Material{
    //atributos
    private int numPaginas;
    
    //Constructor vacío
    public Libro(){
        super();
        this.numPaginas = 0;
    }
    
    //Constrcutor con parametros
    public Libro(String titulo, String autor, int anioPublicacion, boolean prestado, int numPaginas) throws DatoInvalidoException{
        super(titulo, autor, anioPublicacion, prestado);
        this.numPaginas = numPaginas;
    }
    
    //Métodos de acceso
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    public int getNumPaginas(){
        return numPaginas;
    }
    
     // Método
    @Override
    public void prestar() throws MaterialNoDisponibleException{
        if(prestado == true){ //Si el libro ya está prestado
            throw new MaterialNoDisponibleException ("El libro no puede ser prestado");
        }
        else{ // En caso contrario ( que no esté prestado)
            prestado = true;
            System.out.println("El libro ha sido prestado correctamente");
        }
        
        
    }
    
    
}

