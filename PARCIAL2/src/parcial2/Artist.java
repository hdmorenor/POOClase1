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
class Artist extends User {
    private String Curriculum, Distinciones;
    private int Obras;
    private Obra Obra;

    public Artist(String Curriculum, String Distinciones, int Obras, Obra obra, String Name, String LastName){
        super(Name, LastName);
        this.Curriculum = Curriculum;
        this.Distinciones = Distinciones;
        this.Obras = Obras;
        this.Obra = Obra;
     }
    
    public String getCurriculum(){
        return Curriculum;
    }
    
    public String getDistinciones(){
        return Distinciones;
    }
    
    public int getObras(){
        return Obras;
    }

    public void setCurriculum(String Curriculum) {
        this.Curriculum = Curriculum;
    }

    public void setDistinciones(String Distinciones) {
        this.Distinciones = Distinciones;
    }

    public void setObras(int Obras) {
        this.Obras = Obras;
    }

    public void setObra(Obra Obra) {
        this.Obra = Obra;
    }
    
    public parcial2.Obra getObra(){
        return Obra;
    }
}
