/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {
        Comprador a = new Comprador("Name" , "LastName");
        Obra b = new Obra("Obra 1","historia","drama",1000);
        Artist c =new Artist ("Curriculum","Distinciones",4,b,"Lucas", "BCC");
    }
    
}
