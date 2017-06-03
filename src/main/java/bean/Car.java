package bean;

/**
 * Created by Tatsiana on 28.05.17.
 */
public class Car {

    private String name;
    private int cost;

    public Car(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (cost != car.cost) return false;
        return name.equals(car.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
