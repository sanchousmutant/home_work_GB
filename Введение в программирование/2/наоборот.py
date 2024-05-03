lst = list(map(int, input().split()))
first = 0
last = len(lst) - 1
while first < len(lst) / 2:
        temp = lst[first]
        lst[first] = lst[last]
        lst[last] = temp
        first += 1
        last -= 1
print(lst)    
