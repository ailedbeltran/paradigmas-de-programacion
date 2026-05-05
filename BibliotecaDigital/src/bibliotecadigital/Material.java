/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
// clase base
public abstract class Material {
    //atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    boolean prestado;
    
    //constructor vacio
    public Material(){
}
    //constructor con parametros 
    //en el constructor material se lanzara dato invalidoexcp si el año
    //es invalido
    public Material (String titulo, String autor, int anioPublicacion, boolean prestado) throws DatoInvalidoException{
         if (anioPublicacion < 0) {
            throw new DatoInvalidoException("El anio no puede ser negativo");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = prestado;
        
    }
    
    //metodos de acceso
        //setters
     
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }
    
        //getters
    
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public boolean isPrestado(){
        return prestado;
    }
    
    //metodo abstracto prestar (se utilizara en otras clases)
    public abstract void prestar () throws MaterialNoDisponibleException;

     
    
}
