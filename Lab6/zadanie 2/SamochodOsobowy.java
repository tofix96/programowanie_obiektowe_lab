import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;

public class SamochodOsobowy extends Samochod {
    private double waga;
    public static Scanner scan = new Scanner(System.in);
    private double pojemnoscSilnika;
    private int iloscOsob;

    // konstruktor pobierajacy dane od usera
    public SamochodOsobowy() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Waga: ");
        waga = sc.nextDouble();
        while (waga < 2 || waga > 4.5) {
            System.out.println("Waga powinna byc z przedzialu 2 t - 4,5 t. Podaj wagę ponownie: ");
            waga = sc.nextDouble();
        }
        System.out.print("Pojemnosc silnika: ");
        pojemnoscSilnika = sc.nextDouble();
        while (pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3.0) {
            System.out.println("Pojemność silnika powinna być z przedziału 0,8-3,0. Podaj pojemność silnika ponownie: ");
            pojemnoscSilnika = sc.nextDouble();
        }
        System.out.print("Ilość osób: ");
        iloscOsob = sc.nextInt();
    }
        // konstruktor przeladownay
            public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
            super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
            this.waga = waga;
            this.pojemnoscSilnika = pojemnoscSilnika;
            this.iloscOsob = iloscOsob;
        }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Waga: " + waga);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika);
        System.out.println("Ilość osób: " + iloscOsob);
    }
    }