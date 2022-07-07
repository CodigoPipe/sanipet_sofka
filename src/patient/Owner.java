package patient;

public class Owner {
    private String DNI;
    private String name;
    private String surname;
    private String cellphone;
    private int age;

    public Owner(String DNI, String name,String surname, String cellphone, int age) {
        this.DNI = DNI;
        this.name = name;
        this.cellphone = cellphone;
        this.age = age;
        this.surname = surname;
    }

}
