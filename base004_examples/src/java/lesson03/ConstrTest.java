package lesson03;

/**
 * Created by nucleos on 03.09.16.
 */
public class ConstrTest {
    public static void main(String[] args) {
        Car car1 = new Car("Honda");
        car1.about();
        Car car2 = new Car("Honda", "Серый");
        car2.about();
        Car car3 = new Car("Honda", "Серый", 2010);
        car3.about();
    }
}
