
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        VehicleRegister register = new VehicleRegister();
        
        register.add(reg1, "Marbill");
        register.add(reg2, "Marvin");
        register.add(reg3, "Martin");
        
        System.out.println(register.get(reg3));
        
        register.printRegistrationPlates();
        register.printOwners();
                
    }
}
