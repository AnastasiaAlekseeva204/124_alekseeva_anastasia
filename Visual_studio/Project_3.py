# -*- coding: utf-8 -*-
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
    def __init__(self,size,temperature):
        self.size = size
        self.temperature = temperature
    def add_animal(self,ad):
        print(self.name,"добавили",ad)
class Zookeeper:
    def __init__(self,name,yearofexpert):
        self.name = name
        self.yearofexpert = yearofexpert
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