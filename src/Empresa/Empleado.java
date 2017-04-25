package Empresa;

public abstract class Empleado extends Trabajador {
    protected String nombre;
    protected double salario;
    
    
    public Empleado(String nombre, double salario, int ID){
        super(ID);
        this.nombre = nombre;
        this.salario = salario;
    }
        
}
