from telegram import Update, Bot
from telegram.ext import Updater, CommandHandler, MessageHandler, Filters, CallbackContext

# Вставьте токен вашего бота здесь
TOKEN = '6195318540:AAFnbm2sRfK41mKdh7LqCOwmILo8vsTPOP4'

# Функция для обработки команды /start
def start(update, context):
    context.bot.send_message(chat_id=update.effective_chat.id, text="Привет! Я твой персональный бот-ассистент для подготовки к поступлению в университет.")

# Функция для обработки команды /help
def help(update, context):
    context.bot.send_message(chat_id=update.effective_chat.id, text="Список доступных команд: \n /start - Начать общение с ботом \n /help - Получить список доступных команд \n /subjects - Список предметов для вступительных экзаменов \n /advice - Получить советы для успешной подготовки к поступлению")

# Функция для обработки команды /subjects
def subjects(update, context):
    context.bot.send_message(chat_id=update.effective_chat.id, text="Список предметов для вступительных экзаменов: \n 1. Математика \n 2. Русский язык \n 3. Физика \n 4. Химия \n 5. Биология \n 6. Обществознание")

# Функция для обработки команды /advice
def advice(update, context):
    context.bot.send_message(chat_id=update.effective_chat.id, text="Несколько советов для успешной подготовки к поступлению: \n 1. Начните готовиться заранее, не откладывайте на потом \n 2. Составьте план подготовки, распределяя время на каждый предмет \n 3. Используйте различные источники для подготовки, не ограничивайтесь только учебниками \n 4. Решайте много тестов и задач, чтобы привыкнуть к формату экзамена \n 5. Поддерживайте здоровый образ жизни, не забывайте о физических упражнениях и здоровом питании")
# Функция для обработки команды /actual
def actual(update,context):
    context.bot.send_message(chat_id=update.effective_chat.id, text="Список актуальных профессий связаных с предметами: \n 1.Робототехника и киберфизические системы(предметы: математика,русский язык и химия) \n 2.Геология и геохимия горючих ископаемых(предметы: математика,русский язык и химия) \n 3.Data Mining Specialist: специалист по интеллектуальной обработке данных(предметы: математика,русский язык и биология)")
# Функция для обработки всех остальных сообщений
def echo(update, context):
    context.bot.send_message(chat_id=update.effective_chat.id, text="Извините, я не понимаю эту команду. Пожалуйста, введите /help")
updater = Updater(token=TOKEN, use_context=True)

# Получаем диспетчер сообщений
dispatcher = updater.dispatcher

# Регистрируем обработчики команд
dispatcher.add_handler(CommandHandler("start", start))
dispatcher.add_handler(CommandHandler("help", help))
dispatcher.add_handler(CommandHandler("subjects", subjects))
dispatcher.add_handler(CommandHandler("advice", advice))
dispatcher.add_handler(CommandHandler("actual",actual))

# Регистрируем обработчик всех остальных сообщений
dispatcher.add_handler(MessageHandler(Filters.text & (~Filters.command), echo))

# Запускаем бота
updater.start_polling()


# Останавливаем бота, если была нажата Ctrl+C
updater.idle()
