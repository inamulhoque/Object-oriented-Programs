public class Account implements IAccount{
    @Override
    public void debit() {
        int withdraw = (int) Math.floor(Math.random()*(5000-1)+1);
        System.out.println("Withdraw amount: "+withdraw);
        int balance = 5000;
        while(withdraw<balance) {
            balance = balance - withdraw;
            System.out.println("Balance : "+balance);
            withdraw++;
        }
        if (withdraw>balance)
            System.out.println("Withdraw limit exceed bank balance.");
    }
}
