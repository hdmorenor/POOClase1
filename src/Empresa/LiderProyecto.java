package Empresa;

import java.util.ArrayList;


public abstract class LiderProyecto extends Programador{
    private final ArrayList<Object> programadores;

    public LiderProyecto(String lenguaje, String nombre, double salario, int ID) {
        super(lenguaje, nombre, salario, ID);
        this.programadores= new ArrayList<>();
    }
    public void agregarProgramador(Programador p){
        this.programadores.add(p);
    }
    
  @Override
  
    
    
    
    
}
