public class Menu {
    public void menuStart(){// главное меню
        
        System.out.println();
        System.out.println("Варианты фильтра:"); 
        System.out.println();
        System.out.println("0 Весь прайс-лист\n1 Номенклатурный номер\n2 Производитель\n3 Диагональ\n4 Процессор\n" + 
        "5 Операционная система\n6 Объем диска\n7 Объем оперативной памяти\n8 Выход");
        System.out.println();
        System.out.print("Введите номер фильтра: ");
    }

    public void menuEnd() { // главное/выход меню
        System.out.println();
        System.out.println("1 Главное меню\n0 Выход");
        System.out.println();
    }

    public void menuId(){// номенклатурный номер ноутбука меню
        
        System.out.println();
        System.out.println("Введите номенклатурный номер ноутбука:"); 
    }

    public void menuBrand(){// производитель меню
        
        System.out.println("Производители: ");
        System.out.println();
        System.out.println("1 asus\n2 msi\n3 hp\n4 lenovo");
        System.out.print("Введите номер производителя:"); 
    }

    public void menuScreenDiagonal(){// диагональ меню
        
        System.out.println();
        System.out.print("Введите диагональ ноутбука:"); 
    }

    public void menuOs(){// операционная система меню
        
        System.out.println("Операционная система:");
        System.out.println();
        System.out.println("1 windows\n2 linux\n3 без ОС");
        System.out.print("Введите номер ОС ноутбука:"); 
    }

    public void menuCpu(){// процессор меню
            
        System.out.println("Процессор:");
        System.out.println();
        System.out.println("1 celeron\n2 i3\n3 i5\n4 i7");
        System.out.print("Введите номер процессора ноутбука:");  

    }

    public void menuHdd(){// диск меню
            
            System.out.println();
            System.out.print("Введите объем диска ноутбука:"); 

    }

    public void menuRam(){// оперативка меню
            
            System.out.println();
            System.out.print("Введите объем оперативной памяти ноутбука:"); 

    }
    
}
