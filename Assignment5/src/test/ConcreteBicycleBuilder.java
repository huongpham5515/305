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
public class ConcreteBicycleBuilder implements BicycleBuilder{
    private bicycle result;
    
    public ConcreteBicycleBuilder(){
        result = new bicycle();
    }

    @Override
    public BicycleBuilder addFrameSize(String frameSize) {
      this.result.frameSize = frameSize;
      return this;
    }

    @Override
    public BicycleBuilder addWheelType(String wheelType) {
       this.result.wheelType = wheelType;
       return this;
    }

    @Override
    public BicycleBuilder addGearSystem(String gearSystem) {
        this.result.gearSystem = gearSystem;
       return this;
    }

    @Override
    public BicycleBuilder addAccessory(String accessory) {
         this.result.addAccessory(accessory);
       return this;
    }

    @Override
    public bicycle build() {
        return this.result;
    }

   
}
