#🪙 JMET: Java Minimalist Expense Tracker
A streamlined, dependency-free command-line interface (CLI) designed for efficient financial logging. Built purely with the Java Standard Library, this tool prioritizes speed and local data sovereignty over bloated graphical interfaces.

💡 The Philosophy
Spreadsheets are powerful but cumbersome; mobile apps are convenient but often compromise privacy. JMET fills the gap for users who want a high-friction-free method to log transactions directly from their development environment.

Core Capabilities
Transaction Logging: Capture amount, category, and timestamps instantaneously.

Flat-file Persistence: Data is stored in a human-readable .txt format—no database setup required.

Categorical Filtering: Isolate spending patterns (e.g., "Food" or "Utilities") with simple queries.

Aggregated Analytics: Generate instant totals to monitor your burn rate.

Zero Dependencies: Runs on any system with a JDK; no Maven, Gradle, or Jansi necessary.

🏗️ System Architecture
The project follows a modular Object-Oriented approach to ensure the code is maintainable and easy to extend.

Plaintext
ExpenseTracker/
└── src/
    ├── Expense.java        # Data model for individual transactions
    ├── ExpenseManager.java # Logic for filtering and calculations
    ├── FileHandler.java    # I/O operations for data persistence
    └── Main.java           # Application entry point & CLI Menu
🚀 Technical Implementation
Prerequisites
Java Development Kit (JDK) 8 or higher

A terminal/command prompt

Installation & Execution
Initialize the Repository

Bash
git clone https://github.com/your-username/ExpenseTracker.git
cd ExpenseTracker
Bytecode Compilation

Bash
javac src/*.java -d bin
Launch Application

Bash
java -cp bin Main
🖥️ Operational Workflow
Upon execution, the system initializes the expenses.txt buffer and presents the primary control module:

Plaintext
______________________________________
   EXPENSE TRACKER CONTROL PANEL
______________________________________
1. Register New Transaction
2. Audit All Records
3. Query by Category
4. Generate Financial Summary
5. Terminate Session
______________________________________
Selection > 1

[Input Details]
Value: 45.50
Category: Groceries
Date (YYYY-MM-DD): 2026-03-29

Result: Entry serialized successfully.
🛠️ Roadmap for Evolution
[ ] Temporal Constraints: Implement monthly or weekly budget thresholds.

[ ] Data Portability: Add logic to export records to .csv for Excel/Sheets integration.

[ ] Visual Feedback: Integrate basic ASCII-based bar charts for spending trends.

[ ] Input Validation: Strengthen Regex patterns for date and currency parsing.

🤝 Contribution Guidelines
This project is an open-source utility. If you wish to optimize the sorting algorithms or enhance the file-handling logic:

Fork the repository.

Create a feature branch (git checkout -b feature/Optimization).

Commit your changes.

Open a Pull Request for review.
