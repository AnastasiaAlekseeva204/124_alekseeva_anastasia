def netflix_subscription(x, y, z, cost):
    # Создаем список из трех чисел X, Y, Z
    numbers = [x, y, z]
    # Сортируем список по возрастанию
    numbers.sort()
    # Первоначально считаем, что максимальное приближение равно сумме двух наименьших чисел
    max_approximation = numbers[0] + numbers[1]
    # Сравниваем максимальное приближение с суммой двух максимальных чисел
    if numbers[1] + numbers[2] < cost:
        # Если сумма двух максимальных чисел меньше COST, то максимальное приближение не меняется
        pass
    elif numbers[0] + numbers[2] > cost:
        # Если сумма наименьшего и максимального числа больше COST, то максимальное приближение равно сумме двух максимальных чисел
        max_approximation = numbers[1] + numbers[2]
    else:
        # В остальных случаях максимальное приближение равно сумме наименьшего и максимального числа
        max_approximation = numbers[0] + numbers[2]
    # Возвращаем максимальное приближение
    return max_approximation
x = 1000
y = 500
z = 250
cost = 100

max_approximation = netflix_subscription(x, y, z, cost)

print(max_approximation) 