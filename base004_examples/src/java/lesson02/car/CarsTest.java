package lesson02.car;

/**
 * Created by nucleos on 28.08.16.
 */
public class CarsTest {

    public static void main(String[] args) {
        Car car = new Car();

        car.about();
        car.model = "Honda";
        car.color = "Black";
        car.volume = 1.5;

//        car.gas = 20;
//        car.gas = -200;

        car.setGas(20);
        System.out.println(car.getGas());
        car.setGas(-200);
        System.out.println(car.getGas());
        car.setGas(40);
        System.out.println(car.getGas());

//        car.about();
    }
}
