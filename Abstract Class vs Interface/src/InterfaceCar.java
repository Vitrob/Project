public interface InterfaceCar {

    //abstract methods
    void engineStarted();

    int getNumberOfPassengers();

    //default method is not implemented by the Car class
    default String getColor() {
        System.out.print("Car color: ");
        return "blue";
    }

    //static method is not implemented by the Car class
    static boolean isFuelInside(){
        System.out.print("Is fuel inside? - ");
        return true;
    }

}


class Car implements InterfaceCar {


    @Override
    public void engineStarted() {
        System.out.println("Engine started!");
    }

    @Override
    public int getNumberOfPassengers() {
        System.out.print("Number of passengers: ");
        return 3;
    }

}