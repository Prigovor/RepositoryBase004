package lesson02;

import java.util.Arrays;

/**
 * Created by nucleos on 28.08.16.
 */
public class Test {

    public static void main(String[] args) {
//        VisibleEx test = new VisibleEx();
//        System.out.println(test.publicInt);
//        System.out.println(test.defaultInt);
//        System.out.println(test.protectedInt);
//
//        System.out.println(StaticEx.staticInt);
//        StaticEx.getValues();
//
//        StaticEx staticEx = new StaticEx();
//
//        System.out.println(staticEx.nonStaticInt);
//        staticEx.getAllValues();
//
//        System.out.println(StaticEx.CONST);
//
//        System.out.println(StaticEx.CONST);

//        int a = 10, b = 20;
//        Integer c = 10, d = 20;
//
//        MethodEx ex = new MethodEx();
//
//        ex.sumPrim(c, d);
//        System.out.println(c + " " + d);
//        ex.sumObj(c, d);
//        System.out.println(c + " " + d);
//
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
//
//        System.out.println(Arrays.toString(arr));
//        ex.arr(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println(VarArgs.sum(10, 20));
        System.out.println(VarArgs.sum(10, 20, arr));
        System.out.println(VarArgs.sum(arr));
    }
}
