a = input("Введите строку:")
my_list = a.split()
my_count = 0
for el in my_list:
    my_count+=1
print("Количество слов в предложение:",my_count)