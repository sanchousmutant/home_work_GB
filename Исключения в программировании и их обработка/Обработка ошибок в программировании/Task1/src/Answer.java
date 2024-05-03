//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//
//Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//
//Метод divisionByZero - Деление на 0
//
//Метод numberFormatException - Ошибка преобразования строки в число
//
//Важно: они не должны принимать никаких аргументов

public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[5]);
    }

    public static void divisionByZero() {
        System.out.println(2 / 0);
    }

    public static void numberFormatException() {
        System.out.println(Integer.parseInt("asd"));
    }
}
