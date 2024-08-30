

package programas;

//Crear un programa que permita ingresar 4 números enteros.
//Visualizar el número mayor.

import java.util.Scanner;

public class Programa01 {
    
    public static void main(String[] args) {
        
        //Declarando variables
        int n1, n2, n3, n4, mayor;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar Número 1: ");
        n1 = lectura.nextInt();
        System.out.print("Ingresar Número 2: ");
        n2 = lectura.nextInt();
        System.out.print("Ingresar Número 3: ");
        n3 = lectura.nextInt();
        System.out.print("Ingresar Número 4: ");
        n4 = lectura.nextInt();
        
        //Proceso de datos
        mayor = n1;
        
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        
        //Salida de datos
        
        System.out.println("El número mayor es: " + mayor);
    }
    
}
