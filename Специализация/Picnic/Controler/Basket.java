package Controler;

import Controler.Interface.FileToHashMap;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Basket implements FileToHashMap<String, Integer> {

    private final String filePath;
    public Basket(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public HashMap<String, Integer> fileToHashMap() {
        List<String> lst = new ArrayList<>();
        HashMap<String, Integer> lstPicnic = new HashMap<>();
        try (Scanner str = new Scanner(new File(this.filePath))) {
            while (str.hasNext()){
                lst.add(str.next());
            }
            for (String item : lst) {
                lstPicnic.put(item, Collections.frequency(lst, item));
            }
            return lstPicnic;
        } catch (IOException ex) {
            System.out.println("Корзина пустая");
            return lstPicnic;
        }

    }
}
