import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут? ");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Доброе день, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Доброе вечер, " + name + "!");
        } else {
            System.out.println("Доброе ночи, " + name + "!");

        }
    }
}


