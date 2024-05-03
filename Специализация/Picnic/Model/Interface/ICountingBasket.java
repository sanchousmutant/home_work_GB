package Model.Interface;

import Controler.Interface.FileToHashMap;

import java.util.HashMap;

public interface ICountingBasket {
    void numberProduct(HashMap<String, Integer> basket);

    void printListProduct(HashMap<String, Integer> basket);

    void maxWordProduct(HashMap<String, Integer> basket);

    void maxNumberProduct(HashMap<String, Integer> basket);
}
