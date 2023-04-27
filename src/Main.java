public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.getModelName() = "car1";
        car2.getModelName() = "car2";
        car.getWheelsCount() = 4;
        car2.getWheelsCount() = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.getModelName() = "truck1";
        truck2.getModelName() = "truck2";
        truck.getWheelsCount() = 6;
        truck2.getWheelsCount() = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.getModelName() = "bicycle1";
        bicycle2.getModelName() = "bicycle2";
        bicycle.getWheelsCount() = 2;
        bicycle2.getWheelsCount() = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
