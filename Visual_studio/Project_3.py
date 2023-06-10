import random
class Animal:
    def __init__(self,name,age,species):
        self.__name = name
        self.__age = age
        self.__species = species 
    def set_name(self,name):
        self.__name = name
    def get_name(self):
        return self.__name
    def get_age(self):
        return self.__age
    def set_age(self,age):
        self.__age = age
    def set_species(self,species):
        self.__species = species
    def get_species(self):
        return self.__species
    def eat(self):
        #print(self.name, "ест" , s)
        print("Все животные едят")
    def sleep(self):
       # print(self.name, "спит" ,sl)
       print("Все животные спят")
    def make_sound(self):
        print("Все животные издают звуки")
    def show(self):
        print("Имя:",self.__name, "Возраст:",self.__age,"Порода:",self.__species)
class Mammal(Animal):
    def __init__(self,name,age,species,color,legs):
        Animal.__init__(self,name,age,species)
        self.color = color
        self.legs = legs
    def give_birth(self):
        return self.get_age()
    def eat(self):
        print("Мамонты едят траву")
    def sleep(self):
        print("Мамонты спят в траве")
    def make_sound(self):
        print("Мамонты издают звуки ву")
class Bird(Animal):
    def __init__(self,name,age,species,wingspan,beaklength):
        Animal.__init__(self,name,age,species)
        self.wingspan = wingspan
        self.beaklength = beaklength
    def fly(self):
        print(self.get_name(),"летит")
    def build_nest(self):
        print(self.get_name(), "строит гнездо")
    def eat(self):
        print("Птицы едят червяков")
    def sleep(self):
        print("Птицы спят на дереве")
    def make_sound(self):
        print("Птички издают звуки чик-чирик")
class Reptile(Animal):
    def __init__(self,name,age,species,scolor,tipevenom):
        Animal.__init__(self,name,age,species)
        self.scolor = scolor
        self.tipevenom = tipevenom
    def lay_eggs(self):
        print(self.get_name(),"сносит яиц:")
    def shed_skin(self):
        print(self.get_name(),"меняет обличие")
    def eat(self):
        print("Рептилии едят кузнечиков")
    def sleep(self):
        print("Рептилии спят на ветке ")
    def make_sound(self):
        print("Рептилии издают звуки ширк ширк")
class Enclosure:
    def __init__ (self):
        self.dict_animals = {}
        self.dict_params = {}
    '''def __init__(self,size,temperature):
        self.size = size
        self.temperature = temperature'''
    def add_animal(self,ad):
        print("Вы добавили животное")
        dict_params = {"size": random.randint(10,100),"temp":random.randint(35,40)}
        self.dict_animals[ad] = dict_params
    def remove_animal(self,remove_animal):
        if remove_animal in self.dict_animals:
            print("Забрали из больницы", remove_animal.get_name())
            self.dict_animals.pop(remove_animal)
        else:
            print("Животного нет в больнице")
    def show(self):
        for k in self.dict_animals:
            print(k.get_name(),self.dict_animals[k])
class Zoo:
    def __init__(self):
        self.list_animal =[]
    def remove_animal(self,remove_animal):
        if remove_animal in self.list_animal:
            print("Забрали из зоопарка",remove_animal.get_name())
            self.list_animal.remove(remove_animal)
        else:
            print("Такого животного нет в зоопарке")
    def add_animals(self,add):
        print("Вы добавили животного")
        self.list_animal.append(add)
    def show(self):
        for el in self.list_animal:
            print(el.get_name())
    def check(self,ad):
        if ad in self.list_animal:
            return 1   
        else:
            return 0
class Zookeeper:
    def __init__(self):
        self.dict_animals = {}
        self.dict_params = {}
    def add_animal(self,ad,name,year):
        print("Вы взяли животное на содержание")
        dict_params = {"name": name,"year": year}
        self.dict_animals[ad] = dict_params
    def feed_animals(self,ad):
        print("Животное покормили морковкой", ad.get_name())
    def clean_enclosures(self,ad):
        print("Вы убрали за животным", ad.get_name())
    def remove_animal(self,ad):
        if ad in self.dict_animals:
            print("Больше здесь не работает ",ad.get_name())
            self.dict_animals.pop(ad.get_name())
        else:
            print("За животным не ухаживают")
    def show(self):
        for k in self.dict_animals:
            print(k.get_name(),self.dict_animals[k])
animal_1 = Animal("Луни",4,"шотландский")
animal_1.eat()
animal_1.sleep()
animal_1.make_sound()
animal_1.show()
mamont = Mammal("Сили",500,"неополитанский","белый",4) 
mamont.eat()
mamont.sleep()
mamont.make_sound()
print("Возраст: ",mamont.give_birth())
mamont.show()         
bird = Bird("Тиша",6,"Неразлучник",15,3)
bird.eat()
bird.sleep()
bird.make_sound()
bird.fly()
bird.build_nest()
bird.show()
reptile = Reptile("Эквалипт",40,"Ящереобразный","черно-зеленая","не ядовит")
reptile.eat()
reptile.sleep()
reptile.make_sound()
reptile.show()
en = Enclosure()
en.add_animal(animal_1)
en.add_animal(mamont)
en.show()
en.remove_animal(animal_1)
en.remove_animal(animal_1)
en.show()
z = Zoo()
z.add_animals(animal_1)
z.add_animals(bird)
z.show()
z.remove_animal(bird)
z.remove_animal(bird)
z.show()
zk = Zookeeper()
if z.check(animal_1):
    zk.add_animal(animal_1,"Иван",2)
    zk.feed_animals(animal_1)
    zk.clean_enclosures(animal_1)
else:
    print("Такого животного нет в зоопарке")
if z.check(bird):
    zk.add_animal(bird,"Мария",5)
    zk.feed_animal(bird)
    zk.clean_enclosures(bird)
else:
    print("Такого животного нет в зоопарке")