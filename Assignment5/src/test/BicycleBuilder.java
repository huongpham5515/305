/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface BicycleBuilder {
    public BicycleBuilder addFrameSize(String frameSize);
    public BicycleBuilder addWheelType(String wheelType);
    public BicycleBuilder addGearSystem(String gearSystem);
    public BicycleBuilder addAccessory(String accessories);
    bicycle build();
}
