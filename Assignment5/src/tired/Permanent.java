/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tired;

/**
 *
 * @author ADMIN
 */
public class Permanent implements contract {

    private String contractID;
    private String propertyID;
    private String tenantID;
    private String rentAmount;
    private contract Sig;

    @Override
    public contract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public contract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public contract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public contract buildRentAmount(String rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public contract SignContract(contract Sig) {
        this.Sig = Sig;
        return Sig;
    }

    @Override
    public contractne build() {
        return new contractne(contractID, propertyID, tenantID, rentAmount);
    }

}
