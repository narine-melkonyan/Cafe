import Cafe.Area.Area;
import Cafe.Cafe;
import Cafe.Area.Zone;
import Cafe.Personal.Person;
import Cafe.Personal.Role;
import Cafe.Personal.Shift;
import Cafe.Personal.Staff;

public class Main
{
    public static void main(String[] args) {
        Cafe cafe = new Cafe( "Jean-Paul","Aram street");
        Zone zone = new Zone();
        zone.addZone("VIP");
        zone.addZone("Standart");
        zone.addZone("Bar");
        zone.addZone("Service");
        Area area = new Area(zone.getZone());
        Role role = new Role();
        role.addrole("Manager");
        role.addrole("Barmen");
        role.addrole("waiter");
        Staff staff = new Staff();
        staff.addroletostaff(role.getRolelist().get(2), 1);
        Shift shift = new Shift();
        shift.createShift(role.getRolelist().get(1),new Person("Khaxhik","Khachikyan"));
        Person client = new Person("Narine","Melkonyan");



    }
}
