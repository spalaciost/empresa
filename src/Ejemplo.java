/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Ejemplo {
 
    public static void main(String[] args){
        boolean centinela=true;
        int opcion=0, filtroEdad=0, filtroEstadoCivil=0;
        int votacion[]=null;
        int edad[]= null;
        int[] estadoCivil=null;
        int[] calificacion= null;
        int personasIngresadas=1;
         java.util.Scanner teclado=
              new java.util.Scanner(System.in);
        System.out.print("Ingrese la cantidad máxima de Personas a "
                + "participar en las votaciones");
        int tamanomaximo =teclado.nextInt();
        edad= new int[tamanomaximo];
        estadoCivil= new int[tamanomaximo];
        calificacion= new int[tamanomaximo];
        
        while(centinela==true){
            opcion =menu();
        if(opcion==1){
            if(personasIngresadas<=tamanomaximo){
                votacion=ingresarvotacion();
                    votacion[0] =edad[personasIngresadas];
                    votacion[1] = estadoCivil[personasIngresadas];
                    votacion[2] = calificacion[personasIngresadas];
                    personasIngresadas=personasIngresadas+1;
                }else{
                    System.out.println("Ya participaron todos las personas posibles");}
        }else{
            if(opcion==2){
                System.out.println("Sobre que estado civil desea hacer el filtro");
                filtroEstadoCivil=teclado.nextInt();
                        
                System.out.println("Sobre que rango de edad desea hacer el filtro");
                filtroEdad=teclado.nextInt();
                        
                ReporteParcial(edad,estadoCivil,calificacion,personasIngresadas-1
                        ,filtroEdad,filtroEstadoCivil);
                }else{
                ReporteFinal(calificacion,personasIngresadas-1);
            }
        }
            System.out.println("Si desea finalizar presione 0, para continuar presione 1");
                    int indicador=teclado.nextInt();
                    if(indicador==0){
                    centinela=false;
                    }
        }
        System.out.println("Se ha finalizado la ejecución del proceso de elecciones");
    }
        
    public static int menu(){
           
        int maxpersonasvotacion=0;
      java.util.Scanner teclado=
              new java.util.Scanner(System.in);
        System.out.print("selecione la opcion a ejecutar 1. ingresar votacion "
                + "2.Reporte parcial 3. Reporte final elecciones");
        int opcion =teclado.nextInt();
        return opcion;
      
    } 
    public static void ReporteParcial(int[]edad, int[]estadoCivil, int[]calificacion,
            int tamano, int filtroEdad, int filtroEstadoCivil ){
        System.out.println("reporte parcial");
        int total=0;
        int numCumpleFiltro = 0;
       
        for(int i=0; i < tamano; i++){
        if(estadoCivil[i]==filtroEstadoCivil && edad[i]==filtroEdad){
            numCumpleFiltro=numCumpleFiltro+1;
            total=total + calificacion[i];
        }
    }
        int promedio=total/numCumpleFiltro;
        System.out.println("Resultados Parcial: " + " Votaron " + numCumpleFiltro 
                +" Personas con Estado Civil " + filtroEstadoCivil + " Y en rango de edad de "
                + filtroEdad + " con promedio total de " + promedio);
    }
    public static void ReporteFinal(int[]calificacion, int tamano ){
        System.out.println("reporte final");
        int total=0;
        int i=1;
        while(i < tamano){
        total=total+calificacion[i];
        i=i+1;
    }
     total=total/tamano;
        System.out.println("Resultado Final" + " Numero de encuestados actuales " 
                + tamano + " Promedio Votacion " + total); 
}
    public static int[] ingresarvotacion(){
        java.util.Scanner teclado=
              new java.util.Scanner(System.in);
        int[] votacion = new int[3]; 
        System.out.print("Ingrese Rango de edad: Presione 1 si tiene menos de 18"
                + " años, 2. si tiene entre 18 y 55. 3. Si tiene más de 55" );
        votacion[0] =teclado.nextInt();
        
        
        System.out.print("Situcion Civil: Presione 1 si es soltero, 2 Si es casado" );
        votacion[1] =teclado.nextInt();
        
        
        System.out.print("Ingrese calificación del curso entre 0 y 10" );
        votacion[2] =teclado.nextInt();
        return votacion;
    
}
}