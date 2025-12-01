package objectandclass;

public class Car {
    int wheel;
    String colour;
    float price;

    public void start() {
        int a;
        System.out.println("start");
    }
    public void stop() {
        System.out.println("stop");
    }
    Car() {
        System.out.println("Constructor");
        wheel = 4;
        colour = "red";
        price = 1500000;
    }
    Car(int wheel, String colour, float price) {
        this.wheel = wheel;
        this.colour = colour;
        this.price = price;
    }
    public void displayCarDetails() {
        String temp="Car";
        System.out.println("displayCarDetails");
        System.out.println("wheel: " + wheel);
        System.out.println("colour: " + colour);
        System.out.println("price: " + price);
        System.out.println("temp "+temp);
    }
}
