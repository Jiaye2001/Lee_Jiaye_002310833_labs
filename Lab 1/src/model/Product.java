/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jiaye
 */
public class Product {


    String name;  //String is the data type
    String description;
    String availability;
    String price;
    
    /* choose all the attributes and right click -> insert code -> 
    automatically generate code below*/
    
    // get -> return the value of the attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPrice() {
        return price;
    }

   
    public void setPrice(String price) {
        this.price = price;
    }
}
