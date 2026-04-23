import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set alarm time (HH:mm): ");
        String alarmInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime alarmTime = LocalTime.parse(alarmInput, formatter);

        System.out.println("Alarm set for " + alarmTime);
        System.out.println("Waiting...");

        while (true) {
            LocalTime now = LocalTime.now().withSecond(0).withNano(0);

            if (now.equals(alarmTime)) {
                System.out.println("⏰ ALARM! Wake up!");
                break;
            }

            Thread.sleep(1000); // check every second
        }

        scanner.close();
    }
}
