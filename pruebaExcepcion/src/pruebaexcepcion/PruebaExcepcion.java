/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaexcepcion;

/**
 *
 * @author Ailed Beltrán
 */
public class PruebaExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Error: no se puede dividir entre cero");
        }
        
        //objeto no inicializado
         try{
        String texto = null;
        System.out.println(texto.length());
        }catch (NullPointerException e){
        System.out.println("Error del tamanio del objeto");
        }
         
        //posicion invalida en un arreglo
        try{
            int [] num = {1,2,4};
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: indice fuera de rango");
        }
        
        //uso multiples catcha 
        try{
            int [] numeros = new int [3];
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Error aritmetico: no se puede dividir entre cero ");
        }catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Error en el arreglo: indice fuera de rango");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }
        
        datos d = new datos();
        try{
            d.validarEdad(6);
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
           
    
    
}
    

   
}
    
    
    

   


