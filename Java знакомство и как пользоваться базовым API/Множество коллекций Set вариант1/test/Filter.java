import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Filter {
    private static Menu myMenu = new Menu();

    public static void filterLaptops(Set<Laptop> laptopSet){
        Scanner scanner = new Scanner(System.in);
        List<Laptop> filteredLaptops = new ArrayList<>();
        myMenu.menuStart();
        while (true) {
            String value = scanner.nextLine();
                try {
                switch (value) {
                    case "0":
                        allLaptops(laptopSet);
                        break;
                    case "1":
                        myMenu.menuId();
                        value = scanner.nextLine();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getId() == Integer.parseInt(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        } 
                        break;
                    case "2":
                        myMenu.menuBrand();
                        value = scanner.nextLine();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getBrand().equals(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        }     
                        break;   
                    case "3":
                        myMenu.menuScreenDiagonal();
                        value = scanner.nextLine();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getScreenDiagonal() == Integer.parseInt(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        } 
                    case "4":
                        myMenu.menuOs();
                        value = scanner.nextLine();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getBrand().equals(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        }     
                        break;     
                    case "5":
                        myMenu.menuCpu();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getCpu().equals(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        }     
                        break;
                    case "6":
                        myMenu.menuHdd();
                        value = scanner.nextLine();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getHdd() >= Integer.parseInt(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        } 
                        break;
                    case "7":
                        myMenu.menuRam();
                        value = scanner.nextLine();
                        try {
                            for (Laptop laptop : laptopSet) {
                                if (laptop.getRam() >= Integer.parseInt(value)) {
                                    filteredLaptops.add(laptop); 
                                }
                            }    
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Неизвестный тип критерия");
                        }
                        if (!filteredLaptops.isEmpty()) {
                            System.out.println(filteredLaptops);
                        }else{
                            System.out.println("Такой ноутбук не найден");
                        } 
                        break;
                            
                    default:
                        throw new IllegalArgumentException("Программа закончила работу");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Неизвестный тип критерия");
                //break; // старт/выход меню
            }
        }

        

    }
    

    public void allLaptops(Set<Laptop> laptopSet){ // весь список
        System.out.println();
        System.out.println("Весь прайс-лист:");
        System.out.println();

        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
        }

    }
}
