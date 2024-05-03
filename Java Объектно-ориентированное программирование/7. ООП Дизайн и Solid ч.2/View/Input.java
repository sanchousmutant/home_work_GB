package View;

import java.util.Scanner;

public class Input {

    public  double add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();
        return num;
    }
}
