package task1;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleInterface {
    private static final Scanner scanner = new Scanner(System.in);
    public void showGreetings() {
        System.out.println("Программа сравнения среднего арифметического двух массивов чисел\n");
    }

    public static int[] promptArray(String msg) {
        System.out.print(msg);
        if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            return Arrays.stream(text.split(" ")).mapToInt(String::length).toArray();
        }
        else throw new IllegalStateException("Ошибка в вводе данных");
    }

    public String showResult(int[] arrayA, int[] arrayB) {
        Comparator comparator = new Comparator();
        switch (comparator.compare(arrayA, arrayB)) {
            case 1 -> {
                return "Первый список имеет большее среднее значение";
            }
            case -1 -> {
                return "Второй список имеет большее среднее значение";
            }
            case 0 -> {
                return "Средние значения равны";
            }
            default -> throw new RuntimeException("Ошибка в обработке");
        }
    }
}
