package lesson04;

import lesson03.phone.SimCard;

/**
 * Created by nucleos on 04.09.16.
 */

public class Phone {
    private String model;
    private SimCard sim;

    public Phone() {}

    public Phone(String model) {
        this.model = model;
    }

    public Phone(String model, SimCard sim) {
        this.model = model;
        this.sim = sim;
    }

    public void about() {
        System.out.println("Модель телефона : " + model);
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public SimCard getSim() {
        return sim;
    }
    public void setSim(SimCard sim) {
        this.sim = sim;
    }
}
