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
public class Shirt3 extends Item3 {
    private char size;
    private char colorCode;
    
    public Shirt3(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name. 
public String getColor (){
    String clCode="";
    switch(colorCode){
        case 'R':
            clCode="Red";
        break;
        case 'Y':
            clCode="Yellow";
            break;
        case 'B':
           clCode="Blue";
        default:
            clCode="Invalid Color!";
    }return clCode;              
}
}
