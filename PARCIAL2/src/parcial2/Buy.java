/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

public class Buy extends Obra {

    public Buy(String Name, String Description,String Stile, double Price) {
        super(Name, Description, Stile, Price);
    }
    
    public double TotalPrice (Obra e){
        double a = e.getPrice();
        double ganancia = (a * 0.02);
        double TotalPrice = a+ganancia;
        
        return TotalPrice;
    }
}
