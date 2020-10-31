package StudentsSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        String command = scanner.nextLine();
        while (!command.equals("Exit")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Create":
                    studentSystem.Create(new Student(tokens[1],
                            Integer.parseInt(tokens[2]),
                            Double.parseDouble(tokens[3])));
                    break;
                case "Show":
                    System.out.println(studentSystem.Show(tokens[1]));
                    break;
            }
            command = scanner.nextLine();
        }
    }
}