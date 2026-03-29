import java.time.LocalDate;

public class Expense {
    private String title;
    private double amount;
    private String category;
    private LocalDate date;

    public Expense(String title, double amount, String category, LocalDate date) {
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String toCSV() {
        return title + "," + amount + "," + category + "," + date;
    }

    public static Expense fromCSV(String line) {
        String[] parts = line.split(",");
        return new Expense(
                parts[0],
                Double.parseDouble(parts[1]),
                parts[2],
                LocalDate.parse(parts[3])
        );
    }

    @Override
    public String toString() {
        return "Title: " + title +
                " | Amount: ₹" + amount +
                " | Category: " + category +
                " | Date: " + date;
    }
}
