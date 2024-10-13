/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int id) {

        for(Product p : productCatalog) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    public int getProductCount(){
        return productCatalog.size();
    }
    
    public void addFeatureToProduct(int productId, String featureName, Object value) {
    Product product = searchProduct(productId);
        if (product != null) {
          product.addFeature(featureName, value);
        }
    }
    
    
    public ArrayList<Product> searchProductByFeature(String featureName) {
    ArrayList<Product> matchingProducts = new ArrayList<>();
    for (Product p : productCatalog) {
        for (Feature feature : p.getFeatures()) {
            if (feature.getName().equalsIgnoreCase(featureName)) {
                matchingProducts.add(p);
                break; // 找到匹配特徵後，跳出內層循環
            }
        }
    }
    return matchingProducts;
}
    
}
