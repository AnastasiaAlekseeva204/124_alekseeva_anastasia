def sum_range(start, end):
    sum_1 = 0
    if start > end:
        start, end = end, start
    for i in range(start, end+1):
        sum_1 = sum_1+i
    return sum_1
start = int(input("Введите 1 число "))
end = int(input("Введите 2 число "))
print("Сумма чисел: ",sum_range(start,end))
