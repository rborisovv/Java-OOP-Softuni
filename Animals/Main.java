package Animals;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String command = scanner.nextLine();
        while (!command.equals("Beast!")) {
            String[] tokens = scanner.nextLine().split("\\s+");
            //Tom 12 Male
            try {
                if (!command.equals("Cat") && !command.equals("Dog") && !command.equals("Frog")
                        && !command.equals("Kitten") && !command.equals("Tomcat")) {
                    throw new IllegalArgumentException("Invalid input!");
                }
                if (Integer.parseInt(tokens[1]) < 0) {
                    throw new IllegalArgumentException("Invalid input!");
                }
                if (!tokens[2].equals("Male") && !tokens[2].equals("Female")) {
                    throw new IllegalArgumentException("Invalid input!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input!");
                scanner.nextLine();
                continue;
            }
            switch (command) {
                case "Cat":
                    Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    System.out.println(cat.toString());
                    break;
                case "Dog":
                    Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    System.out.println(dog.toString());
                    break;
                case "Frog":
                    Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    System.out.println(frog.toString());
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]));
                    System.out.println(kitten.toString());
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                    System.out.println(tomcat.toString());
                    break;
            }
            command = scanner.nextLine();
        }
    }
}