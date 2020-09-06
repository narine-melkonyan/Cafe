package Cafe.Personal;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class Role {

    ArrayList<String> rolelist = new ArrayList<>();

    public void addrole(String role) {
        rolelist.add(role);
    }

    public ArrayList<String> getRolelist() {
        return rolelist;
    }
}
