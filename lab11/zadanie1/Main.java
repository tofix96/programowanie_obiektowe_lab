import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //pobranie od użytkownika ścieżki do pliku
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku: ");
        String path = input.nextLine();

        //utworzenie obiektu File i FileWriter
        File file = new File(path);
        FileWriter fw = new FileWriter(file);

        //wprowadzanie linijek tekstu
        String line = "";
        System.out.println("Wprowadź linie tekstu: ");
        while (!line.equals("-")) {
            line = input.nextLine();
            //zapis do pliku
            if (!line.equals("-")) {
                fw.write(line + System.lineSeparator());
            }
        }

        //zamknięcie FileWriter
        fw.close();
        System.out.println("Zapis pliku zakończony powodzeniem!");
    }
}