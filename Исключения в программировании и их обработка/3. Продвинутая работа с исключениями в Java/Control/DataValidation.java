package Control;

import Control.Error.DateFormatException;
import Control.Error.NumberPhoneFormatException;
import View.DataInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataValidation {
    //Input input
    public String[] validation(DataInterface input) {
        String[] data = input.dataInput().split(" ");
            //проверка введенных данных по количеству
        if (data.length != 6) {
            throw new RuntimeException("Неверное количество данных. Введите 6 значений, разделенных пробелом.");
        }
            //проверка длины ФИО
        if (data[0].length() < 2 || data[1].length() < 2 || data[2].length() < 2){
            throw new RuntimeException("Некорректные данные. Введите ФИО длиной от 2 символов");
        }
        try {
            // проверка формата даты
            Date dateOfBirth = new SimpleDateFormat("dd.MM.yyyy").parse(data[3]);
        } catch (ParseException e) {
            throw new DateFormatException(data[3]);
        }
        try {
            // проверка формата номера телефона
            int phoneNumber = Integer.parseInt(data[4]);
        } catch (NumberFormatException e) {
            throw new NumberPhoneFormatException(data[4]);
        }
                //проверка формата пол
        if (!data[5].equalsIgnoreCase("м") && !data[5].equalsIgnoreCase("ж")) {
            throw new RuntimeException("Неверный пол. Введите 'ж' для женского или 'м' для мужского.");
        }
        return data;
    }
}
