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
public class Obra {
    
    private String Name, Description, Stile;
    private double Price;
   

    public Obra(String Name, String Description, String Stile, double Price) {
        this.Name = Name;
        this.Description = Description;
        this.Stile = Stile;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStile() {
        return Stile;
    }

    public void setStile(String Stile) {
        this.Stile = Stile;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
}
