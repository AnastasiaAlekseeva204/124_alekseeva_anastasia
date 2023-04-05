import random
name = input("Как вас зовут? ")
a = random.randint(1,100)
print("Загаданное число: ",a)
temp_a=0
k = 0
while(a!=temp_a):
    temp_a = int(input("Введи число от 1 до 100: "))
    if(a>temp_a):
        print("Больше")
    elif (a<temp_a):
        print("Меньше")
    else:
        print("Вы угадали!","Количество попыток: ",k)
    k = k+1
with open("game.txt","a",encoding = "utf-8") as f:
    f.write(name+" " + str(k)+"\n")