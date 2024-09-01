package programas;

import java.util.Scanner;

//Crear un programa en Java que permita ingresar el puntaje obtenido en el exámen de admisión de un alumno e indicar las carreras disponibles en Ingeniería
//Si obtuvo >= 1000 puntos ingresa a Ingeniería Sistemas
//Si obtuvo >=  900 puntos ingresa a Ingeniería de Minas
//Si obtuvo >=  800 puntos ingresa a Ingeniería Química
//Si obtuvo <   800 puntos no ingresa a ninguna carrera.
//Mostrar el nombre del postulante, puntos obtenidos y carrera lograda.

public class Programa06 {
    
    public static void main(String[] args) {
        
        //Declarar variables
        int puntos;
        String nombre, carrera;
        Scanner lectura = new Scanner(System.in);
        
        
        //Lectura de datos
        System.out.print("Ingrese el nombre del postulante: ");
        nombre = lectura.next();
        System.out.print("Ingrese el puntaje obtenido: ");
        puntos = lectura.nextInt();
        
        //Proceso de datos
        if (puntos >= 1000) {
        
            carrera = "Haz logrado ingresar a la carrera de Ingenieria Sistemas";
            
        }
        else if (puntos >= 900) {
        
            carrera = "Haz logrado ingresar a la carrera de Ingenieria de Minas";
            
        }
        else if (puntos >= 800) {
        
            carrera = "Haz logrado ingresar a la carrera de Ingenieria Química";
            
        }
        else {
        
            carrera = "Lamentablemente no haz alcanzado niguna carrera.";
            
        }
        
        // Salida de datos
        System.out.println(carrera);
        
    }
    
}
