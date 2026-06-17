/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ailed Beltrán
 */

public class Principal {
    public static void main(String[] args){
    // instanciar un objeto de la clase usuario
        Usuario us1 = new Usuario (1234, "Ailed", "ailedbeltran2@gmail.com");
        
        
    //instanciar un objeto de la clase consultas
    Consultas consu = new Consultas ();
    //meotodo insertar 
    consu.insertar(us1);
    
    //lista
    List<Usuario> lista;
    lista = consu.listar();
    
    for (Usuario u: lista ){
        System.out.println("Su id es:" + u.getId());
        System.out.println("Su usuario es: " +u.getNombre());
        System.out.println("Su email es" + u.getEmail());   
    }
    
    // instanciar un objeto de tipo usuario
    Usuario us = consu.obtenerPorId(1234);
    System.out.println("Su id es: " + us.getId());
    System.out.println("Su usuario es: " + us.getNombre());
    System.out.println("Su email es: " + us.getEmail());
    
   // mandar a llamar actualizar la llamadas
   Usuario usuarioact = new Usuario(1234, "ailed del carmen", "beltranailed@gmail.com");

   consu.actualizar(usuarioact);

   System.out.println("El usuario se actualizo correctamente");
   
   // llamar eliminar 
   consu.eliminar(1234);
   //mensaje 
   System.out.println("El usuario se elimino correctamente");
   

// clase materias

// instanciar objeto materia
Materia mat1 = new Materia( 2, "Paradigmas de Programacion II", 2024, "012349", 30);

// instanciar consultasMateria
ConsultasMateria consuM = new ConsultasMateria();

// insertar
consuM.insertar(mat1);

System.out.println("Su materia se inserto correctamente");

// listar
List<Materia> listaMaterias;

listaMaterias = consuM.listar();

for (Materia m : listaMaterias) {

    System.out.println("ID materia: " + m.getIdMateria());
    System.out.println("Nombre: " + m.getNombre());
    System.out.println("Ciclo escolar: " + m.getCicloEsc());
    System.out.println("Clave: " + m.getClaveMateria());
    System.out.println("Total horas: " + m.getTotalHoras());
}

// obtener por id
Materia mat = consuM.obtenerPorId(1);

System.out.println("la materia fue encontrada:");
System.out.println(mat.getNombre());

// actualizar
Materia matAct = new Materia(4,"Programacion de Sistemas",2025,"012350",35);

consuM.actualizar(matAct);

System.out.println("Su materia fue actualizada correctamente");

// eliminar
consuM.eliminar(1);

System.out.println("Su materia ha sido eliminada correctamente");
   
   
   
   
   
   
   
    }
    
     
}



