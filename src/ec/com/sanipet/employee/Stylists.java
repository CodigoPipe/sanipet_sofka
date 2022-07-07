package ec.com.sanipet.employee;

public class Stylists extends Employee {

    private String schedule = "Monday to saturday until 4 pm" ;

    public Stylists(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getSchedule() {
        return schedule;
    }

}
