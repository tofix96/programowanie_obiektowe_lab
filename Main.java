import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.math.*;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Wypisz();
        System.out.printf(get_imie());
        System.out.println(get_wiek());
        //Obliczenia();
        System.out.println(Parzysta(7));
        System.out.println(dzielna_3_5(15));
        System.out.println(do_trzeciej(3));
        System.out.println(pierw(3));
    }
    public static void Wypisz(){
        int a=-2,b=23;
        //Scanner input = new Scanner(System.in);
        System.out.println("podaj wartosc");
        int c=getInt();
        System.out.println("Podana wartosc to:"+ c);
        System.out.println("A = "+a+" B = "+b);
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
//
//    public static double getDouble(){
//        return new Scanner(System.in).nextDouble();
//    }
    public static String get_imie(){return "Daniel ";}
    public static int get_wiek(){return 21;}

    public static void Obliczenia(){
         int a=getInt();
         int b=getInt();
         System.out.println("Suma wynosi "+ (a+b));
        System.out.println("Różnica wynosi "+(a-b));
        System.out.println("Iloczyn wynosi "+ (a*b));


    }
    public static boolean Parzysta(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }
    public static boolean dzielna_3_5(int a){
        if((a%3==0) && (a%5==0))
            return true;
        else
            return false;
    }
    public static double do_trzeciej(double a)
    {
        return Math.pow(a,3);

    }
    public static double pierw(double a)
    {
        return Math.sqrt(a);
    }
//    public static boolean trojkat()
//    {
//        int a=getInt();
//        int b=getInt();
//
//    }




}