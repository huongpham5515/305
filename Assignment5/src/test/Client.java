/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ADMIN
 */
public class Client {
    public static void main(String[] args) {
        BicycleBuilder bicycle = new ConcreteBicycleBuilder();
        
        bicycle.addFrameSize("20");
        bicycle.addWheelType("caosu");
        bicycle.addGearSystem("hoho");
        bicycle.addAccessory("water holder");
        
        bicycle b = bicycle.build();
        System.out.println(b.frameSize);
    }
}
