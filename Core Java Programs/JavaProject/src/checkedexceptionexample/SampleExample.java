package checkedexceptionexample;

public class SampleExample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}
        System.out.println("today we start multi threading ");
    }
}
