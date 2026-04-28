/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesj;

/**
 *
 * @author Ailed Beltrán
 */
public class ExcepcionesJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //  Crear objeto
        ejemplos c = new ejemplos(10, 0, "abc");

        // 1 operacion aritmetica
        try {
            System.out.println("Division: " + c.division());
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero");
        }

        // 2. lanza cuando intentas usar un objeto que es null
        try {
            c.longitudTexto();
        } catch (NullPointerException e) {
            System.out.println("Error: null pointer");
        }

        // 3. para acceder a una posición que no existe en un arreglo
        try {
            c.accesoArreglo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fuera de rango");
        }

        // 4 se produce cuando intentas convertir texto inválido a número
        try {
            c.convertirNumero();
        } catch (NumberFormatException e) {
            System.out.println("Error: formato de numero");
        }

        // 5para acceder a una posicion invalida de string
        try {
            c.caracter();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: indice de string");
        }

        // 6. se lanza al crear un arreglo que tiene un tamaño negativo
        try {
            c.arregloNegativo();
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: tamanioo negativo");
        }

        // 7. ocurre al convertir un objeto a un tipo que no es compatible
        try {
            c.casteo();
        } catch (ClassCastException e) {
            System.out.println("Error: casteo invalido");
        }

        // 8.se genera cuando se pasa un argumento inválido a un método
        try {
            c.argumentoInvalido();
        } catch (Exception e) {
            System.out.println("Error: argumento invalido");
        }

        // 9.ocurre al usar operaciones como módulo con divisor cero
        try {
            c.modulo();
        } catch (ArithmeticException e) {
            System.out.println("Error: modulo por cero");
        }

        // 10.llamar métodos sobre un objeto null
        try {
            c.metodoNull();
        } catch (NullPointerException e) {
            System.out.println("Error: objeto null");
        }

        // 11.cuando se guarda un tipo incorrecto en un arreglo
        try {
            c.arrayStore();
        } catch (ArrayStoreException e) {
            System.out.println("Error: tipo incorrecto en arreglo");
        }

        // 12. se lanza cuando el objeto está en un estado incorrecto para la operación
        try {
            c.estadoIlegal();
        } catch (IllegalStateException e) {
            System.out.println("Error: estado ilegal");
        }

        // 13. indica que una operación no está soportada
        try {
            c.operacionNoSoportada();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: operacion no soportada");
        }

        // 14. ocurre cuando accedes a una posición inválida en listas
        try {
            c.lista();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: lista fuera de rango");
        }

        // 15.conversión inválida a tipo double
        try {
            c.convertirDouble();
        } catch (NumberFormatException e) {
            System.out.println("Error: formato double");
        }
    }
}
