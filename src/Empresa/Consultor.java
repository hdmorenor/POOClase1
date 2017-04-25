package Empresa;

public class Consultor extends Trabajador{
    private String labor;
    
    public Consultor(String labor, int ID){
        super (ID);
        this.labor = labor;
    }

    @Override
    public double calcularSalario() {
        return 220;
    }

    @Override
    public String listarInformacion() {
        return "Consultor " + this.ID + " " + this.labor;
    }
            
        
}
