package lesson02;

/**
 * Created by nucleos on 28.08.16.
 */
public class StaticEx {

    public static int staticInt = 100;
    public int nonStaticInt = 200;

    //Константа
    public static final int CONST = 1000;

    public static void getValues() {
        System.out.println("Static Method");
        System.out.println(staticInt);
        System.out.println("***********************");
        //System.out.println(nonStaticInt);
    }

    public void getAllValues() {
        System.out.println("NonStatic Method");
        System.out.println("Stat Value : " + staticInt);
        System.out.println(nonStaticInt);
        System.out.println("***********************");
    }

}
