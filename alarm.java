public class alarm {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java alarm <HH:mm>");
            System.exit(1);
        }

        String alarmTime = args[0];
        System.out.println("Alarm set for: " + alarmTime);
    }
}
