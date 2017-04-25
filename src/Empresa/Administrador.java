package Empresa;

public class Administrador extends Empleado {

    public Administrador(String nombre, double salario, int ID) {
        super(nombre, salario, ID);
    }

    @Override
    public double calcularSalario() {
        return 100;
    }

    @Override
    public String listarInformacion() {
        return "Administrador " + this.ID + " " + this.nombre;
    }
    
    
}
