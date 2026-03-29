# 🪙 JMET: Java Minimalist Expense Tracker

[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)](https://github.com/your-username/ExpenseTracker)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-11%2B-blue)](https://www.oracle.com/java/)

A high-efficiency, dependency-free command-line interface (CLI) designed for local financial logging. Built using the **Java Standard Library**, JMET prioritizes speed and data sovereignty over bloated graphical interfaces.

---

## 💡 The Philosophy

Modern finance apps are often cluttered with ads and forced cloud syncing. **JMET** is designed for the developer who prefers the terminal—offering a friction-free way to log transactions, audit spending, and maintain local data control without the overhead of external libraries like Jansi.

### Core Capabilities
* **Transaction Serialization:** Capture amounts, categories, and timestamps in a structured format.
* **Flat-file Persistence:** Data is stored in a human-readable `.txt` buffer; no database setup required.
* **Categorical Filtering:** Isolate spending patterns (e.g., "Utilities" or "Leisure") via targeted queries.
* **Aggregated Analytics:** Generate instant totals to monitor your burn rate.
* **Zero-Dependency Build:** Runs on any system with a JDK.

---

## 🏗️ System Architecture

The project utilizes a modular, Object-Oriented design to ensure maintainability and easy logic extension.

| Component | Responsibility |
| :--- | :--- |
| `Expense.java` | Data model for individual financial transactions. |
| `ExpenseManager.java` | Core logic for filtering, sorting, and summation. |
| `FileHandler.java` | Encapsulated I/O operations for local storage. |
| `Main.java` | Application entry point and CLI menu controller. |

---

## 🚀 Technical Implementation

### Prerequisites
* **Java Development Kit (JDK)** 11 or higher recommended.
* A terminal or command prompt environment.

### Installation & Compilation
1. **Initialize the Repository**
   ```bash
   git clone [https://github.com/your-username/ExpenseTracker.git](https://github.com/your-username/ExpenseTracker.git)
   cd ExpenseTracker

   Compile Source Code

Bash
javac src/*.java -d bin
Launch Application

Bash
java -cp bin Main
🖥️ Operational Workflow
Upon execution, the system initializes the local buffer and presents the primary control module:
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
                Value: 125.75
                Category: Travel
                Date (YYYY-MM-DD): 2026-03-29

Result: Entry serialized successfully.
🛠️ Roadmap for Evolution
[ ] Temporal Constraints: Implement monthly or weekly budget thresholds.

[ ] Data Portability: Add logic to export records to .csv for Excel/Sheets integration.

[ ] Visual Feedback: Integrate basic ASCII-based bar charts for spending trends.

[ ] Regex Validation: Strengthen input parsing for dates and currency formats.

🤝 Contribution Guidelines
This is an open-source utility. If you wish to optimize the sorting algorithms or enhance the file-handling logic:
Fork the repository.
