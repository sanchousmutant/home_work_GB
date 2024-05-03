// Задача 13: Напишите программу, которая выводит
// третью цифру заданного числа или сообщает,
// что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

int InputNum(string message)
{
    System.Console.Write(message);
    return int.Parse(Console.ReadLine()!);
}

object ThirdDigit(int num)
{
    if(num / 100 == 0)
    {
        return "третьей цифры нет";
    }
    else 
    {
        while(num / 1000 != 0)
        {
            num = num / 10;    
        }
        return num % 10;
    }         
}
int number = InputNum("Введите число: ");
var result = ThirdDigit(number);
System.Console.WriteLine(result);