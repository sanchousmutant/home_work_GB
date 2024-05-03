package View;

import Controler.Basket;
import Controler.Interface.FileToHashMap;
import Model.CountingBasket;
import Model.Interface.ICountingBasket;
import java.util.HashMap;
import java.util.Scanner;

public class View {
    String filePath = "input.txt";
    ICountingBasket countingBasket = new CountingBasket();
    FileToHashMap<String, Integer> fileToHashMap = new Basket(filePath);
    HashMap<String, Integer> basket = fileToHashMap.fileToHashMap();
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            String num = scanner.nextLine();
            switch (num) {
                case "1":
                    System.out.println("----------------------------------------");
                    countingBasket.printListProduct(basket);
                    System.out.println("----------------------------------------");
                    break;
                case "2":
                    System.out.println("----------------------------------------");
                    countingBasket.numberProduct(basket);
                    System.out.println("----------------------------------------");
                    break;
                case "3":
                    System.out.println("----------------------------------------");
                    countingBasket.maxWordProduct(basket);
                    System.out.println("----------------------------------------");
                    break;
                case "4":
                    System.out.println("----------------------------------------");
                    countingBasket.maxNumberProduct(basket);
                    System.out.println("----------------------------------------");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Такой пункт меню отсутствует");

                    System.out.println("----------------------------------------");
            }
        }
    }
    private static void printMenu() {
        System.out.println("### Корзина продуктов ### \n" +
                "1. Список продуктов \n" +
                "2. Количество продуктов \n" +
                "3. Самое длинное название продукта \n" +
                "4. Наибольшее количество продукта \n" +
                "5. Выход\n");
        System.out.print("Выберите пункт меню: ");
    }
}
