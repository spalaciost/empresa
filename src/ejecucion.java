/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cancion c = new cancion("friday to love");
        c.sonar();
        
        cancion c2= new cancion();
        c2.sonar();
    }
    
}
