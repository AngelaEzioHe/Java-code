package homework_.homework06;

/**
 * @author 何蛋
 * @version 1.0
 */
public class VehiclesFactory {
    public static Horse getHorse() {
        return new Horse();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
