import java.util.Scanner;


public class Samochod {
    public static Scanner scan = new Scanner(System.in);
    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rokProdukcji;
    private int przebieg;

    // konstruktor pobierajacy dane od usera
    public Samochod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marka: ");
        marka = sc.nextLine();
        System.out.print("Model: ");
        model = sc.nextLine();
        System.out.print("Nadwozie: ");
        nadwozie = sc.nextLine();
        System.out.print("Kolor: ");
        kolor = sc.nextLine();
        System.out.print("Rok produkcji: ");
        rokProdukcji = sc.nextInt();
        System.out.print("Przebieg: ");
        przebieg = sc.nextInt();
    }

    // konstruktor przeladownay
    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void showInfo() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Nadwozie: " + nadwozie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}