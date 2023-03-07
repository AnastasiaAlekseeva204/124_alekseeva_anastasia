import random
def magic(list_1,x):
    sum = 0
    for el in list_1:
        sum = sum+el
    print("Сумма элементов равна ",sum)
    if sum%x ==0:
        return True
    else:
        return False
n = random.randint(5,100)
list_1 = []
x = 2
for i in range(0,n):
    temp = random.randint(0,10)
    list_1.append(temp)
print(list_1)
result = magic(list_1,x)
if result == True:
    print("Можно")
else:
    print("Нельзя")