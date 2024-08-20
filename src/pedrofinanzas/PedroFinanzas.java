/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrofinanzas;

/**
 *
 * @Johann Lopez
 */
import java.util.Scanner;

public class PedroFinanzas {    

          // Función para calcular el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }

    // Función para calcular el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Leer el sueldo de Pedro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular gastos
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        // Mostrar resultados
        System.out.println("Gasto en arriendo: $" + gastoArriendo);
        System.out.println("Gasto en comida: $" + gastoComida);
        System.out.println("Dinero restante: $" + dineroRestante);
    }

   }
    

