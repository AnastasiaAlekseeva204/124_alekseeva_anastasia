import random
class Animal:
    def __init__(self,name,age,species):
        self.name = name
        self.age = age
        self.species = species 
    def eat(self,s):
        print(self.name, "ест" , s)
    def sleep(self,sl):
        print(self.name, "спит" ,sl)
    def make_sound(self,so):
        print(self.name, "издает звуки" ,so)
    def show(self):
        print("Имя:",self.name, "Возраст:",self.age,"Порода:",self.species)
class Mammal(Animal):
    def __init__(self,name,age,species,color,legs):
        Animal.__init__(self,name,age,species)
        self.color = color
        self.legs = legs
    def give_birth(self):
        return self.age
class Bird(Animal):
    def __init__(self,name,age,species,wingspan,beaklength):
        Animal.__init__(self,name,age,species)
        self.wingspan = wingspan
        self.beaklength = beaklength
    def fly(self,f):
        print(self.name,"летит",f)
    def build_nest(self,bn):
        print(self.name, "строит гнездо",bn)
class Reptile(Animal):
    def __init__(self,name,age,species,scolor,tipevenom):
        Animal.__init__(self,name,age,species)
        self.scolor = scolor
        self.tipevenom = tipevenom
    def lay_eggs(self,egg):
        print(self.name,"сносит яиц:",egg)
    def shed_skin(self,sh):
        print(self.name,"меняет обличие",sh)
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
            print("Забрали из больницы", remove_animal.name)
            self.dict_animals.pop(remove_animal)
        else:
            print("Животного нет в больнице")
    def show(self):
        for k in self.dict_animals:
            print(k.name,self.dict_animals[k])
class Zoo:
    def __init__(self):
        self.list_animal =[]
    def remove_animal(self,remove_animal):
        if remove_animal in self.list_animal:
            print("Забрали из зоопарка",remove_animal.name)
            self.list_animal.remove(remove_animal)
        else:
            print("Такого животного нет в зоопарке")
    def add_animals(self,add):
        print("Вы добавили животного")
        self.list_animal.append(add)
    def show(self):
        for el in self.list_animal:
            print(el.name)
animal_1 = Animal("Луни",4,"шотландский")
animal_1.eat("курица")
animal_1.show()
mamont = Mammal("Сили",500,"неополитанский","белый",4) 
mamont.eat("траву")
print("Возраст: ",mamont.give_birth())
mamont.show()         
bird = Bird("Тиша",6,"Неразлучник",15,3)
bird.eat("Червяки")
bird.show()
reptile = Reptile("Эквалипт",40,"Ящереобразный","черно-зеленая","не ядовит")
reptile.eat("кузнечиков")
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