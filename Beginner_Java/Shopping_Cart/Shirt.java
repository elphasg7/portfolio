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
public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("T-Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

}
