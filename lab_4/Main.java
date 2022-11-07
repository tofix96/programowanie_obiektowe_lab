import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        sumAndAvgElements(createRandom(100)); //zadanie 1
        tablica1();     //zadanie 2
        tablica2();     //zadanie 3
        tablica3();     //zadanie 4
        tablica4();     //zadanie 5
        tablica5();     //zadanie 6
        tablica6();     //zadanie 7



    }

    //zadanie 1
    public static Random rand() {
        return new Random();
    }

    public static void sumAndAvgElements(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        int avg = sum / arr.length;
        System.out.println("Sum of elements from array is: " + sum);
        System.out.println("Average of elements from array is: " + avg);
    }

    public static int[] createRandom(int a) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rand().nextInt(a);
        }
        return arr;
    }

    //zadanie 2
    public static void tablica1() {
        int tab[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String tab1[] = new String[]{"Auto", "Rower", "Motor", "Komputer", "Kosa"};
        for (int i = 0; i < tab.length; i += 2) {
            System.out.println(tab[i]);
        }
        for (int i = 0; i < tab1.length; i += 2) {
            System.out.println(tab1[i]);
        }
    }


    //zadanie 3
    public static void tablica2() {
        String tab3[] = new String[]{"Auto", "Rower", "Motor", "Komputer", "Kosa"};

        for (String i : tab3) {
            System.out.println(i.toUpperCase());


        }
    }

    //zadanie 4
    public static void tablica3() {
        String tab4[] = new String[5];

        String reverseWord = "";
        char sl;

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + " slowo");
            tab4[i] = scan.nextLine();

        }
        for (int j = tab4.length - 1; j >= 0; j--) {

            for (int i = 0; i < tab4[j].length(); i++) {
                sl = tab4[j].charAt(i);
                reverseWord = sl + reverseWord;
            }
            System.out.println(reverseWord);
            reverseWord = "";


        }
    }

    //zadanie 5
    public static void tablica4() {

        int tab5[] = new int[8];
        for (int p = 0; p < tab5.length; p++) {
            System.out.println("Podaj " + (p + 1) + " liczbe");
            tab5[p] = scan.nextInt();
        }
        int n = tab5.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (tab5[j] > tab5[j + 1]) {
                    // swap tab5[j+1] and tab5[j]
                    int temp = tab5[j];
                    tab5[j] = tab5[j + 1];
                    tab5[j + 1] = temp;
                }
        for (int k = 0; k < tab5.length; k++) {
            System.out.println(tab5[k]);
        }
    }

    //zadanie 6
    public static void tablica5() {
        int tab6[] = new int[5];
        for (int i = 0; i < tab6.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            tab6[i] = scan.nextInt();
        }
        for (int j = 0; j < tab6.length; j++) {
            System.out.println("Silnia z " + tab6[j] + " wynosi");
            System.out.println(getSilnia(tab6[j]));
        }

    }

    public static int getSilnia(int a) {
        if (a <= 1)
            return 1;
        else
            return a * getSilnia(a - 1);
    }


    //zadanie 7

    public static void tablica6() {
        String tab7[] = new String[]{"Auto", "Rower", "Motor", "Komputer", "Kosa"};
        String tab8[] = new String[]{"Auto", "Rower", "Motor", "Komputer", "Kosa"};
        int flag = 0;
        if (tab7.length != tab8.length) {
            System.out.println("Tablice nie sa takie same");
        } else {
            for (int i = 0; i < tab7.length; i++) {
                if (tab7[i] != tab8[i]) {
                    System.out.println("Tablice nie sa takie same");
                    flag = 1;
                }

            }
            if (flag == 0)
                System.out.println("Tablice sa takie same");
        }
    }
}




