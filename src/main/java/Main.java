import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    public void example() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Your name is " + name);
    }

}
