import java.util.*;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("1", "asus", "13", "celeron", "windows", "120", "4");
        Laptop laptop2 = new Laptop("2", "hp", "16", "i7", "linux", "512", "16");
        Laptop laptop3 = new Laptop("3", "msi", "15", "i3", "без os", "240", "8");
        Laptop laptop4 = new Laptop("4", "lenovo", "17", "i5", "windows", "512", "32");
        
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Варианты фильтра:"); 
        System.out.println();
        System.out.println("id Номенклатурный номер\nbrand Производитель\nscreenDiagonal Диагональ\ncpu Процессор\n" + 
        "os Операционная система\nhdd Объем диска\nram Объем оперативной памяти");
        System.out.println();
        System.out.print("Введите критерий фильтра: ");
    
        String criterion = scanner.nextLine();

        // Выводим сообщение пользователю
        System.out.println("Введите значение критерия:");

        // Получаем значение критерия от пользователя
        Object value = scanner.nextLine();

        // Фильтруем ноутбуки по заданному критерию
        List<Laptop> filteredLaptops = filterLaptops(laptops, criterion, value);

        // Выводим ноутбуки, соответствующие фильтру
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }

    public static List<Laptop> filterLaptops(Set<Laptop> laptops, String criterion, Object value) {
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.get(criterion).equals(value)) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }
}
