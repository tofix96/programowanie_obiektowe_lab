import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {

    public static void main(String[] args) {

        System.out.println("Podaj ścieżkę do pliku: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);

        try {
            Scanner fileScanner = new Scanner(file);
            int lines = 0;
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
                lines++;
            }

            System.out.println("Plik zawiera " + lines + " linii");
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie znaleziony!");
        }

    }
}