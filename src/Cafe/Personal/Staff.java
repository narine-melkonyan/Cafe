package Cafe.Personal;

import java.util.ArrayList;
import java.util.HashMap;

public class Staff {

    protected HashMap<String, Integer> staff = new HashMap<>();

    public void addroletostaff(String role, int count ){

        this.staff.put(role,count);

    }
}
