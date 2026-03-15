import java.util.Scanner;

public class ResumeMaker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Phone:");
        String phone = sc.nextLine();

        System.out.println("Enter Skills:");
        String skills = sc.nextLine();

        System.out.println("Enter Education:");
        String edu = sc.nextLine();

        System.out.println("\n===== YOUR RESUME =====");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Skills: " + skills);
        System.out.println("Education: " + edu);
    }
}