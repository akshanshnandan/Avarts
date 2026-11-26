public class RunTest {
    private static int checks = 0;

    private static void check(boolean condition, String message) {
        checks++;
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void checkRejected(String date, double miles, int minutes) {
        checks++;
        try {
            new Run(date, miles, minutes);
            throw new AssertionError("Invalid run was accepted.");
        } catch (IllegalArgumentException expected) {
            // The constructor correctly rejected this input.
        }
    }

    public static void main(String[] args) {
        Run run = new Run("2026-11-26", 3.0, 30);
        check(run.getDate().equals("2026-11-26"), "Date getter failed.");
        check(run.getDistanceMiles() == 3.0, "Distance getter failed.");
        check(run.getDurationMinutes() == 30, "Duration getter failed.");
        check(run.getPaceMinutesPerMile() == 10.0, "Whole-number pace failed.");

        Run shorterRun = new Run("2026-11-27", 2.0, 25);
        check(shorterRun.getPaceMinutesPerMile() == 12.5, "Fractional pace failed.");

        checkRejected("2026-11-26", 0.0, 25);
        checkRejected("2026-11-26", -1.0, 25);
        checkRejected("2026-11-26", Double.NaN, 25);
        checkRejected("2026-11-26", 2.0, 0);
        checkRejected("2026-11-26", 2.0, -5);
        checkRejected(null, 2.0, 25);
        checkRejected("", 2.0, 25);
        checkRejected("2026-02-30", 2.0, 25);

        System.out.println("Passed " + checks + " checks.");
    }
}
