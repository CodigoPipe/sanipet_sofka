package patient;

import java.util.Date;

public abstract class Patient {
    //Attributes

   protected String clinicNumber;
   protected String name;
   protected String breed;
   protected Owner owner;
   protected Boolean isVaccinated;
   protected Date desparasitation;

   public Patient(String clinicNumber, String name, String breed, Owner owner, Boolean isVaccinated, Date desparasitation) {
      this.clinicNumber = clinicNumber;
      this.name = name;
      this.breed = breed;
      this.owner = owner;
      this.isVaccinated = isVaccinated;
      this.desparasitation = desparasitation;
   }

   protected String generateNumber(){
      return null;
   }

}
