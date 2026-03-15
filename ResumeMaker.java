import java.util.*;
import java.io.*;

public class ResumeMaker {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== RESUME MAKER =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Objective: ");
        String objective = sc.nextLine();

        System.out.print("Enter Skills (comma separated): ");
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

        System.out.println(resume);

        FileWriter fw = new FileWriter("resume.txt");
        fw.write(resume);
        fw.close();

        System.out.println("✅ Resume saved to file resume.txt");
    }
}