/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

/**
 *
 * @author Elphas
 */

    public class Shirt2 extends Item2{
    private char size;
    private char colorCode;
    
    public Shirt2(double price, char size, char colorCode){
        super ("T-Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    public char getSize() {
        return size;
    }

    private void setSize(char size) {
        this.size = size;
    }
    public char getColorCode() {
        return colorCode;
    }

    private void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    
    // Override display() in the superclass to also show size and colorCode.
    public void display(){
        super.display();
        System.out.println("\tSize: "+getSize());
        System.out.println("\tColorCode: "+getColorCode());
    }
    //   Avo
    
}
