package patient;

import java.util.Date;

public class Cat extends Patient{

    public Cat(String clinicNumber, String name, String breed, Owner owner, Boolean isVaccinated, Date desparasitation) {
        super(clinicNumber, name, breed, owner, isVaccinated, desparasitation);
    }
}
