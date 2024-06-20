/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tired;

/**
 *
 * @author ADMIN
 */
public class client {
    public static void main(String[] args) {
        requestCreateContract();
    }
    
    public static void requestCreateContract(){
        contract requestContract = new Permanent();
        requestContract.buildContractID("sagyua");
        requestContract.buildPropertyID("shvahcg");
        requestContract.buildRentAmount("shagch");
        requestContract.build();
    }
}
