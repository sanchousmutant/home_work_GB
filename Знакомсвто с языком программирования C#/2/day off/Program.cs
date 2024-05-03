// Задача 15: Напишите программу, которая принимает
// на вход цифру, обозначающую день недели,
// и проверяет, является ли этот день выходным.
// 6 -> да
// 7 -> да
// 1 -> нет


int InputNum(string message)
{
    System.Console.Write(message);
    return int.Parse(Console.ReadLine()!);
}

string DayOff(int num)
{
    if(num == 6 | num == 7)
    {
        return "да";
    }
    else
    {
        return "нет";
    }
}  
int number = InputNum("Введите число: ");
string result = DayOff(number);
System.Console.WriteLine(result);  