//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//-Создать множество ноутбуков.
//-Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//Например:
//Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Операционная система
//3 - Цвет …
//-Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Attestation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Service service = new Service();

        while (true){
            String inputCategory = Console.printMenu(scan);

            if("Q".equalsIgnoreCase(inputCategory)){
                break;
            }

            String paramValue = Console.printParameterMessage(inputCategory, scan);
            List<Laptop> laptops = service.filterLaptops(inputCategory, paramValue);
            Console.printLaptops(laptops);
            String answer = Console.printContinueMessage(scan);

            if("Q".equalsIgnoreCase(answer)){
                break;
            }
        }
    }
}