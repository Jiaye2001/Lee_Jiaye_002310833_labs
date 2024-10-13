/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    

    // 存儲共享特徵的列表
    private ArrayList<Feature> features;
    // 存儲每個特徵的對應值
    private HashMap<Feature, Object> featureValues;
    
    
    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        //add
        features = new ArrayList<Feature>();     
        featureValues = new HashMap<>();
    }

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
    
    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public void addFeature(String name, Object value) {
        Feature newFeature = new Feature(name, value);
        features.add(newFeature);
    }
    
    
    public Feature addNewFeature() {
        Feature newFeature = new Feature("Default Name", "Default Value");
        features.add(newFeature);
        featureValues.put(newFeature, "Default Value"); // 為新特徵設置默認值
        return newFeature;
    }
    
    // 獲取特徵的值
    public Object getFeatureValue(Feature feature) {
        return featureValues.get(feature);
    }

    public void removeFeature(Feature feature) {
        if (features.remove(feature)) {
            featureValues.remove(feature);
        }
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}