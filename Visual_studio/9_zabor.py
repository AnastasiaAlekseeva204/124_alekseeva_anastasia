def str_change_u(s):
    s = s.lower()
    flag = 0
    s_new = ""
    for el in s:
        if el.islower() and el.isalpha() and flag == 0:
            s_new = s_new + el
            flag = 1
        elif flag == 1 and el.isalpha():
            s_new = s_new +el.upper()
            flag = 0
        else:
            s_new = s_new +el
    return s_new
s = ".Hello, my name is Nastya. I am 19 years old."
print(s)
s2 = str_change_u(s)
print(s2)