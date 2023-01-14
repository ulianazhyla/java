package Car;

public class TrafficLights {
    public void sendSignal (Car targetCar, String color){ //светофор отправляет какой-то конкретной машине новый цвет светофора
        targetCar.setCurrentTrafficLights(color);

    }
}

