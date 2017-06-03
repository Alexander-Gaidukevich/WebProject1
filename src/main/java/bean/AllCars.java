package bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana on 28.05.17.
 */
public class AllCars {

    private static List<Car> cars = new ArrayList<Car>();

    static {
        cars.add(new Car("n",5));
        cars.add(new Car("n",6));
        cars.add(new Car("f",7));
        cars.add(new Car("v",8));
        cars.add(new Car("n",9));

    }

    public static List<Car> getAllCars() {
        return cars;
    }

}
