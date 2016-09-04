package lesson03;

/**
 * Created by nucleos on 03.09.16.
 */
public class BaseCar {

    private String model;
    private String color;
    private Integer year;
    private Integer millage;

    public BaseCar(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
        millage = 0;
    }

    public BaseCar(String model, String color) {
        this(model, color, 2016);
    }

    public BaseCar(String model) {
        this(model, "Белый", 2010);
    }
}
