package staff;

import java.util.List;

public class Staff {
    protected String name;
    protected String speciality;
    public Staff(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }
    public List<Staff> stuff;

    @Override
    public String toString() {
        return name + ", должность/специализация: " + speciality;
    }
}
