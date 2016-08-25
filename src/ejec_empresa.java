/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ejec_empresa {

    public static void main(String[] args) {
        System.out.println("ingrese el numero de empleados a ingresar");
        java.util.Scanner teclado=
              new java.util.Scanner(System.in);
        int n =teclado.nextInt();
        empresa empleado[]=new empresa[n];
        int i=0;
        while(i<=n){
        
        
        System.out.print("ingrese los datos del empleado\n");
        System.out.println("nombre: ");
        String nombre =teclado.next();
        System.out.println("apellido: ");
        String apellido =teclado.next();
        System.out.println("genero: ");
        String genero =teclado.next();
        System.out.println("fecha de nacimiento DDMMAAAA: ");
        int fechaNacimiento =teclado.nextInt();
        System.out.println("fecha de ingreso DDMMAAAA: ");
        int fechaIngreso =teclado.nextInt();
        System.out.println("horas trabajadas: ");
        int horas=teclado.nextInt();
        System.out.println("numero de identificación: ");
        int numero_identificacion=teclado.nextInt();
        System.out.println("se a ingresado al sistema al empleado");
        
        empleado[i] = new empresa(nombre,apellido,genero,
                fechaNacimiento, fechaIngreso,horas,numero_identificacion);
        
       empleado[n].anadirHoras();
       empleado[n].calcularNomina();
        n++;
        }
       
    }
        
        
    
}
