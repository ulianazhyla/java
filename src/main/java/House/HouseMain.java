package House;

public class HouseMain {

    public static void main (String ... args){
        House smartHouse = new House();
        smartHouse.makeWarm(smartHouse, 5);
        House bathroom = new House();
        String[] bathroomThings = new String[6];
        bathroomThings[0] = "laundry basket";
        bathroomThings[1] = "Washing machine";
        bathroomThings[2] = "Latex gloves";
        bathroomThings[3] = "Toothbrush";
        bathroomThings[4] = "Heater for towel";
        bathroomThings[5] = "Sink";

    }
}