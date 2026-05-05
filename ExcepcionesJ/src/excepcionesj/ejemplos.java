/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesj;

/**
 *
 * @author Ailed Beltrán
 */
public class ejemplos {
    
    //  ATRIBUTOS
    private int numeroA;
    private int numeroB;
    private String texto;

    // CONSTRUCTORES
    public ejemplos(int numeroA, int numeroB, String texto) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.texto = texto;
    }

    // MÉTODOS DE ACCESO 
    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // MÉTODOS - excepciones

    // 1. ArithmeticException
    public int division() {
        return numeroA / numeroB;
    }

    // 2. NullPointerException
    public int longitudTexto() {
        String t = null;
        return t.length();
    }

    // 3. ArrayIndexOutOfBoundsException
    public int accesoArreglo() {
        int[] arr = {1,2,3};
        return arr[5];
    }

    // 4. NumberFormatException
    public int convertirNumero() {
        return Integer.parseInt(texto);
    }

    // 5. StringIndexOutOfBoundsException
    public char caracter() {
        return texto.charAt(10);
    }

    // 6. NegativeArraySizeException
    public int[] arregloNegativo() {
        return new int[-5];
    }

    // 7. ClassCastException
    public String casteo() {
        Object x = 10;
        return (String) x;
    }

    // 8. IllegalArgumentException
    public void argumentoInvalido() throws InterruptedException {
        Thread.sleep(-1);
    }

    // 9. ArithmeticException (módulo)
    public int modulo() {
        return numeroA % numeroB;
    }

    // 10. NullPointerException
    public void metodoNull() {
        Object obj = null;
        obj.toString();
    }

    // 11. ArrayStoreException
    public void arrayStore() {
        Object[] arr = new String[2];
        arr[0] = 10;
    }

    // 12. IllegalStateException
    public void estadoIlegal() {
        throw new IllegalStateException("Estado incorrecto");
    }

    // 13. UnsupportedOperationException
    public void operacionNoSoportada() {
        throw new UnsupportedOperationException("Operacion no soportada");
    }

    // 14. IndexOutOfBoundsException
    public int lista() {
        java.util.ArrayList<Integer> lista = new java.util.ArrayList<>();
        lista.add(1);
        return lista.get(5);
    }

    // 15. NumberFormatException
    public double convertirDouble() {
        return Double.parseDouble(texto);
    }
}


