array = list(map(int, input().split()))
arrayMax = array[0]
arrayMin = array[0]
Max = 0
Min = 0
index = 1
Sum = 0
while index < len(array):
        if arrayMax < array[index]:
                arrayMax = array[index]
                Max = index
        elif arrayMin > array[index]:
                arrayMin = array[index]
                Min = index
        index += 1
if Max < Min:
        temp = Max
        Max = Min
        Min = temp
index = Min + 1
while index < Max:
        Sum += array[index]
        index += 1
print(Sum)    
