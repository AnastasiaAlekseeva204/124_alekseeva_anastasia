class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.speed = 0

    def accelerate(self):
        self.speed += 5
        print(f"Ускорение. Текущая скорость: {self.speed} км/ч")

    def brake(self):
        self.speed -= 5
        print(f"Торможение. Текущая скорость: {self.speed} км/ч")

    def get_info(self):
        return f"Марка: {self.make}, Модель: {self.model}, Год выпуска: {self.year}"


car1 = Car("Toyota", "Camry", 2020)
car2 = Car("Honda", "Civic", 2019)

print(car1.get_info())
car1.accelerate()
car1.accelerate()
car1.brake()

print(car2.get_info())
car2.accelerate()
