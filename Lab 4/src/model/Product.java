/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    
    // by me
    private ImageIcon logoImage;
    

    
    // 06:31
    private ArrayList<Feature> features;
    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        //add
        features = new ArrayList<Feature>();
        
    }

    
    // by me
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    } 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
        
    public ArrayList<Feature> getFeatures() {
        return features;
    }
    
    public void Features(ArrayList<Feature> features) {
        this.features = features;
    }
    
//    public Feature addNewFeature() {
//    Feature feature = new Feature(this); // 設置當前產品為擁有者
//    features.add(feature);
//    return feature;
//    }
    
    public Feature addNewFeature() {
    Feature newFeature = new Feature("Default Name", "Default Value");
    features.add(newFeature);
    return newFeature;
    }

    
//     public void removeFeature(int index) {
//        if (index >= 0 && index < features.size()) {
//            features.remove(index);
//        }
//    }
    
    @Override
    public String toString() {
        return name;
    }


    
}
