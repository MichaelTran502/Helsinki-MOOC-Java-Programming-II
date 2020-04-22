
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }
    
    
    
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (owners.remove(licensePlate) != null) {
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate lp : owners.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        
        ArrayList<String> alreadySeen = new ArrayList<>();
        for (String owner : owners.values()) {
            if (!alreadySeen.contains(owner)) {
                alreadySeen.add(owner);
                System.out.println(owner);
            }
        }
    }
}
