public class Accounts {
    private double balance;

    public Accounts(double balance){
        this.balance = balance;
    }
    @Override
    public String toString(){
        return "Accounts [Balance=" + balance + "]";
    }
    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    public double withdraw(double amount) throws BalanceException{
        if(amount<= balance)
            balance -= amount;
        else
            throw new BalanceException("Insufficent balance");
            return balance;
        }


    public static void main(String[] args) throws BalanceException {
        Accounts a1 = new Accounts(100);
//        System.out.println(a1);
//        System.out.println(a1.deposit(500));
//        System.out.println(a1.withdraw((100)));

        try{
            a1.withdraw(500);
        } catch (BalanceException e){
            System.out.println(e.getMessage());
        }
    }

}





//
//Checked Exception vs Unchecked Exception
//Checked Exception     	                                            Unchecked Exception
//Compile time par check hoti hai	                                        Runtime par check hoti hai
//Compiler handle karne ko force karta hai	                                  Compiler handle karne ko force nahi karta
//Exception class ko extend karti hain (except RuntimeException)              RuntimeException class ko extend karti hain
// Handle karna ya throws lagana mandatory hai	                               Handle karna optional hai
//Recoverable errors	                                                     Programming mistakes / logic errors