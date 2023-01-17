package Car;

public class Car {

    private String color;
    private String licencePlate;
    private int speed;
    private String currentTrafficLights;

    public Car(String carColor, String plateNumber) {
        speed = 0;
        currentTrafficLights = "yellow";
        licencePlate = plateNumber;
    }

    public String getCurrentTrafficLights() { //какой сейчас горит светофор для каждой машины.По умолчанию одинаковый для всех цвет, т.к. задан обший параметр для объекта.
        return currentTrafficLights;
    }

    public void crossTheCrossRoad(Car[] otherCars) {
        for (int i = 0; i < otherCars.length; i++) {
            if (!licencePlate.equals(otherCars[i].licencePlate)) { //условие, чтобы не проехать сквозь себя самого
                if (speed != 0 && otherCars[i].speed != 0) {
                    System.out.println("Car accident between " +licencePlate + " and " + otherCars[i].licencePlate);
                }
                if (speed == 0 && otherCars[i].speed == 0) {
                    System.out.println("nothing happened!");
                } else {
                    System.out.println("We pass by");
                }
            }
        }
    }

    public void setCurrentTrafficLights (String newTrafficColor){ // сообщаем, какой цвет должен стать
        switch (newTrafficColor){
            case ("red"):
                speed = 0;
                currentTrafficLights = newTrafficColor;
                break;
            case ("yellow"):
                currentTrafficLights = newTrafficColor;
                break;
            case ("green"):
                speed = 60;
                currentTrafficLights = newTrafficColor;
                break;
            default:
                System.out.println("do nothing!");
        }
    }
}





// ===================================================================================================LESSON 1==========
// public class Car {
//    public String color;
//
//    public Car (){
//        color = "grey";
////        System.out.println("All Car from factory are " + color);
////        System.out.println("=====================");
//    }
//
//    public String getCarColor (){
//        return color;
//    }
//
//    public void paintCar (String c) {
//        color = c;
//    }
//
//}
