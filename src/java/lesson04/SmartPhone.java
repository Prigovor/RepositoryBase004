package lesson04;

import lesson03.phone.SimCard;

/**
 * Created by nucleos on 04.09.16.
 */
public class SmartPhone extends Phone {

    private String os;

    public SmartPhone(String model, String os) {
        super(model);
        this.os = os;
    }

    public SmartPhone(String model,
                      SimCard simCard, String os) {
        super(model, simCard);
        this.os = os;
    }

    @Override
    public void about() {
        System.out.println("Модель телефона : "
            + getModel());
        System.out.println("Операц. система : "
                + os);
    }

    public String getOs() {
        return os;
    }
}
