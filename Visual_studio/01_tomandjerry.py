v_tom = int(input("Введите скорость Тома "))
v_jerry = int(input("Введите скорость Джерри "))
s_0 = 20
t = 1
delta = v_tom-v_jerry
if delta<=0:
    print("Не догнал")
else:
    while True:
        s_tom = v_tom*t
        s_jerry = v_jerry*t+s_0
        if s_tom>=s_jerry:
            break
        t = t+1
    print(t)