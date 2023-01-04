public class Main {
    public static void main (String[]args){
        Summa s = new Summa();
        int result;
        result = s.calculate(10,20);
        System.out.println("Сумма: "+result);
        Difference d = new Difference();
        result = d.calculate(40,30);
        System.out.println("Разность: "+result);
        Multiplication m = new Multiplication();
        result = m.calculate(134,56);
        System.out.println("Умножение: "+result);
        Division div = new Division();
        result = div.calculate(64,13);
        System.out.println("Деление: "+result);
    }
}
