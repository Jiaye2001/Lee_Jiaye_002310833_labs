/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jiaye
 */
public class OrderItem {
    
    Product product;
    double salesPrices;
    int quantity;

    public OrderItem(Product product, double salesPrices, int quantity) {
        this.product = product;
        this.salesPrices = salesPrices;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSalesPrices() {
        return salesPrices;
    }

    public void setSalesPrices(double salesPrices) {
        this.salesPrices = salesPrices;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.product.toString();
    }
    
    
}
