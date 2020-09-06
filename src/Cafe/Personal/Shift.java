package Cafe.Personal;

import java.util.ArrayList;
import java.util.HashMap;

public class Shift {

    protected HashMap<String,Person> shift = new HashMap<>();

    public void createShift(String role, Person person) {

        shift.put(role,person);
        System.out.println(person.firstname +" "+person.lastname+" is "+role);

    }
}
