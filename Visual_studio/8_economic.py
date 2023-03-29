import random
n = random.randint(10,12)
S = []
M = []
for i in range(0,n):
    t = random.randint(10,15)
    S.append(t)
print("Спрос: ",S)
for i in range(0,n):
    t = random.randint(10,15)
    M.append(t)
print("Предложение: ",M)
k = 0
for i in range(0,n):
    if S[i] == M[i]:
        print("Спрос равен предложению")
        k = k+1
print("Количество времени, когда спрос равен предложению ",k)