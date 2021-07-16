package afiliation;

public class CreditCardCreator implements CreditCard {
    
    protected int CreditLimit; // The Credit Limit is in USD
    protected float Cost; // The Cost is per year

    public abstract Create(int CreditLimit, float Cost) {
        this.CreditLimit = CreditLimit;
        this.Cost = Cost;
        return this;
    }
     
}
