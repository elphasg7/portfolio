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
public class Item3 {
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    // Default constructor sets default values
    public Item3(){
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    // Overloaded constructor takes description and price
    public Item3(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }
    
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    // Getter and Setter methods
    private void setId() {
        id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
}
