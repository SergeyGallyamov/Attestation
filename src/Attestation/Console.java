package Attestation;


import java.util.List;
import java.util.Scanner;

public class Console {

    public static String printMenu(Scanner scanner) {
        System.out.println("Введите характеристики для поиска");
        System.out.println("1 - производитель");
        System.out.println("2 - оперативная память");
        System.out.println("3 - операционная система");
        System.out.println("4 - цвет");
        System.out.println("Для завершения программы введите Q");
        return scanner.nextLine();
    }

    public static String printParameterMessage(String input, Scanner scanner) {
        return switch (input) {
            case "1" -> {
                System.out.println("Введите производителя");
                yield scanner.nextLine();
            }
            case "2" -> {
                System.out.println("Введите минимальный размер оперативной памяти");
                yield scanner.nextLine();
            }
            case "3" -> {
                System.out.println("Введите операционную систему");
                yield scanner.nextLine();
            }
            case "4" -> {
                System.out.println("Введите желаемый цвет");
                yield scanner.nextLine();
            }
            case null, default -> {
                System.out.println("Введена неверная категория");
                yield printMenu(scanner);
            }
        };
    }

    public static void printLaptops(List<Laptop> laptops) {
        System.out.println(laptops);
    }

    public static String printContinueMessage(Scanner scanner) {
        System.out.println("Для завершения программы введите Q");
        return scanner.nextLine();
    }
}
