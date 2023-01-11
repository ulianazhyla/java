package House;
public class House {
    public String heather;

    public void makeWarm (int temperatureInHouse) {
        if (temperatureInHouse<18) {
            turnOnHeather("turn on");
            System.out.println("The heather is turn on" );
        }
        else {
            turnOffHeather("turn off");
            System.out.println("the heather is turn off");
        }
    }
    public void turnOnHeather (String turnOn) {
        heather = turnOn;
    }

    public void turnOffHeather (String turnOf) {
        heather = turnOf;
    }

    String[] bathroomThings = new String[4];



}