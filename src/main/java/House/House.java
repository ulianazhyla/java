package House;
public class House {
    private String heather;

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
    private void turnOnHeather (String turnOn) {
        heather = turnOn;
    }

    private void turnOffHeather (String turnOf) {
        heather = turnOf;
    }

    String[] bathroomThings = new String[4];



}