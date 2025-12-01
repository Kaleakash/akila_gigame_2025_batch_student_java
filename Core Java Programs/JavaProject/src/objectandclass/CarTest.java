package objectandclass;

public class CarTest {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.Car();
        Car innova = new Car();
        innova.displayCarDetails();

        Car ertiga = new Car();
        ertiga.displayCarDetails();

        Car santro = new Car(4,null,800000);
        santro.displayCarDetails();
    }
}
