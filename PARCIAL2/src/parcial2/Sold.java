/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

public class Sold extends Buy{

    public Sold(String Name, String Description, String Stile, double Price) {
        super(Name, Description, Stile, Price);
    }


    public double realiceSold ( Sold b, Sold c){
        double a=b.TotalPrice(c);
        return a;
    }

    private double TotalPrice(Sold c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
