package programas;

import java.util.Scanner;

//Crear un programa en Java que permita ingresar el sueldo base y si cuenta con seguro de salud
//Si tiene seguro de salud calcular un descuento del 10% del sueldo base
//Si no tiene seguro de salud mostrar un mensaje ofreciendo el servicio
//Mostrar el descuento y el nuevo sueldo

public class Programa05 {
    
    public static void main(String[] args) {
        
        //Declarar variables
        Double sueldoBase, nuevoSueldo, descuento;
        String seguroSalud, mensaje;
        Scanner lectura = new Scanner(System.in);
        
        
        //Lectura de datos
        System.out.print("Ingrese el sueldo del trabajador: ");
        sueldoBase = lectura.nextDouble();
        System.out.print("¿Tiene seguro de salud? [SI - NO]: ");
        seguroSalud = lectura.next();
        
        //Inicializar variable
        descuento = 0.00;
        nuevoSueldo = 0.00;
        
        //Proceso de datos
        if (seguroSalud.equals("SI")) {
        
            nuevoSueldo = sueldoBase - (sueldoBase * 0.1);
            descuento = (sueldoBase * 0.1);
            mensaje = "El trabajador ya tiene un seguro y debe tener en cuenta:";
        
        }
        else {
            
            nuevoSueldo = sueldoBase;
            descuento = 0.00;
            mensaje = "Estas a tiempo para afiliarte al seguro de salud correspondiente.";
            
        }
        
        // Salida de datos
        System.out.println(mensaje);
        System.out.println("El trabajador tiene un descuento de: " + descuento);
        System.out.println("El nuevo sueldo del trabajador es: " + nuevoSueldo);
        
    }
    
}
