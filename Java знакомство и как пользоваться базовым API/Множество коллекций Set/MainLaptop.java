import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static java.util.Arrays.*;

/**
 * MainLaptop
 */
public class MainLaptop {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("1", "asus", "13", "celeron", "windows", "120", "4");
        Laptop laptop2 = new Laptop("2", "hp", "16", "i7", "linux", "512", "16");
        Laptop laptop3 = new Laptop("3", "msi", "15", "i3", "без os", "240", "8");
        Laptop laptop4 = new Laptop("4", "lenovo", "17", "i5", "windows", "512", "32");
        Set<Laptop> laptops = new HashSet<>(asList(laptop1, laptop2, laptop3, laptop4)); // множество ноутбуков
        Map<String, String> filterLaptops = filterLaptops(); // множество фильтров
        Map<String, String> menuSet = createMenu(); // множество критериев фильтра
        startMenu(); // стартовое меню
        Scanner scanner = new Scanner(System.in);
        String criterion = scanner.nextLine(); // запрос критерия фильтра
        System.out.print(menuSet.get(filterLaptops.get(criterion))); // вывод критерия
        String value = scanner.nextLine(); // запрос значения критерия
        filterLaptops(laptops, filterLaptops, criterion, value); // фильтр
    }

    private static void printFilteredLaptop(List<Laptop> filteredLaptops) { // печать результата фильтра
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }

    }

    private static void startMenu() {  // стартовое меню
        System.out.println();
        System.out.println("Варианты фильтра:");
        System.out.println();
        System.out.println("1 Номенклатурный номер\n2 Производитель\n3 Диагональ\n4 Процессор\n5 Операционная система\n6 Объем диска\n7 Объем оперативной памяти");
        System.out.println();
        System.out.print("Введите введите номер фильтра: ");
    }

    public static Map<String, String> createMenu() {  // множества критериев фильтра
        Map<String, String> menuSet = new HashMap<>();
        menuSet.put("id", "Введите номенклатурный номер ноутбука от 1 до 4: ");
        menuSet.put("brand", "Введите одно из наименований бренда: msi, lenovo, hp, asus: ");
        menuSet.put("screenDiagonal", "Ведите размер диагонали от 13\" до 17\": ");
        menuSet.put("os", "Введите операционную систему: windows, linux, без ос: ");
        menuSet.put("cpu", "Введите один из вариантов процессоров: celeron, i3, i5, i7: ");
        menuSet.put("hdd", "Введите объем диска в диапазоне от 120 гБ до 512 гБ: ");
        menuSet.put("ram", "Введите объем оперативной памяти в диапазоне от 4 ГБ до 32 гБ: ");
        return menuSet;
    }

    private static Map<String, String> filterLaptops() { //множество фильтров
        Map<String, String> criterionFilter = new HashMap<>();
        criterionFilter.put("1", "id");
        criterionFilter.put("2", "brand");
        criterionFilter.put("3", "screenDiagonal");
        criterionFilter.put("4", "cpu");
        criterionFilter.put("5", "os");
        criterionFilter.put("6", "hdd");
        criterionFilter.put("7", "ram");
        return criterionFilter;
    }

    public static void filterLaptops(Set<Laptop> laptops, Map<String, String> filter, String criterion, String value) {  // фильтр
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            if (laptop.get(filter.get(criterion)).equals(value)) {
                filteredLaptops.add(laptop);
            }
        }

        if (!filteredLaptops.isEmpty()) {
            System.out.println();
            System.out.println("У нас для вас есть решение: ");
            System.out.println();
            printFilteredLaptop(filteredLaptops);
        } else {
            System.out.println();
            System.out.println("Ничего не найдено");
        }

    }
}
