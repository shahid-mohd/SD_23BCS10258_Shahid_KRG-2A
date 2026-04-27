//  Bad Example (Without SRP)
class BankAccount {
  
    public void deposit(double amount) {
        // deposit logic
    }

    public void withdraw(double amount) {
        // withdraw logic
    }

    public double getBalance() {
        return balance;
    }

    public void sendEmail(String message) {
        // email sending logic 
    }

    public void generateReport() {
        // report generation 
    }

}

//  Good Example (Using SRP)

// Account
class moneyTransaction {
    private double balance;
  
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}

// Notification
class Notification {
  
    public void sendEmail(String message) {
        // notification logic;
    }
  
}

// Report 
class ReportService {
  
    public void generateReport() {
        // Reprt logic
    }
  
}
