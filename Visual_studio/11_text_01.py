from collections import Counter

text = input("Введите текст: ")
words = text.split()

# Находим самое длинное слово
longest_word = max(words, key=len)

# Находим наиболее часто встречающееся слово
word_count = Counter(words)
most_common_word = word_count.most_common(1)[0][0]

# Если все слова встречаются по 1 разу или
# наиболее часто встречающиеся слова равно по частоте,
# выводим первое слово из списка
if word_count[most_common_word] == 1 or \
word_count.most_common(2)[0][1] == word_count.most_common(2)[1][1]:
 most_common_word = words[0]

print(f"Наиболее часто встречающееся слово: {most_common_word}")
print(f"Самое длинное слово: {longest_word}")