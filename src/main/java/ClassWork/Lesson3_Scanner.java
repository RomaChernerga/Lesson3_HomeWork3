package ClassWork;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lesson3_Scanner {

    public static void main(String[] args){

        //simpleScanner();
        //scannerReadFile();

        Random random = new Random();
        System.out. println(random.nextInt());
        System.out.println(random.nextInt(100));//от 0 вкл до 100 не вкл

    }

    private static void scannerReadFile() {
        Scanner scanner = null;
        try {
            File file = new File("files/example.txt");
             scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) scanner.close();
        }
    }

    private static void simpleScanner() {
        Scanner scanner = new Scanner(System.in); //читать консоль

        //String enter = scanner.nextLine(); Читать всю строку
        // scanner.useDelimiter("abc"); //задаем разделитель(использовать с scanner.next()
        //String enter = scanner.next();  // читать только до пробела
        scanner.useLocale(Locale.ENGLISH); //задать формать с константой
        float f = scanner.nextFloat();
        System.out.println(f);

        scanner.close();
    }
}
