package ClassWork;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3_Java {
    private static L3_Massives HomeWork3;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static final int TRIES3 = 3;  // 3 попытки на угадывание
    static final int TRIES4 = 4;  // 4 попытки на угадывание
    static final int TRIES5 = 5;  // 5 попытки на угадывание

    public static void main (String[] args) {
        int [][] DiagonalArr1 = DiagonalArr1(5, 5);
        HomeWork3.print2dArray(DiagonalArr1);
        System.out.println();


        //2. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать
        // это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
        // чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да
        // / 0 – нет»(1 – повторить, 0 – нет).

        while (true){
            System.out.print("Задай диапазон от 0 и отгадай загаданное число!>>>");
            int SecretNumber = random.nextInt(scanner.nextInt() + 1);   // попросить генератор преобразовать случ число от 0 до заданной границы;
            System.out.print("Test: " + SecretNumber);  // вывод строки с числом загаданным для проверки!
            System.out.println();

            if (SecretNumber <=10){  // условие и проверка его выполнения
                System.out.print("Твое число от 0 до 10 и у тебя 3 попытки, Дружище!" );

            } else if(SecretNumber > 10 && SecretNumber <=15 ){  // условие и проверка его выполнения
                System.out.print("Твое число от 0 до 15 и у тебя 4 попытки, Дружище!" );
            } else {
                System.out.print("Твое число достаточно большое и у тебя 5 попыток. Удачи!" );
            }
            System.out.println();

             boolean playerGuessed = false;
            for(int b = 0; b < TRIES3 && (int)(SecretNumber)<=10 ; b++ ){ // условие проверки введенных пользователем чисел.
                int answer = scanner.nextInt(); // присвоение вводимых нами данных в качестве ответа и считывание сканером.
                if (answer == SecretNumber){ // если, ответ = загаданному числу, то ...
                    System.out.println("Красавчик!Ты угадал!");
                    playerGuessed = true;
                    break; // прерывание программы, если выполненно условие выше...
                } else if (answer < SecretNumber){ // условие и проверка его выполнения
                    System.out.println("Твое число меньше загаданного");
                } else {
                    System.out.println("Твое число больше загаданного");
                }
            }
            for(int b = 0; b < TRIES4 && (int)(SecretNumber)>10 && (int)(SecretNumber)<=15 ; b++ ){  //
                int answer = scanner.nextInt();
                if (answer == SecretNumber){
                    System.out.println("Красавчик!Ты угадал!");
                    playerGuessed = true;
                    break;
                } else if (answer < SecretNumber){
                    System.out.println("Твое число меньше загаданного");
                } else {
                    System.out.println("Твое число больше загаданного");
                }
            }
            for(int b = 0; b < TRIES5 && (int)(SecretNumber)>15 && (int)(SecretNumber)<=25  ; b++ ){  //
                int answer = scanner.nextInt();
                if (answer == SecretNumber){
                    System.out.println("Красавчик!Ты угадал!");
                    playerGuessed = true;
                    break;
                } else if (answer < SecretNumber){
                    System.out.println("Твое число меньше загаданного");
                } else {
                    System.out.println("Твое число больше загаданного");
                }
            }
            if (!playerGuessed)System.out.println("Не угадал!");
            System.out.println("Сыграем еще ? y or no  >>>");
            if (!scanner.next().toLowerCase().equals("y")) break;
        }
    }

    // 1. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static int[][] DiagonalArr1(int size, int value){
        int arr1[][] = new int [size][size];  // задаем условие, что значение массива по Y и X - одинаковые;
        for (int a = 0; a < size; a++) {   // коэф а мы задаем значение size, т.е. высоту и длинну массива.
            arr1[a][a] = value; // все значение при которых координаты X и Н имеют общее значение - будут являтся коэф Value;
            arr1[a][arr1.length - 1 - a] = value;
        }
        return arr1;  // возвращение обновленного массива после преобразования...
    }


}
