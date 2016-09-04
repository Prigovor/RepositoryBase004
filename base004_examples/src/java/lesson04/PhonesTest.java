package lesson04;

/**
 * Created by nucleos on 04.09.16.
 */
public class PhonesTest {
    public static void main(String[] args) {
        Phone phone = new Phone("Blackberry");
        phone.about();

        Phone smartPhone =
                new SmartPhone("iPhone", "iOS");
        smartPhone.about();

        LuxurySmartPhone luxury =
                new LuxurySmartPhone("Samsung", "Android", "Золото");
        luxury.about();
        luxury.model();

        Test test = new Test();
        System.out.println(test.toString());
    }
}
