package lesson03.phone;

import java.util.ArrayList;

/**
 * Created by nucleos on 03.09.16.
 */
public class Phone {

    private String phone;
    private String os;
    private SimCard simCard;
    private ArrayList<Contact> contacts;

    public Phone(String phone, String os, SimCard simCard) {
        this.phone = phone;
        this.os = os;
        this.simCard = simCard;
        contacts = new ArrayList<Contact>();
    }

    public Phone(String phone, SimCard simCard) {
        this(phone, "No OS", simCard);
    }

    public void newContact(String name, String surmane, Integer phone) {
        Contact contact = new Contact(name, surmane, phone);
        contacts.add(contact);
    }

    public void printContacts() {
        if (contacts.size() > 0) {
            for (Contact contact : contacts) {
                contact.about();
            }
            return;
        }
        System.out.println("Книга контактов не содержит записей.");
    }

    public void about() {
        System.out.println("Модель : " + phone);
        simCard.about();
    }
}
