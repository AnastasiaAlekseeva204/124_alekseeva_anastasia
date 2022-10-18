public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        int t=0;
        if (n1>n2){
            while (n1-n2>=1){
                n1=n1-1;
                if ((n1%a==0) && (n1%b!=0)){
                    t=t+1;
                }
                else{
                    t= t+0;
                }
            }
        }
        else{
            while (n2-n1>=1){
                n2=n2-1;
                if ((n2%a==0) && (n2%b!=0)){
                    t=t+1;
                }
                else{
                    t= t+0;
                }
            }

        }
        return t;
    } // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно

    @Override
    public int subtask_2_for(int num) {
        int p = 0;
        int t = 1;
        for (int i = 0; i <= num; i++) {
            p++;
            for (int l = 0; l < t; l++)
                i++;
            t++;
        }   // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        return p;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        int a = num;
        int i = 0;
        for (int o = 0; o < cnt; o++){
            i = i + a;
            a = a*d + 1;
        }
        return i;
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
    }

    @Override
    public int subtask_4_for(int n) {
        int v = 1;
        int z = 0;
        for(int f = 1; f <= n; f++) {
            v = v * f;
            z = z + v;
        }
        return z; // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
    }
}

