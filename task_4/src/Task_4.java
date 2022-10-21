public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        int nArray[] = new int[size];
        nArray[0]=a0;
        for (int y = 1; y < size; y++){
            nArray[y]=nArray[y-1]+d;
        }
        return nArray;
    }
       // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d

    @Override
    public int[] subtask_2_arrays(int size) {
    int nArray[] = new int[size];
    int sum = 2;
    for(int k = 0; k < size; k++)
        {
            if (k <= 1) {
                nArray[k] = 1;
        }
        else {
            nArray[k] = sum;
            sum = sum + nArray[k];
        }
        }
        return nArray;
    }
    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        return null;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        int max =data[0];
        for(int s =0 ;s < data.length; s++){
            if(data[s]>max){
                max = data[s];
                // Для данного массива вычислить максимальный элемент
            }
        }
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        int max = Integer.MIN_VALUE;
        for(int x = 0; x < data.length; x++){
            if((data[x]>max) && (data[x] % k == 0)){
                max = data[x];
            }
            // Для данного массива вычислить максимальный элемент
        }
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        return max;
    }
    public static void Sort(int[] a){
        boolean sort = false;
        int temp;
        while(!sort) {
            sort = true;
            for (int x = 0; x < a.length - 1; x++) {
                if (a[x] > a[x+1]) {
                    temp = a[x];
                    a[x] = a[x+1];
                    a[x+1] = temp;
                    sort = false;
                }
            }
        }
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int j = 0; j < arr1.length; j++) {
            arr3[j]=arr1[j];
        }
        for(int j = arr1.length; j < arr3.length; j++) {
            arr3[j]=arr2[j-arr1.length];
        }
        Sort(arr3);
        return arr3;
    } // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
