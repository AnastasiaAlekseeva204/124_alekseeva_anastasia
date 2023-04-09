a = input("Введите строку: ")
a = a.replace(",","")
print(a)
list_str = a.split()
print(list_str)
max_ln = 0
max_w = ""
for el in list_str:
    if len(el)>max_ln:
        max_ln = len(el)
        max_w = el
    #print(el,len(el))
print("Максимальная длинна слова: ",max_ln,max_w)
repeat_w= ""
repeat_count = 0
for el in list_str:
    count_s = 0
    for check in list_str:
        if el == check:
            count_s+=1
   #print("Слово:",el)
   #print("Количество:",count_s)
    if count_s > repeat_count:
        repeat_w = el
        repeat_count =  count_s
print("Наиболее встречающееся слово:",repeat_w,repeat_count)