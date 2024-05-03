// Задача 10: Напишите программу, которая принимает
// на вход трёхзначное число и на выходе показывает
// вторую цифру этого числа.
// 456 -> 5
// 782 -> 8
// 918 -> 1


int InputNum(string message)
{
    System.Console.Write(message);
    return int.Parse(Console.ReadLine()!);
}

int SecondDigit(int num)
{
    num = num / 10 % 10;
    return num;
}
int number = InputNum("Введите трехзначное число: ");
int secondDigit = SecondDigit(number);
System.Console.WriteLine($"Вторая цифра трехзначного числа {number} будет {secondDigit}");