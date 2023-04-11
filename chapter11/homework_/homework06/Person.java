package homework_.homework06;

/**
 * @author 何蛋
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        Boat boat = VehiclesFactory.getBoat();
        boat.work();
    }
}
