package Java.study;

import java.util.ArrayList;
import java.util.List;

class Vehicle{

    private int VehicleId;

    public Vehicle(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleId=" + VehicleId +
                '}';
    }
}
class Car extends Vehicle{
    private String CarModel1;

    public Car(int vehicleId,String carModel1){
        super(vehicleId);
        CarModel1 =carModel1;
    }

    public String getCarModel1() {
        return CarModel1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarModel1='" + CarModel1 + '\'' +
                '}';
    }
}
public class App {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Car(14, "A14"));
        display(list);
    }
    public static void display(List<?> list){
        for(Object element: list){
            System.out.println(element);
        }
    }
}

