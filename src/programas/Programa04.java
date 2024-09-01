package programas;

import java.util.Scanner;

//Crear un programa en Java que permita ingresar la velocidad de un vehículo
//Si la velocidad es mayor a 80 km/h mostrar un mensaje de "¡ALERTA! Reduzca la velocidad"
//Si la velocidad es menos o igual a 80 km/h mostrar un mensaje de "Mantenga la velocidad"

public class Programa04 {
    
    public static void main(String[] args) {
        
        //Declarar variables
        Double velocidad, NuevaVelocidad;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        
        //Lectura de datos
        System.out.print("Ingrese la velocidad del vehiculo: ");
        velocidad = lectura.nextDouble();
        
        //Proceso de datos
        mensaje = "";
        if (velocidad > 80) {
        
            NuevaVelocidad = velocidad - 80;
            mensaje = "¡ALERTA! Reduzca " + NuevaVelocidad + " km/h su velocidad.";
        
        }
        if (velocidad <= 80) {
            
            mensaje = "Mantenga su velocidad de " + velocidad + " km/h.";            
        
        }
        
        //Salida de datos
        System.out.println(mensaje);
        
    }
    
}
