/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class empresa {
    private String nombre;
    private String apellido;
    private String genero;
    private double fechaNacimiento;
    private double fechaIngreso;
    public int horas;
    private int numero_identificacion;
    private int sueldo;
    
    public empresa(String nombre, String apellido, String genero,
            double fechaNacimiento, double fechaIngreso, int horas,
            int numero_identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.horas = horas;
        this.numero_identificacion = numero_identificacion;
        
    }
    
  
  public void anadirHoras(){
      System.out.println("SISTEMA DE INGRESO DE HORAS");
      java.util.Scanner teclado=
              new java.util.Scanner(System.in);
        System.out.print("ingrese el numero de identificación del empleado\n");
        int suclave =teclado.nextInt();
        if(suclave==numero_identificacion){
        System.out.println("ingresar el numero de horas trabajadas: ");
        int horast =teclado.nextInt();
        this.horas=horas+horast;
            System.out.println("Al usuario se le han añadido "+horast+" horas");
            System.out.println("el usuario a trabajado "+horas+" horas");
        }else{
            System.out.println("el numero no existe");
        }
  }
  public void calcularNomina(){
      System.out.println("SISTEMA PARA CALCULO DE NOMINA");
      java.util.Scanner teclado=
              new java.util.Scanner(System.in);
      System.out.println("ingrese el sueldo por hora del empleado");
        int horas =teclado.nextInt();
        sueldo=sueldo*horas;
        System.out.println("el ususario tiene que pagarle: "+sueldo);
        
  }
    
}
