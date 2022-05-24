public class Main {

    public static void main(String[] args) {

        System.out.println("Abstract c");

        System.out.println("[Abstract Class]");
        Weather weather = new Weather();
        System.out.println(weather.isRaining());
        System.out.println(weather.getTemperature());

        System.out.println();
        System.out.println("[Interface]");
        Car car = new Car();

        System.out.println(car.getNumberOfPassengers());
        car.engineStarted();

        System.out.println();
        System.out.println("[Default method of the interface]");
        System.out.println(car.getColor()); //default interface method - was not implemented by the Car class


        System.out.println();
        System.out.println("[Static method of the interface]");
        System.out.println(InterfaceCar.isFuelInside()); //static method of the interface - was not implemented by the Car class
    }
}
