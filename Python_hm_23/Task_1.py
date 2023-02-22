import math
def power(m2,r):
    g = 6.6743*math.pow(10,-11)
    m1 = 5.97600*math.pow(10,24)
    f = (g*m1*m2)/(r*r)
    return f
m_temp= float(input("Введите массу второй планеты "))
#print(m_temp)
int_p = int(input("Введите степень второй планеты "))
#print(int_p)
m2 =m_temp*math.pow(10,int_p)
print(m2)
r = int(input("Введите расстояние (км)"))
r = r*1000
print(r)
print("Сила гравитационной силы = ",power(m2,r))
