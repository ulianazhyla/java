package Car;

public class Car {

    public String color;

    public Car (String carColor){
        color = "grey";
//        System.out.println("All Car from factory are " + color);
//        System.out.println("=====================");
    }

    public String getCarColor (){
        return color;
    }

    public void paintCar (String newCarColor) {
        color = newCarColor;
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
