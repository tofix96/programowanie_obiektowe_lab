public class Main {
    public static void main(String[] args) {
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod("BMW", "X5", "SUV", "Czarny", 2018, 25000);
        samochodOsobowy.showInfo();
        samochod1.showInfo();
        samochod2.showInfo();
    }}