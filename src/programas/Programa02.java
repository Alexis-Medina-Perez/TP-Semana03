
package programas;

import java.util.Scanner;
import java.text.DecimalFormat;

//Crear un programa en Java que permita ingresar las 3 notas.
//Visualizar el promedio y su condición.

// >= 12 Aprobado
//  < 12 Desaprobado


public class Programa02 {
    
    public static void main(String[] args) {
        
        //Declarar variables
        double nota1, nota2, nota3, promedio;
        String alumno, condicion;
        Scanner lectura = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##,##");
        
        //Entrada de datos
        System.out.print("Ingresar nombre del alumno: ");
        alumno = lectura.next();
        System.out.print("Ingresar nota 1: ");
        nota1 = lectura.nextDouble();
        System.out.print("Ingresar nota 2: ");
        nota2 = lectura.nextDouble();
        System.out.print("Ingresar nota 3: ");
        nota3 = lectura.nextDouble();
        
        //Proceso de datos
        promedio = (nota1 + nota2 + nota3)/ 3;
        
        if (promedio >= 12) {
            
            condicion = "Aprobado";
            
        }else{
            
            condicion = "Desaprobado";
        
        }
        
        //Salida de datos
        System.out.println("El promedio es: " + formato.format(promedio));
        System.out.println("La condicion del alumno es: " + condicion);
        
    }
    
}
