public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        int count = 0;
        int finN = 0;
        while (count <= num) {
            if (count * count <= num)
                finN = count * count;
            else
                break;
            count++;
        }
        return finN;
        // Найти максимальное число, являющееся полным квадрато
        // не превосходящее заданное натуральное num
    }


    @Override
    public int subtask_2_while(int num) {
        int p = 1;
        if (num == 0)
            p = 1;
        else
            while (num != 0) {
                p = 2 * p + 6;
                num--;
            }
        return p;
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num

    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        int n = base;
        while (n < num)
            n = n * base;
        return n == num;// Проверить, является ли число num натуральной степенью числа base
    }

    @Override
    public int subtask_4_while(int start, int end) {
        int j = 0;
        while (start > end) {
            if ((start % 2 != 0) || (start - end == 2)) {
                start--;
                j++;
            } else {
                start = start / 2;
                j++;
            }
        }
        return j;
    } // Вычислить, за какое минимальное число операций
    // вычесть 1
    // поделить на 2
    // число start можно превратить в end. Гарантируется, что start >= end >= 1
}

