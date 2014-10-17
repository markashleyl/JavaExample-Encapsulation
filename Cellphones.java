/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample2;

/**
 *
 * @author Ashley
 */
public class Cellphones {
    private String brand;
    private String price;
    private String cellPhoneColor;
    
    private Cellphones(String brand, String price, String cellPhoneColor) {
        this.brand = brand;
        this.price = price;
        this.cellPhoneColor = cellPhoneColor;
    }
    public void calculateCost(){
        
    }
    public String getBrand() {
        return brand;
    }
    public void setName(String brand) {
        this.brand = brand;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getcellPhoneColor() {
        return cellPhoneColor;
    }
    public void setcellPhoneColor() {
        this.cellPhoneColor = cellPhoneColor;
    }
}
