package helloworld;

public class arrayhomework {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21};

        System.out.println("Парні числа масиву:");

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }
}
