package Plane;

public class PlaneMain {

    public static void main(String... args) {
        Plane Victory = new Plane();
        System.out.println("We have flying on plane " + Victory.PlaneModelName);
        Victory.fly("Washington");
        System.out.println("on board we have " + Victory.passenger + " passenger");
//        System.out.println("Overboard " + Victory.weatherOverboard + " degree");
        System.out.println("By the way, on our plane Victory we have some famous people : ");

        String[] famousPassengers = new String[5];
        Victory.setFamousPassengers(famousPassengers); // зачем это нужно делать?//
        famousPassengers[0] = "Volodymyr Zelensky";
        famousPassengers[1] = "Kirill Bydanov";
        famousPassengers[2] = "Valerii Zaluzhniy";
        famousPassengers[3] = "Denis Prokopenko";
        famousPassengers[4] = "Vitalii Kim";


        for (int i = 0; i < Victory.getFamousPassengers().length; i++) {
            System.out.println(famousPassengers[i]);
        }

        switch (Victory.getPassenger(0)) { // тут проверяет каждого по индексу, разве это так должно работать?//
            case "Volodymyr Zelensky":
                System.out.println("Wow! It`s President of Ukraine!");
                break;
            default:
                System.out.println("It`s joke!");
        }
        for (int i = 0; i < Victory.famousPassengers.length; i++) {
            System.out.println("Index of '" + famousPassengers[i] + "' is " + i);
        }
        if (famousPassengers.equals("Volodymyr Zelensky")){
            System.out.println("Wow! It`s President of Ukraine!");
        }
    }
}