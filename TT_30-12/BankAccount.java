public class BankAccount {
    private int accNo;
    private double balance;

    public BankAccount(int accNo,double balance){
        this.accNo=accNo;
        this.balance=balance;
    }

    private void deposit(double amount){
        this.balance+=amount;
    }

    private void withdrawal(double amount){
        if(this.balance < amount){
            System.out.println("Insufficient Balance");
        }
        else{
            this.balance-=amount;
            System.out.println("Remaining balance : "+this.balance);
        }
    }

    private void display(){
        System.out.println("Account number : "+accNo+"\nBalance : "+balance);
    }
    
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount(369,20000);
        // BankAccount acc2=new BankAccount(654,30000);

        System.out.println("Bank Account 1 : ");
        acc1.display();

        acc1.deposit(5000);
        acc1.withdrawal(10000);
        acc1.withdrawal(20000);

    }
}
