package afiliation;

public class BasicCCC extends CreditCardCreator {
    this.CreditLimit = 500;
    this.Cost = 4.99;
    @Override
    public abstract Create() {
        return new BasicCC();
    }
     
}