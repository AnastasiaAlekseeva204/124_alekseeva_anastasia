import random
n1 = random.randint(50,100)
n2 = random.randint(50,100)
my_list_1 = []
my_list_2 = []
for i in range(0,n1):
    temp = random.randint(0,1000)
    my_list_1.append(temp)
print("Первый список ", my_list_1)
for i in range(0,n2):
    temp = random.randint(0,1000)
    my_list_2.append(temp)
print("Второй список ",my_list_2)
print()
result_list = []
for el in my_list_1:
    if el in my_list_2:
        result_list.append(el)
print("Общий список ", result_list)
