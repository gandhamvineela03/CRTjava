class Bankassignment 
{
    double amount;
    // Parameterized constructor
    Bankassignment(double amount)
    {
        this.amount = amount;
    }
    // Withdraw method using ternary operator
    void withdraw(double withdrawalAmount)
    {
        String message = (withdrawalAmount<= amount)?"Withdrawal successful": "Insufficient balance";
        System.out.println(message);
        if (withdrawalAmount <= amount) 
        {
            amount = amount - withdrawalAmount;
        }
    }
    // Deposit method
    void deposit(double depositAmount) {
        amount = amount + depositAmount;
    }
    // Display total balance
    void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
    public static void main(String[] args) {
        // Initialize amount with 10000
        Bankassignment b = new Bankassignment(10000);
        // Withdraw amount
        b.withdraw(3000);
        // Deposit 5000
        b.deposit(5000);
        // Display final balance
        b.displayBalance();
    }
}
