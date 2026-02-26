public class BankAccount{
    private String AccNO;//private variable to store account number
    private double bal;//private variable to store account balance
    private int pin;//private variable to store account PIN
    private int WrongAttempt;//private variable to count wrong PIN attempts
    private boolean locked;//private variable to indicate if account is locked
    public BankAccount(String AccNo,int pin,double initbal){//constructor to initialize account details
        this.AccNO=AccNo;
        this.pin=pin;
        this.bal=initbal;
        this.WrongAttempt=0;
        this.locked=false;
    }
    public void deposit(double amount){//method to deposit money into account
        if(!locked && amount>0){
            bal+=amount;
            System.out.println("Deposit successful. Current balance: " + bal);
    }
    else{
        System.out.println("Deposit failed.");
    }
    }
    public void withdraw(double amount,int enteredPin){
        if(locked){//check if account is locked
            System.out.println("Account is locked.");
            return;
        }
        if(enteredPin!=pin){//check if entered PIN is correct
            WrongAttempt++;
            System.out.println("Incorrect PIN. Attempt " + WrongAttempt);
            if(WrongAttempt>=3){//lock account after 3 wrong attempts
                locked=true;
                System.out.println("Account locked due to multiple incorrect PIN attempts.");
            }
            return;//exit method if PIN is incorrect
        }
        WrongAttempt=0;//reset wrong attempt counter on successful PIN entry
        if(amount>0 && amount<=25000 && amount<=bal){//check if withdrawal amount is valid and within balance
            bal-=amount;
            System.out.println("Withdrawal successful. Current balance: " + bal);
        }else{
            System.out.println("Withdrawal failed");
        }
    }
    public double getBalannce(){//getter method to check account balance
        if(!locked){
            return bal;
        }else{
            System.out.println("Access denied");
            return -1; 
        }
    }
    public boolean isAccountisLocked(){//getter method to check if account is locked
        return locked;
    }
    public static void main(String[] args){
        BankAccount account=new BankAccount("123456789",1234,50000);
        account.deposit(50000);
        account.withdraw(10000,1234);
        account.withdraw(30000,1111);
        account.withdraw(20000,2222);       
        account.withdraw(10000,3333); // This will lock the account
        account.deposit(10000); // This will fail because the account is locked
        System.out.println("Current balance: " + account.getBalannce()); // This will fail because the account is locked
        System.out.println("Is account locked? " + account.isAccountisLocked());
    }
}

