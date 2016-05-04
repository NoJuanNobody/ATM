package ATM;


import java.util.UUID;
/**
 * Created by alejandrolondono on 5/3/16.
 */
public class Account {


    private Type accountType= Type.SAVINGS;
    private static final UUID id = UUID.randomUUID();
    private double balance=0;
    private OverDraft overDraftSetting = OverDraft.OFF;
    private Status status = Status.OPEN;


    /*
    METHODS BELOW
     */

    public Account(Type type, int initialBalance, OverDraft setting){
        this.accountType = type;
        this.balance = initialBalance;
        this.overDraftSetting = setting;
    }

    public Account(Type type, int initialBalance){
        this.accountType = type;
        this.balance = initialBalance;
    }

    public Account(Type type, OverDraft setting){
        this.accountType = type;
        this.overDraftSetting = setting;
    }

    public Account(){
        this.accountType = Type.SAVINGS;
    }

    public Type getAccountType(){
        return this.accountType;
    }

    private  void setAccountType(Type type){
        this.accountType = type;
    }

    public UUID getAccountID(Type type){
        return this.id;
    }

    public boolean willAccountOverDraft(double amount){
        return amount > this.getAccountBalance();
    }

    public void setAccountBalance(double amount){
        this.balance = amount;
    }

    public double getAccountBalance(){
        return this.balance;
    }

    public Status getStatus(){
        return this.status;
    }

    public void switchStatus(){
        int i = this.status.ordinal();
        i++;
        this.status = Status.values()[i];
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public void OFAC(){
        this.setStatus(Status.FREEZE);
    }

}
