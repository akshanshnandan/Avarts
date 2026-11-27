import java.util.ArrayList;
import java.util.Scanner;

public class RunLog {
    public static void main(String[] args) {
        ArrayList<Run> runs = new ArrayList<Run>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Log a run");
            System.out.println("2. View running history");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextLine()) {
                break;
            }
            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                System.out.print("Date (yyyy-MM-dd): ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String date = scanner.nextLine().trim();

                System.out.print("Distance (miles): ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String milesText = scanner.nextLine().trim();

                System.out.print("Duration (minutes): ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String minutesText = scanner.nextLine().trim();

                try {
                    double miles = Double.parseDouble(milesText);
                    int minutes = Integer.parseInt(minutesText);
                    Run run = new Run(date, miles, minutes);
                    runs.add(run);
                    System.out.println("Run logged.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid run: " + e.getMessage());
                }
            } else if (choice.equals("2")) {
                if (runs.isEmpty()) {
                    System.out.println("No runs logged yet.");
                } else {
                    for (int i = 0; i < runs.size(); i++) {
                        Run run = runs.get(i);
                        System.out.printf("%d. %s - %.2f miles, %d minutes, %.2f min/mile%n",
                                i + 1, run.getDate(), run.getDistanceMiles(),
                                run.getDurationMinutes(), run.getPaceMinutesPerMile());
                    }
                }
            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("Invalid option. Choose 1, 2, or 3.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
