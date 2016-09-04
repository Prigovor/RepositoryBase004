package lesson03.phone;

/**
 * Created by nucleos on 03.09.16.
 */
public class PhoneTest {

    public static void main(String[] args) {
        SimCard sim =
                new SimCard("Vodafone", 509876543, 0, 2, 1);
        Phone phone = new Phone("China no-name", sim);
        phone.about();
        phone.newContact("Василий", "Петрович", 661239875);
        phone.newContact("Иван", "Сидров", 666541328);
        phone.newContact("Петр", "Порошенко", 936547852);
        phone.printContacts();
    }
}
