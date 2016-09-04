package lesson03.phone;

/**
 * Created by nucleos on 03.09.16.
 */
public class Contact {

    private String name;
    private String surname;
    private Integer phone;

    public Contact(String name, String surname, Integer phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void about() {
        System.out.println("Контакт : " + name + " " + surname + "\n"
                         + "Телефон : +380" + phone);
    }
}
