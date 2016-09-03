package lesson03;

/**
 * Created by nucleos on 03.09.16.
 */
public class Car {

    private String model;
    private String color;
    private Integer year;
    private Integer millage;

    //Конструкторы
    //Явный конструктор "по-умолчанию"
    public Car() {
        model = "Hundai";
        color = "Черный";
        year  = 2016;
    }

    //Конструктор задающий модель
    public Car(String model) {
        this.model = model;
        color = "Черный";
        year  = 2016;
    }

    //Констурктор задающий модель и цвет
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        year  = 2016;
    }

    //Конструктор задающий моднль цвет и год
    public Car(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void about() {
        System.out.println("Модель: " + model);
        System.out.println("Цвет  : " + color);
        System.out.println("Год   : " + year);
    }
}
