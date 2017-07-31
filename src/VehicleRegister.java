
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.*;

/* @author marbi */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        String temp = owners.get(plate);
        
        if (temp == null) {
            owners.put(plate, owner);
            return true;
        }
        
        return false;
    }

    public String get(RegistrationPlate plate) {
        String temp = owners.get(plate);
        
        if (temp != null) {
            return temp;
        }
        
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        String temp = this.get(plate);
        
        return owners.remove(plate, temp);               
        
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate rp : owners.keySet()) {
            System.out.println(rp);
        }
    }
    
    public void printOwners() {
        
        ArrayList<String> duplicates = new ArrayList<String>();
        
        for (RegistrationPlate rp : owners.keySet()) {
            duplicates.add(get(rp));
        }
        
        HashSet<String> uniques = new HashSet<String>(duplicates);
        
        for (String unique : uniques) {
            System.out.println(unique);
        }
    }
}
