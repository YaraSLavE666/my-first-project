java GuessTheNumberimport java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Создаем объекты для чтения ввода с клавиатуры и генерации случайных чисел
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Загадываем число от 1 до 100
        int secretNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        boolean isGuessed = false;

        System.out.println("=================================");
        System.out.println(" Добро пожаловать в игру!");
        System.out.println(" Я загадал число от 1 до 100.");
        System.out.println("=================================");

        // Цикл продолжается, пока число не будет угадано
        while (!isGuessed) {
            System.out.print("Введите ваше предположение: ");
            int guess = scanner.nextInt();
            attempts++;

            // Проверяем введенное число
            if (guess < secretNumber) {
                System.out.println("❌ Загаданное число БОЛЬШЕ. Попробуйте еще раз!");
            } else if (guess > secretNumber) {
                System.out.println("❌ Загаданное число МЕНЬШЕ. Попробуйте еще раз!");
            } else {
                System.out.println("🎉 Поздравляю! Вы угадали число " + secretNumber + " за " + attempts + " попыток!");
                isGuessed = true; // Завершаем цикл
            }
        }
        
        // Закрываем сканер, чтобы освободить ресурсы
        scanner.close();
    }
}