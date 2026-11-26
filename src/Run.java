import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Run {
    private String date;
    private double distanceMiles;
    private int durationMinutes;

    public Run(String date, double distanceMiles, int durationMinutes) {
        if (date == null) {
            throw new IllegalArgumentException("Date must be in yyyy-MM-dd format.");
        }

        try {
            LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Date must be a real date in yyyy-MM-dd format.");
        }

        if (!Double.isFinite(distanceMiles) || distanceMiles <= 0) {
            throw new IllegalArgumentException("Distance must be a positive number of miles.");
        }
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("Duration must be a positive number of minutes.");
        }

        this.date = date;
        this.distanceMiles = distanceMiles;
        this.durationMinutes = durationMinutes;
    }

    public String getDate() {
        return date;
    }

    public double getDistanceMiles() {
        return distanceMiles;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getPaceMinutesPerMile() {
        return durationMinutes / distanceMiles;
    }
}
