#Задание: необходимо создать Dockerfile, основанный на любом образе (вы в праве выбрать самостоятельно).
#В него необходимо поместить приложение, написанное на любом известном вам языке программирования 
#(Python, Java, C, С#, C++).
#При запуске контейнера должно запускаться самостоятельно написанное приложение

# java файл

sudo nano palindrom.java

/*
 * Напишите метод, который принимает на вход строку (String)
 *  и определяет является ли строка палиндромом 
 * (возвращает boolean значение)
 * Пример: 
 * ввод "A rosa upala na lapu Asora"
 * вывод true
 */

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = iScanner.nextLine();
        System.out.println(palindrom(str));
        iScanner.close();
    }
    public static boolean palindrom(String str) {
        str = str.toLowerCase();
        str = str.replace(" ", "");
        for (int i = 0; i < str.length() / 2; i++) {
           if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}

# Dockerfile

FROM ubuntu:22.04
RUN apt-get update && \
    apt-get -y install openjdk-8-jdk && \
    apt-get -y install openjdk-8-jre
WORKDIR /app
COPY palindrom.java /app/
RUN javac palindrom.java -encoding UTF-8
CMD ["java", "palindrom"]

# собирае образ

docker run -it my-docker-images .

# запускаем контейнер

docker run -it my-docker-images



