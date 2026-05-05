/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author Ailed Beltrán
 */
public class Principal {
    public static void main(String[] args) {
     try {
            // Crear objetos correctamente
            Libro libro1 = new Libro("El Sindrome del Impostor", "Sandi Mann", 1943, false, 96);
            Revista revista1 = new Revista("Vogue", "Chanel", 2020, true, 150);
            Tesis tesis1 = new Tesis("Unsij Forestal", "arboles", "ailed beltran", -2022, false);

            // Mostrar información
            System.out.println("=== DATOS DE LOS MATERIALES ===");
            System.out.println("Libro: " + libro1.getTitulo());
            System.out.println("Revista: " + revista1.getTitulo());
            System.out.println("Tesis: " + tesis1.getTitulo());

            // Probar el préstamo correcto
            System.out.println("\n=== PRÉSTAMOS ===");
            libro1.prestar();
            revista1.prestar();
            tesis1.prestar();

            // Intentar prestar nuevamente (debe lanzar excepción)
            System.out.println("\n=== INTENTO DE PRÉSTAMO DOBLE ===");
            libro1.prestar(); // Aquí debería fallar

        } catch (MaterialNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DatoInvalidoException e) {
            System.out.println("Error en datos: " + e.getMessage());
        }

        // Caso con dato inválido (el año es negativo)
        try {
            Libro libroError = new Libro("Libro invalido", "Autor X", -200, false, 50);
        } catch (DatoInvalidoException e) {
            System.out.println("\nExcepcion capturada por anio invalido: " + e.getMessage());
        }

        // ejemplo: revista ya prestada
        try {
            Revista revista2 = new Revista("Forbes", "Varios", 2021, true, 200);
            revista2.prestar(); // ya está prestada
        } catch (MaterialNoDisponibleException e) {
            System.out.println("\nExcepcion capturada: " + e.getMessage());
        } catch (DatoInvalidoException e) {
            System.out.println("Error en datos: " + e.getMessage());
        }
        
    }
    
}
