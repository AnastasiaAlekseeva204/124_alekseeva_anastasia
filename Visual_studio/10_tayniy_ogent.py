def check_login(list_of_secrets,proverka):
    if proverka in list_of_secrets:
        print("Ты – свой. Приветствую, любезный ",proverka)
    else:
        print("Тут ничего нет. Еще есть вопросы?")
list_of_secrets = ["Мавпродош","Лорнектиф","Древерол","Фиригарпиг"," Клодобродыч","Максим"]
proverka = input("Введите свое имя: ")
check_login(list_of_secrets, proverka)