import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    private static final String FILE_NAME = "expenses.csv";
    private List<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
        loadExpenses();
    }

    private void loadExpenses() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                expenses.add(Expense.fromCSV(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading expenses.");
        }
    }

    private void saveExpenses() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Expense e : expenses) {
                pw.println(e.toCSV());
            }
        } catch (IOException e) {
            System.out.println("Error saving expenses.");
        }
    }

    public void addExpense(String title, double amount, String category, LocalDate date) {
        expenses.add(new Expense(title, amount, category, date));
        saveExpenses();
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public double getTotal() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public List<Expense> getByCategory(String category) {
        List<Expense> list = new ArrayList<>();
        for (Expense e : expenses) {
            if (e.getCategory().equalsIgnoreCase(category)) {
                list.add(e);
            }
        }
        return list;
    }
}