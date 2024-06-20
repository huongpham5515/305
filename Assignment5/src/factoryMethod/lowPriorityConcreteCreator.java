/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author ADMIN
 */
public class lowPriorityConcreteCreator implements requestCreator{

    @Override
    public requestProduct createRequest() {
      return new lowPriorityConcrete();
    }

    @Override
    public void processRequest() {
        requestProduct re = new lowPriorityConcrete();
        re.processRequest();
    }
    
}
