/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ADMIN
 */
public class Client {
    public static void main(String[] args) {
        requestCreateContract();
    }
    
    public static void requestCreateContract(){
        contractBuilder contract = new Permanent();
        contract.setContractID("213");
        contract.setPropertyID("2312");
        contract.setTenantID("84747");
        contract.setRentAmount("27816331");
        contract.build();
    }
}
