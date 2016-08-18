/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class cancion {
    private String titulo;
    public cancion(){
        this.titulo= "close to me";
    }
    public cancion(String titulo){
        this.titulo=titulo;
    }
    public void sonar(){
        System.out.println("sonando cancion: "+this.titulo);
    }
    
    
}
