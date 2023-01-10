package Plane;

public class Plane {
    public int passenger = 233;

    public String[] getFamousPassengers() {
        return famousPassengers;
    }
    public void setFamousPassengers(String[] famousPassengers) {
        this.famousPassengers = famousPassengers;
    }

    String[] famousPassengers = new String[5];

    public String getPassenger (int index) { //зачем создавать это метод?//
        return famousPassengers[index];
    }

    public int weatherOverboard = 18;
    public void setWeatherOverboard(int weatherOverboard) {
        this.weatherOverboard = weatherOverboard;
    }

    public int getPassenger() {
        return passenger;
    }

    public String PlaneModelName = "Boeing 777";

    public String getPlainModelName() {
        return PlaneModelName;
    }

    public void fly(String direction) {
        System.out.println(PlaneModelName + " is flying to " + direction);
    }
}
