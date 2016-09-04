package lesson04;

/**
 * Created by nucleos on 04.09.16.
 */
public class LuxurySmartPhone extends SmartPhone {

    private String model;
    private String material;

    public LuxurySmartPhone(String model,
                            String os, String material) {
        super(model, os);
        this.model = "Test";
        this.material = material;
    }

    public void model() {
        getModel();
        System.out.println(this.model);
    }

    @Override
    public void about() {
        super.about(); //Будет вызван метод класса SmartPhone
        System.out.println("Материал корпуса: " + material);
    }
}
