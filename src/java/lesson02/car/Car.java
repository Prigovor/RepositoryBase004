package lesson02.car;

/**
 * Created by nucleos on 28.08.16.
 */
public class Car {

    //Параметры класса
    public String model = "Hundai";
    public String color = "Red";
    public Double volume = 1.6;
    private Integer gas = 0;
    public static final Integer TANK = 50;
    private Boolean status = false;

    public void start() {
        status = true;
    }

    public void drive(Integer mills) {
        if (status == true) {
            System.out.println("Едем " + mills + " км.");
        }
    }

    public void stop() {
        status = false;
    }

    public void about() {
        System.out.println("Модель : " + model);
        System.out.println("Цвет   : " + color);
        System.out.println("Объем  : " + volume);
    }

    public void setGas(Integer gas) {
        if (gas > 0) {
            if (this.gas + gas <= TANK) {
                this.gas += gas;
                System.out.println("Заправлено " + gas + "л.");
            } else {
                System.out.println("Заправлено " +
                        (TANK - this.gas) + "л.");
                this.gas += TANK - this.gas;
                System.out.println("Не вместилось :"
                        + (TANK - gas) + "л." );
            }
        }
    }

    public Integer getGas() {
        return gas;
    }
}
