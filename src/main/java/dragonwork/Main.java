package dragonwork;
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Dragon[] dragons = new Dragon[3];

            for (int i = 0; i < dragons.length; i++) {
                System.out.println("Введіть дані для дракона N" + (i + 1));
                System.out.print("Ім’я: ");
                String name = scanner.nextLine();
                System.out.print("Вік: ");
                int age = scanner.nextInt();
                System.out.print("Вага: ");
                double weight = scanner.nextDouble();
                scanner.nextLine();

                dragons[i] = new Dragon(name, age, weight);
            }
            System.out.println("\nІнформація про всіх драконів:");
            for (Dragon dragon : dragons) {
                dragon.printInfo();
            }

            scanner.close();
        }



    }
