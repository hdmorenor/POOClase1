package Empresa;

public class Programador extends Empleado {
    protected String lenguaje;

    public Programador(String lenguaje, String nombre, double salario, int ID) {
        super(nombre, salario, ID);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
       double salarioTotal = this.salario;
       if(this.lenguaje.equals("java"))
           salarioTotal += (this.salario*0.2);
       return salarioTotal;
    }

    @Override
    public String listarInformacion() {
        return "Programador " + this.ID + " " + this.nombre;
    }
    
}
