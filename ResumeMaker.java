import java.util.*;
import java.io.*;

public class ResumeMaker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {

            System.out.println("\n===== RESUME MAKER MENU =====");
            System.out.println("1. Create Resume");
            System.out.println("2. View Resume");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();   // clear buffer

            if (ch == 1) {
                createResume();
            }
            else if (ch == 2) {
                viewResume();
            }
            else if (ch == 3) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }

    static void createResume() throws Exception {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Objective: ");
        String objective = sc.nextLine();

        System.out.print("Enter Skills: ");
        String skills = sc.nextLine();

        System.out.print("Enter Education: ");
        String edu = sc.nextLine();

        System.out.print("Enter Experience: ");
        String exp = sc.nextLine();

        String resume =
                "\n===== YOUR RESUME =====\n" +
                "Name: " + name + "\n" +
                "Phone: " + phone + "\n" +
                "Objective: " + objective + "\n" +
                "Skills: " + skills + "\n" +
                "Education: " + edu + "\n" +
                "Experience: " + exp + "\n";

        FileWriter fw = new FileWriter("resume.txt");
        fw.write(resume);
        fw.close();

        System.out.println("✅ Resume saved successfully");
    }

    static void viewResume() throws Exception {

        File f = new File("resume.txt");

        if (!f.exists()) {
            System.out.println("⚠ No resume found. Create first.");
            return;
        }

        Scanner fileReader = new Scanner(f);

        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }

        fileReader.close();
    }
}