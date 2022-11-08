import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        sq_func();
        //Zadanie 2
        System.out.println("Podaj 3 liczby");
        double a = getDouble();
        double b = getDouble();
        double c = getDouble();
        System.out.println(A_func(a));
        System.out.println(B_func(b));
        System.out.println(C_func(c));
        //Zadanie 3
        sort_func();
        //Zadanie 4
        System.out.println("Czy pada deszcz? Jeśli tak, wpisz '1'");
        int rain = getInt();
        System.out.println("Czy autobus jest na przystanku? Jeśli tak, wpisz '1'");
        int bus = getInt();
        desz(rain, bus);
        //zadanie 5
        car();
        //zadanie 6
        calc();
    }

    //zadanie 1
    public static void sq_func() {
        Random rand = new Random();
        System.out.println("Podaj wartosc współczynników");
        System.out.println("Podaj współczynnnik kierunkowy a");
        int a = getInt();
        System.out.println("Podaj współczynnnik b");
        int b = getInt();
        System.out.println("Podaj współczynnnik c");
        int c = getInt();
        if (a != 0) {
            double delta = (b * b) - (4 * a * c);
            if (delta > 0) {
                double xo = (-b - Math.sqrt(delta)) / 2 * a;
                double xj = (-b + Math.sqrt(delta)) / 2 * a;
                System.out.println("Występują dwa rozwiązania: x1= " + xo + " oraz x2= " + xj);
            } else if (delta < 0) {
                System.out.println("Brak pierwiastków");
            } else {
                double xo = (-b) / (2 * a);
                System.out.println("Występuje jedno rozwiązanie xo= " + xo);
            }

        } else {
            System.out.println("Współczynnik a musi być różny od zera");
        }
    }

    //zadanie 2
    public static double A_func(double a) {
        if (a > 0) return a * 2;
        else if (a == 0) return 0;
        else return -3 * a;
    }

    public static double B_func(double b) {
        if (b >= 1) return Math.pow(b, 2);
        else return b;
    }

    public static double C_func(double c) {
        if (c > 2) return c + 2;
        else if (c == 2) return 8;
        else return c - 4;
    }

    //zadanie 3
    public static void sort_func() {
        System.out.println("Podaj liczbe");
        int a = getInt();
        System.out.println("Podaj liczbe");
        int b = getInt();
        System.out.println("Podaj liczbe");
        int c = getInt();
        int maks = max(a, b, c);
        int mini = min(a, b, c);
        if (a != maks && a != mini)
            System.out.println(mini + "," + a + "," + maks);
        else if (b != maks && b != mini) {
            System.out.println(mini + "," + b + "," + maks);
        } else
            System.out.println(mini + "," + c + "," + maks);

    }
    //zadanie 4

    public static void desz(int rain, int bus){
        String Rain="Tak";
        String Bus="Tak";
        if (rain==1 && bus==1) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        }
        else if (rain==1 && bus!=1) {
            System.out.println("Nie dostaniesz się na uczelnię!");
        }
        else if (rain!=1 && bus==1) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
    //zadanie 5- nie bardzo zrozumialem o co w tym chodziło :D
    public static void car() {
        System.out.println("Jeżeli otrzymałes zniżke wpisz 1.");
        int znizka=getInt();
        System.out.println("Jeżeli otrzymałes premie wpisz 1.");
        int premia = getInt();
        int sum=znizka+premia;
        if (znizka != 1 || premia == 1) {
            System.out.println("Możesz kupić samochód !");
            System.out.println("Zniżki na samochód nie ma");
        }

        else if (znizka != 1 || premia != 1) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        } else if (znizka == 1 || premia == 1) {
            System.out.println("Możesz kupić samochód !");
        }
    }
    //zadanie 6
    public static void calc(){
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        System.out.println("Jakie działanie chcesz wykonać na wylosowanych liczbach?\nDodawanie-1,\nOdejmowanie-2,\nMnożenie-3,\nDzielenie-4 \nReszta z dzielenia-5");
        int operation = getInt();
        switch (operation) {
            case 1:
                System.out.println("Wynik dodawania to: " + (x + y));
                break;
            case 2:
                System.out.println("Wynik odejmowania to: " + (x - y));
                break;
            case 3:
                System.out.println("Wynik mnożenia to: " + (x * y));
                break;
            case 4:
                System.out.println("Wynik dzielenia to: " + ((float) x / y));
                break;
            case 5:
                System.out.println("Wynik dzielenia bez reszty to: " + ( x / y));
                break;
            default:
                System.out.println("Nie ma takiej operacji");
        }

    }


    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static float getFloat() {
        return new Scanner(System.in).nextFloat();
    }

    public static String getString() {
        return new Scanner(System.in).nextLine();
    }

    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static int max(int a, int b, int c) {
        int maks = 0;
        if (a > b && a > c) {
            maks = a;
        }
        if (b > a && b > c) {
            maks = b;
        }
        if (c > b && c > a) {
            maks = c;
        }
        return maks;
    }

    public static int min(int a, int b, int c) {
        int min = 0;
        if (a < b && a < c) {
            min = a;
        }
        if (b < a && b < c) {
            min = b;
        }
        if (c < b && c < a) {
            min = c;
        }
        return min;
    }


}
