import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите программу:");
            System.out.println("1. Приветствие с пользователем");
            System.out.println("2. Ввод персональных данных");
            System.out.println("3. Проверка возраста");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    greetingProgram();
                    break;
                case 2:
                    personalDataProgram();
                    break;
                case 3:
                    ageCheckProgram();
                    break;
                default:
                    System.out.println("Некорректный выбор программы.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void greetingProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");

        scanner.close();
    }

    public static void personalDataProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age);
        scanner.close();
    }

    public static void ageCheckProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Доступ ограничен.");
        } else {
            System.out.println("Добро пожаловать!");
        }

        scanner.close();
    }
}