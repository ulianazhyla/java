package Plane;

public class PlaneMain {
    public static void main(String... args){
        Plane victory = new Plane();
        System.out.println("By the way, on our plane Victory we have some famous people : ");

        String[] famousPassengers = new String[5];
        victory.setFamousPassengers(famousPassengers); // зачем это нужно делать?//
        famousPassengers[0] = "Volodymyr Zelensky";
        famousPassengers[1] = "Kirill Bydanov";
        famousPassengers[2] = "Valerii Zaluzhniy";
        famousPassengers[3] = "Denis Prokopenko";
        famousPassengers[4] = "Vitalii Kim";

//        System.out.println(victory.getPassenger(3)); // получаем пассажира по определенному индексу

        for (int i = 0; i < victory.getFamousPassengers().length; i++) {
            System.out.println(famousPassengers[i] + " with Index " + i);

            switch (victory.getPassenger(i)) { // тут проверяет каждого по индексу, разве это так должно работать?//
                case "Volodymyr Zelensky":
                    System.out.println(" Wow! It`s President of Ukraine!");
                    System.out.println("=======");
                    break;
                default:
                    System.out.println(" from his power team!");
                    System.out.println("=======");
            }
        }

//        for (int i = 0; i < victory.famousPassengers.length; i++) {  // команда вывода индекса каждого пассажира
//            System.out.println("Index of '" + famousPassengers[i] + "' is " + i);
//        }
    }
}

// ===================================================================================================LESSON 1==========
//    public static void main(String... args) {
//        Plane victory = new Plane();
//        System.out.println("We have flying on plane " + victory.PlaneModelName);
//        victory.fly("Washington");
//        System.out.println("on board we have " + victory.passenger + " passenger");
////        System.out.println("Overboard " + Victory.weatherOverboard + " degree");
//}
