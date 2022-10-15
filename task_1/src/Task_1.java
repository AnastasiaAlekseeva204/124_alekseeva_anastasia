public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        if (first < second && first < third)
            return first;
        else if (second < first && second < third)
            return second;
        else
            return third;
    }
    @Override
    public boolean subtask_2_if(int year) {
       if ((year % 4 == 0)&&(year % 100 != 0 )  || (year % 400 ==0))
           return true;
       else
           return false;
    }
    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        double up_side = left_up_x+width, left_side = left_up_y-height;
        if(width == height)
            if((up_side - x <= 0.000001  x-left_up_x <= 0.000001)  (left_up_y-y <= 0.000001 || y-left_side <= 0.000001))
        return 0;
            else
        if(x > left_up_x && x < up_side && y < left_up_y && y > left_side)
            return 1;
        else
            return 0;
        else
        return 2;
    }
    // Проверить, лежит ли точка с координатами (x, y) внутри невырожденного квадрата
        // со сторонами, параллельными осям координат, левый верхний угол которого имеет
        // координаты (left_up_x, left_up_y), ширина которого width, высота height.
        // Точка на границе считается не лежащей внутри.
        // В качестве результата вернуть:
        // 0 - не лежит
        // 1 - лежит
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
    // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {
        double y = (k * x0) + second;
        if (y0 > y && y0 - y >= 0.000001) {
            return 0;
        } else if (y0 < y && y - y0 >= 0.000001) {
            return 1;
        } else {
            return 2;
            // Проверить, как расположена точка с координатами (x0, y0)
        // относительно прямой y = kx + b
        // В качестве результата вернуть:
        // 0 - лежит выше прямой
        // 1 - лежит ниже прямой
        // 2 - лежит на прямой
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public String subtask_5_switch(int day_od_week) {
        if (day_od_week == 1) {
            return "Понедельник";
        } else if (day_od_week == 2){
            return "Вторник";
        } else if (day_od_week == 3) {
            return "Среда";
        } else if (day_od_week == 4) {
            return "Четверг";
        } else if (day_od_week == 5) {
            return "Пятница";
        } else if (day_od_week == 6) {
            return "Суббота";
        } else if (day_od_week == 7) {
            return "Воскресенье";
        } else {
            return "Ошибка";
        }
    }
    @Override
    public String subtask_6_switch(int direction) {
        if (direction == 1) {
            return "север";
        } else if (direction == 2) {
            return "юг";
        } else if (direction == 3) {
            return "запад";
        } else if (direction == 4) {
            return "восток";
        } else {
            return ""; // Замените данный оператор кодом, решающим поставленную задачу.
        }
    }
    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        // Проверить, достигнет ли снаряд, летяший из точки (0, 0, 0)
        // в направлении (vx, vy, vz) со скоростью speed стены, параллельной плоскости OYZ,
        // имеющей координату x равной wall, за время time
        // 0 - не достигнет
        // 1 - достигнет
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        return 0; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
    return 0; // Замените данный оператор кодом, решающим поставленную задачу.
    }
}
