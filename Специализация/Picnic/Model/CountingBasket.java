package Model;

import Model.Interface.ICountingBasket;
import java.util.HashMap;

public class CountingBasket implements ICountingBasket {

    int count, maxSize, maxNumber, sum = 0;

    @Override
    public void numberProduct(HashMap<String, Integer> basket){
        // кол - во продуктов
        for (Integer values : basket.values()){
            sum += values;
        }
        System.out.println("Всего в корзине " + sum + " продуктов.");
    }
    @Override
    public void printListProduct(HashMap<String, Integer> basket) {
        //список продуктов
        for (String key : basket.keySet()) {
            String product = key + " -- " + basket.get(key);
            System.out.printf("%-25s", product);
            count++;
            if (count % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    @Override
    public void maxWordProduct(HashMap<String, Integer> basket) {
        // макс длина названия
        for (String key : basket.keySet()){
            if (key.length() > maxSize) {
                maxSize = key.length();
            }
        }
        for (String key : basket.keySet()){
            if (key.length() == maxSize) {
                System.out.println(key);
            }
        }
        System.out.printf("Оно состоит из %d букв.", maxSize);
        System.out.println();
    }
    @Override
    public void maxNumberProduct(HashMap<String, Integer> basket) {
        // макс количество
        for (String key : basket.keySet()){
            if (basket.get(key) > maxNumber) {
                maxNumber = basket.get(key);
            }
        }
        for (String key : basket.keySet()){
            if (basket.get(key) == maxNumber) {
                System.out.println(key + " встречается в корзине " + basket.get(key) + " раз.");
            }
        }
    }
}
