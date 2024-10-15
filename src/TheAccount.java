public class TheAccount {
    String ID;
    String NAME;
    int balance;
    TheAccount(String ID, String NAME, int balance) {
        this.ID = ID;
        this.NAME = NAME;
        this.balance = balance;
        balance = 0;
    }
    String getID(){
        return ID;
    }
    String getNAME(){
        return NAME;
    }
    int getBalance(){
        return balance;
    }

}
