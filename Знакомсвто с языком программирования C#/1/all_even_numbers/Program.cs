// Задача 8: Напишите программу, которая на вход
// принимает число (N), а на выходе показывает
// все чётные числа от 1 до N.
// 5 -> 2, 4
// 8 -> 2, 4, 6, 8


Console.Write("Введите натуральное число: ");
int num = int.Parse(Console.ReadLine()!);
int start = 1;
if (num == 1)
{
    Console.Write($"Четных чисел нет");
}
else
{
    Console.Write($"Четные числа в интервале от 1 до {num}: ");
    while (start <= num)
    {
        if(start % 2 == 0)
        {
        Console.Write($"{start} ");
        }
        start++;   
    }
}