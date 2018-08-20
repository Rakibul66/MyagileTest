
package account;

public class Account {
Float Balance;
public Float getBalnce()
{
    return Balance;
}
    public Account ()
    {
        Balance=0.0f;
    }
    public void Deposit(Float amount){
        Balance+=amount;
    }
    public void Withdraw(Float amount){
        Balance-=amount;
    }

 
}