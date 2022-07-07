package ec.com.sanipet.employee;

public class Doctor extends Employee {

    private String workTime;

    public Doctor(String name, String surname, int schedule) {
        super(name, surname);
        setWorkTime(schedule);
    }

    @Override
    public String getSchedule() {
        return workTime;
    }

    public void setWorkTime(int schedule){
        if(schedule == 1){
            this.workTime = "Monday to friday from 8AM to 7PM and saturdays 9AM to 3PM";
        }
        if(schedule == 2){
            this.workTime = "Thursday to friday from 8AM to 7PM and saturdays 9AM to 3PM";
        }
    }
}
