package lesson03.phone;

/**
 * Created by nucleos on 03.09.16.
 */
public class SimCard {

    private String operator;
    private Integer phone;
    private Integer balance;
    private Integer minCost;
    private Integer smsCost;

    public SimCard(String operator, Integer phone, Integer balance, Integer minCost, Integer smsCost) {
        this.operator = operator;
        this.phone = phone;
        this.balance = balance;
        this.minCost = minCost;
        this.smsCost = smsCost;
    }

    public void about() {
        System.out.println(
                  "Оператор : " + operator + "\n"
                + "Телефон  : +380" + phone);
    }
}
