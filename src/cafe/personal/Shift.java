package cafe.personal;

import java.util.ArrayList;
import java.util.Date;

public class Shift {

    protected Date start;
    protected Date end;
    protected ArrayList<Employee> employees;

    public Shift(Date start, Date end, ArrayList<Employee> employees) {
        this.start = start;
        this.end = end;
        this.employees = employees;
    }
}
