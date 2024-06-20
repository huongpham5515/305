/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class bicycle {

    public bicycle() {
       accessories = new ArrayList<>();
    }

    public bicycle(String frameSize, String wheelType, String gearSystem) {
        this.frameSize = frameSize;
        this.wheelType = wheelType;
        this.gearSystem = gearSystem;
    }
    
    public String frameSize;
    public String wheelType;
    public String gearSystem;

    
     public void addAccessory(String accessory) {
        accessories.add(accessory);
    }
     
    public List<String> accessories;
}
