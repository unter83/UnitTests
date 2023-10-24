package task1;

public class Main {

    public static void main(String[] args) {
        ConsoleInterface consoleInterface = new ConsoleInterface();
        consoleInterface.showGreetings();
        int[] arrayA = ConsoleInterface.promptArray("Введите первый массив чисел разделяя их пробелами: ");
        int[] arrayB = ConsoleInterface.promptArray("Введите второй массив чисел разделяя их пробелами: ");
        System.out.println(consoleInterface.showResult(arrayA, arrayB));

    }
}
