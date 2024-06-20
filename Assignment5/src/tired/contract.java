/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tired;

/**
 *
 * @author ADMIN
 */
public interface contract {
    public contract buildContractID(String contractID);
    public contract buildPropertyID(String propertyID);
    public contract buildTenantID(String tenantID);
    public contract buildRentAmount(String rentAmount);
    public contract SignContract(contract Sig);
    contractne build();
}
