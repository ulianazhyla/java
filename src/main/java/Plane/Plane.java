package Plane;

public class Plane {

    public int places;
    public String direction;
    String[] placesInAmericanAirlines = new String[5];

    public Plane(String direction) {
    }

    public void setPlacesInAmericanAirlines(String[] placesInAmericanAirlines) {
        this.placesInAmericanAirlines = placesInAmericanAirlines;
    }

    public int getPlaces (){
        return places;
    }

    public String getPlaces (int index) {
        return placesInAmericanAirlines[index];
    }

}
//    ===============================================================================================LESSON 2==========
//
//    public int passenger = 233;
//    String[] famousPassengers = new String[5];
//
//    public String[] getFamousPassengers() {
//        return famousPassengers;
//    }
//    public void setFamousPassengers(String[] famousPassengers) {
//        this.famousPassengers = famousPassengers;
//    }
//
//    public String getPassenger (int index) { //зачем создавать это метод?//
//        return famousPassengers[index];
//    }
//
//    public int getPassenger() {
//        return passenger;
//    }
//
//}

// ===================================================================================================LESSON 1==========
//public class Plane {
//    public int passenger = 233;
//    public String PlaneModelName = "Boeing 777";
//    public int weatherOverboard = 18;
//
//    public void setWeatherOverboard(int weatherOverboard) {
//        this.weatherOverboard = weatherOverboard;
//    }
//
//    public int getPassenger() {
//        return passenger;
//    }
//
//    public String getPlainModelName() {
//        return PlaneModelName;
//    }
//
//    public void fly(String direction) {
//        System.out.println("Our " + PlaneModelName + " is flying to " + direction);
//    }
//}

