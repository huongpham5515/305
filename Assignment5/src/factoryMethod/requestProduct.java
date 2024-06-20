/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author ADMIN
 */
public abstract class requestProduct {
   
    protected String priority;
    protected String expireDay;
    protected String status;
    
    public abstract void processRequest();
    public abstract void setPriority();
    public abstract void setExpire();
    public abstract void setStatus();
     
}
