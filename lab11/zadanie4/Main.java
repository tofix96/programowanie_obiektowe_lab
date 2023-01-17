import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku binarnego z datą urodzenia: ");
        String path = scanner.nextLine();

        File file = new File(path);
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            int birthDate = in.readInt();
            System.out.println("Data urodzenia: " + birthDate);
        } catch (IOException e) {
            System.out.println("Nieprawidłowa ścieżka do pliku lub niepoprawny format pliku.");
        }
    }
}
