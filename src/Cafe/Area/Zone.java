package Cafe.Area;

import Cafe.Cafe;

import java.io.PrintStream;
import java.util.ArrayList;

public class Zone {

    protected ArrayList<String> zone = new ArrayList<>();

    public Zone() {
        System.out.println("Add zones");
    }

    public void addZone(String s) {
        this.zone.add(s);
    }

    public ArrayList<String> getZone() {
        return zone;
    }

    public void setZone(ArrayList<String> zone) {
        this.zone = zone;
    }

}
