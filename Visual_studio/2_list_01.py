import random
n1 = random.randint(50,100)
n2 = random.randint(50,100)
my_list_1 = []
my_list_2 = []
for i in range(0,n1):
    temp = random.randint(0,1000)
    my_list_1.append(temp)
print("Первый список ",my_list_1)
print()
for i in range(0,n2):
    temp = random.randint(0,1000)
    my_list_2.append(temp)
print("Второй список ",my_list_2)
print()
my_str =""
for el in my_list_1:
    if el not in my_list_2:
        ##print(el)
        my_str = my_str+str(el)+" "
if my_str:
    print("Элементы первого списка, которых нет во втором ",my_str)
else:
    print("Таких элементов нет")