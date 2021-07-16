package afiliation;

public class PremiumCCC extends CreditCardCreator {

    this.CreditLimit = 1500;
    this.Cost = 7.99;
    
    @Override
    public abstract Create() {
        return new PremiumCC();
    }
     
}