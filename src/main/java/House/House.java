package House;

public class House {
    public String heater;

    public static void makeWarm(House smartHouse, int temperatureInHouse) {
        if (temperatureInHouse < 18) {
            smartHouse.turnOnHeater("turn on");
            System.out.println("The heater is turn on");
        } else {
            smartHouse.turnOffHeater("turn off");
            System.out.println("the heater is turn off");
        }
    }

    public void turnOnHeater(String turnOn) {
        heater = turnOn;
    }

    public void turnOffHeater(String turnOf) {
        heater = turnOf;
    }

    String[] bathroomThings = new String[4];
}