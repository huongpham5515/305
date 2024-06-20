/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        requestCreator re = new lowPriorityConcreteCreator();
        requestProduct reu = re.createRequest();
        reu.setExpire();
        reu.setPriority();
        reu.setStatus();
         System.out.println(reu.priority);
        reu.processRequest();
       
    }
}
