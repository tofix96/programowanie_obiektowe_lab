import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku wyjściowego: ");
        String filename = sc.nextLine();

        System.out.println("Podaj swoją datę urodzenia (dzień): ");
        int day = sc.nextInt();

        System.out.println("Podaj swoją datę urodzenia (miesiąc): ");
        int month = sc.nextInt();

        System.out.println("Podaj swoją datę urodzenia (rok): ");
        int year = sc.nextInt();

        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file);

            String dayBinary = Integer.toBinaryString(day);
            String monthBinary = Integer.toBinaryString(month);
            String yearBinary = Integer.toBinaryString(year);

            writer.write(dayBinary + "\n");
            writer.write(monthBinary + "\n");
            writer.write(yearBinary + "\n");

            writer.close();

            System.out.println("Plik został zapisany!");

        } catch (Exception e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku!");
        }

    }
}