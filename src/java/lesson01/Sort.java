package lesson01;

import java.util.Arrays;

/**
 * Created by nucleos on 27.08.16.
 */

public class Sort {

    static int iterations = 0;

    public static void main(String[] args) {
        int[] array = new int[15];
        randomArray(array);

        int[] clone = clone(array);
        System.out.println("Глупая сортировка\n" + Arrays.toString(clone));
        stupidSort(clone);
        System.out.println(Arrays.toString(clone)
                + "\nКол-во итераций: " + iterations + "\n");

        clone = clone(array);
        System.out.println("Пузырьковая сортировка\n" + Arrays.toString(clone));
        bubbleSort(clone);
        System.out.println(Arrays.toString(clone)
                + "\nКол-во итераций: " + iterations + "\n");

        clone = clone(array);
        System.out.println("Шейкерная сортировка\n" + Arrays.toString(clone));
        shakeSort(clone);
        System.out.println(Arrays.toString(clone)
                + "\nКол-во итераций: " + iterations + "\n");

        clone = clone(array);
        System.out.println("Сортировка выборкой\n" + Arrays.toString(clone));
        selectionSort(clone);
        System.out.println(Arrays.toString(clone)
                + "\nКол-во итераций: " + iterations + "\n");

        clone = clone(array);
        System.out.println("Сортировка вставками\n" + Arrays.toString(clone));
        insertionSort(clone);
        System.out.println(Arrays.toString(clone)
                + "\nКол-во итераций: " + iterations + "\n");
    }

    //Глупая сортировка
    public static void stupidSort(int[] arr) {
        iterations = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            iterations++;
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                i = -1;
            }
        }
    }

    //Пузырьковая сортировка
    public static void bubbleSort(int[] arr) {
        iterations = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                iterations++;
            }
            iterations++;
        }
    }

    public static void shakeSort(int[] arr) {
        iterations = 0;
        Integer tmp; int left = 0, right = arr.length - 1;
        do {
            iterations++;
            for (int i = left; i < right; i++) {
                iterations++;
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            right--;

            for (int j = right; j > left; j--) {
                iterations++;
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            left++;
        } while (left <= right);
    }

    public static void selectionSort(int[] arr) {
        iterations = 0;
        for (int i = 0; i < arr.length; i++) {
            int minI = i, minJ = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minI] & arr[j] < arr[minJ]) {
                    minJ = j;
                }
                iterations++;
            }
            int temp = arr[i];
            arr[i] = arr[minJ];
            arr[minJ] = temp;
            iterations++;
        }
    }

    public static void insertionSort(int[] arr) {
        iterations = 0; int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
                iterations++;
            }
            arr[j] = temp;
            iterations++;
        }
    }

    public static void randomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
    }

    public static int[] clone(int[] old) {
        int[] arr = new int[old.length];
        System.arraycopy(old, 0, arr, 0, old.length);
        return arr;
    }
}
