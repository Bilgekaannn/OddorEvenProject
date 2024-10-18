import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integar:");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("It is even.");
        }else {
            System.out.println("It is odd.");
        }

        scanner.close();

    }
}