
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }    

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        // empty object
        if (obj == null) {
            return false;
        }
        
        // different type of object
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        RegistrationPlate compared = (RegistrationPlate) obj;
        // comparing content of objects
        if (this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }
        
        if (this.country == null || !this.country.equals(compared.country)) {
            return false;
        }
        
        return true;        
        
    }

    @Override
    public int hashCode() {
        if (this.country == null) {
            return 7;
        }
        
        return this.country.hashCode() + this.regCode.hashCode();
    }
    
    

}