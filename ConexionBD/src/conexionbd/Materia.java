/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;

/**
 *
 * @author Ailed Beltrán
 */
public class Materia {

    private int idMateria;
    private String nombre;
    private int cicloEsc;
    private String claveMateria;
    private double totalHoras;

    // constructor con parámetros
    public Materia(int idMateria,
                   String nombre,
                   int cicloEsc,
                   String claveMateria,
                   int totalHoras) {

        this.idMateria = idMateria;
        this.nombre = nombre;
        this.cicloEsc = cicloEsc;
        this.claveMateria = claveMateria;
        this.totalHoras = totalHoras;
    }

    // constructor vacío
    public Materia() {

        this.idMateria = 0;
        this.nombre = "";
        this.cicloEsc = 0;
        this.claveMateria = "";
        this.totalHoras = 0;
    }

    // metodos de acceso
      public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public int getCicloEsc() {
        return cicloEsc;
    }

    public void setCicloEsc(int cicloEsc) {
        this.cicloEsc = cicloEsc;
    }

    public String getClaveMateria() {
        return claveMateria;
    }

    public void setClaveMateria(String claveMateria) {
        this.claveMateria = claveMateria;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
}


    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  

    

