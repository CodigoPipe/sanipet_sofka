package patient;

import java.util.Date;

public class Dog extends Patient{

    public Dog(String clinicNumber, String name, String breed, Owner owner, Boolean isVaccinated, Date desparasitation) {
        super(clinicNumber, name, breed, owner, isVaccinated, desparasitation);
    }
}
