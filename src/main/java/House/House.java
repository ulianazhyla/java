package House;
public class House {
    private String heather;

    private int temperatureInHouse = 13;

    public int getTemperatureInHouse(){ //если  инициируем прайват поле нужно создать метод, который будет его возвращать
        return temperatureInHouse;
    }

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