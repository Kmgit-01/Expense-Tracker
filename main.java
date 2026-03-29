import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n===== PERSONAL EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total Spending");
            System.out.println("4. Filter by Category");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    LocalDate date = LocalDate.now(); // auto date
                    manager.addExpense(title, amount, category, date);

                    System.out.println("Expense added.");
                    break;

                case 2:
                    List<Expense> list = manager.getAllExpenses();
                    if (list.isEmpty()) {
                        System.out.println("No expenses yet.");
                    } else {
                        System.out.println("\n--- All Expenses ---");
                        for (Expense e : list) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total spending: ₹" + manager.getTotal());
                    break;

                case 4:
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    List<Expense> filtered = manager.getByCategory(cat);

                    if (filtered.isEmpty()) {
                        System.out.println("No expenses found for this category.");
                    } else {
                        System.out.println("\n--- Expense List (" + cat + ") ---");
                        for (Expense e : filtered) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}