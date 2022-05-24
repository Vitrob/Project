public abstract class AbstractWeather {

    //normal method
    public boolean isRaining() {
        System.out.print("Is it raining? - ");
        return false;
    }

    //abstract method
    public abstract int getTemperature();
}

class Weather extends AbstractWeather {

    @Override
    public boolean isRaining() {
        System.out.println("It is a sunny day!");
        return super.isRaining();
    }

    @Override
    public int getTemperature() {
        System.out.print("The temperature is: ");
        return 25;
    }
}
