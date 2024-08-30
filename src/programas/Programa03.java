package programas;

//Crear un programa en Java que permita ingresar dos números y un tipo de operación aritmética (+ - * /)
//Visualizar el resultado de la operación aritmética.

import java.util.Scanner;

public class Programa03 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        double n1, n2, resultado;
        String OpeArit;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese el número 1: ");
        n1 = lectura.nextDouble();
        System.out.print("Ingrese el número 2: ");
        n2 = lectura.nextDouble();
        System.out.print("Ingresar operación [+ - * /]: ");
        OpeArit = lectura.next();
        
        //Proceso de datos
        if (OpeArit.equals("+")) {
            
            resultado = n1 + n2;
            
        }else if(OpeArit.equals("-")){
            
            resultado = n1 - n2;
        
        }else if (OpeArit.equals("*")) {
            
            resultado = n1 * n2;
            
        }else{
            
            resultado = n1 / n2;
        
        }
        
        //Salida de datos
        System.out.println(resultado);
                
    }
    
}
