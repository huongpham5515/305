/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author ADMIN
 */
public class lowPriorityConcrete extends requestProduct{
    
    @Override
    public void processRequest() {
        System.out.println("Request Denied");
    }

    @Override
    public void setPriority() {
       this.priority = "Ignore";
    }

    @Override
    public void setExpire() {
       this.expireDay = "66w7";
    }

    @Override
    public void setStatus() {
       this.status = "done";
    }
    
}
