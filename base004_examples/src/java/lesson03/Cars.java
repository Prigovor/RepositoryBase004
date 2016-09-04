package lesson03;

/**
 * Created by nucleos on 03.09.16.
 */
public class Cars {
    private String model;
    private String color;
    private Integer year;
    private Integer millage;

    public Cars() {
        model = "Hundai";
        color = "Металик";
        year  = 2010;
        millage = 0;
    }

    public Cars(String model) {
        this();
        this.model = model;
    }

    public Cars(String model, String color) {
        this();
        this.model = model;
        this.color = color;
    }

    public Cars(String model, String color, Integer year, Integer millage) {
        this();
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
