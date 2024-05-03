import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainLaptop1 {
    private static Menu myMenu = new Menu();
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "asus", 13, "celeron", "windows", 120, 4);
        Laptop laptop2 = new Laptop(2, "hp", 16, "i7", "linux", 512, 16);
        Laptop laptop3 = new Laptop(3, "msi", 15, "i3", "без os", 240, 8);
        Laptop laptop4 = new Laptop(4, "lenovo", 17, "i5", "windows", 512, 32);
        
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));

        Map<String, String> filter = new HashMap<>();
        filter.put("1", "id");
        filter.put("2", "brand");
        filter.put("3", "screenDiagonal");
        filter.put("4", "cpu");
        filter.put("5", "os");
        filter.put("6", "hdd");
        filter.put("7", "ram");
        
        Map<String, String> criteriMap = criteriaFilter(filter);
        filterLaptops(laptopSet, criteriMap);
    } 
    

    public static void filterLaptops(Set<Laptop> laptopSet, Map<String, String> criteriMap){
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : filteredLaptops) {
            
        }
    }

    public static Map<String, String> criteriaFilter(Map<String, String> filter) {
        Map<String, String> criteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        myMenu.menuStart();
        while (true) {
            String key = scanner.nextLine();
            switch (key) {
                case "1":
                    myMenu.menuId();
                    String value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria;
                case "2":
                    myMenu.menuBrand();
                    value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria;
                case "3":
                    myMenu.menuScreenDiagonal();
                    value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria;
                case "4":
                    myMenu.menuCpu();
                    value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria;    
                case "5":
                    myMenu.menuOs();
                    value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria;  
                case "6":
                    myMenu.menuHdd();
                    value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria; 
                case "7":
                    myMenu.menuRam();
                    value = scanner.nextLine();
                    criteria.put(key, value); 
                    return criteria;

                default:
                    throw new IllegalArgumentException("Неизвестный тип критерия");
            }
              
        }
        
    }    
    
        
    public static void allLaptops(Set<Laptop> laptopSet){ // весь список
        System.out.println();
        System.out.println("Весь прайс-лист:");
        System.out.println();

        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
        }
    }
}
    

