package lesson02;

import java.util.Arrays;

/**
 * Created by nucleos on 28.08.16.
 */
public class MethodEx {

    public void sumPrim(int first, int second) {
        System.out.println("Sum : " + (first + second));
        first = 200;
        second = 300;
    }

    public void sumObj(Integer first, Integer second) {
        System.out.println("Sum : " + (first + second));
        first = 200;
        second = 300;
    }

    public void arr(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

}
