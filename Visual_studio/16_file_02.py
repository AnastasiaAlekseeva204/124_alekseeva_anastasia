import csv
import datetime
import time

with open('rows_300.csv', 'w', newline='') as csvfile:
    writer = csv.writer(csvfile, delimiter=';')
    writer.writerow(['№', 'Дата и время', 'Секунда', 'Микросекунда'])
    n_rows = 300
    for i in range(n_rows):
        date_time = datetime.datetime.now()
        second = date_time.second
        microsecond = date_time.microsecond
        writer.writerow([i+1, date_time, second, microsecond])
        time.sleep(0.01)