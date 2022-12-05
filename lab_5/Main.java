import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Zadanie 1
        System.out.println("ZADANIE 1");
        prostokat p1 = new prostokat(15, 32);
        p1.Opis();
        p1.szer = 1.4;
        p1.wys = 4.6;
        p1.Opis();
        System.out.println('\n');
//Zadanie 2
        System.out.println("ZADANIE 2 ");
        budynek b1 = new budynek("Wsiz", 3, LocalDate.of(1999, 1, 1));
        budynek b2 = new budynek("Polibuda", 4, LocalDate.of(1979, 2, 28));
        budynek b3 = new budynek("Uniwerek", 2, LocalDate.of(1985, 7, 12));
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println("Budynek ma: " + b1.ilelat() + " rok/lat/lata");
        System.out.println("Budynek ma: " + b2.ilelat() + " rok/lat/lata");
        System.out.println("Budynek ma: " + b3.ilelat() + " rok/lat/lata");
        System.out.println('\n');
//Zadanie 3
        System.out.println("ZADANIE 3 ");
        Gatunek ob1 = new Gatunek("Kot", "Dachowiec Posplity", "Mały i nie mondry", 9, 12);
        Gatunek ob2 = new Gatunek("Pies", "Pieslus pospolitus", "Mały szczekający", 11, 7);

        System.out.println(ob1.getimie());
        System.out.println(ob2.getimie());
        System.out.println(ob1.getHaploid());
        System.out.println(ob2.getHaploid());

        ob2.wypisz();
        ob2.cloneObj(ob1);
        ob2.wypisz();
        System.out.println('\n');
    }


}
