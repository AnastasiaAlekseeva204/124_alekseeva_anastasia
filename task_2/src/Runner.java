import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите свое фамилию и им€");
        String name = scanner.nextLine();
        Task_2 task = new Task_2();
        Task_2_Tests.test(task, name);
    }
}
