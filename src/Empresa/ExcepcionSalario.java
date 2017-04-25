package Empresa;

public class ExcepcionSalario extends Exception {
    
    public ExcepcionSalario(){
        super("salario debe ser mayor al minimo");
    }
    
}
