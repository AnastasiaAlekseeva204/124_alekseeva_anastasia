def search_substr(subst,st):
    ##Hprint(st,subst)
    st = st.lower()
    subst = subst.lower()
    ##print(st,subst)
    if st.find(subst)>=0:
        print("Есть контакт!")
    else:
        print("Мимо!")
st= input("Введите строку:")
subst = input("Введите подстроку:")
search_substr(subst,st)

