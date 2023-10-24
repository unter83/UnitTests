package task1;

public class Main {

    public static void main(String[] args) {
        ConsoleInterface consoleInterface = new ConsoleInterface();
        consoleInterface.showGreetings();
        int[] arrayA = ConsoleInterface.promptArray("Введите первый массив чисел разделяя их пробелами: ");
        int[] arrayB = ConsoleInterface.promptArray("Введите второй массив чисел разделяя их пробелами: ");
//        int[] arrayA = new int [] {10,2,3,4,5};
//        int[] arrayB = newA int [] {2,3,4,5,6};
        System.out.println(consoleInterface.showResult(arrayA, arrayB));

    }
}
