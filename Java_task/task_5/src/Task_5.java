import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        ArrayList<Integer> newlist = new ArrayList<>();
        for (Integer d : data) {
            if ((d % k == 0) && (d % n != 0))
                newlist.add(d);
        }
        return newlist;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        ArrayList<Integer> newlist = new ArrayList<>();
        int a = 0;
        for (int q = 1; q <= size; q++){
            a = 0;
            if (newlist.size() < size)
                while (a < q && newlist.size() < size){
                    newlist.add(q);
                    a++;
                }
            else
                break;
        }

        return newlist;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> intersection = new HashSet<Integer>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        return union;
    }
    // найдите объединение множеств s1 и s2

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> diff = new HashSet<>(s1);
        diff.addAll(s2);
        diff.removeAll(s1);
        return diff;
        // найдите дополнение множества s1 до множества s2
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> diff2 = new HashSet<>();
        for(Integer h : s2) {
            if (!s1.contains(h))
                diff2.add(h);
        }
        for(Integer h : s1) {
            if (!s2.contains(h))
                diff2.add(h);
        }
        return diff2;
    }
    // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        return null;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        return null;
    }
}
