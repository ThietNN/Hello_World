import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("What's up " + name);
    }
}
