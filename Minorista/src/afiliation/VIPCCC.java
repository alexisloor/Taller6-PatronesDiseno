package afiliation;

public class VIPCCC extends CreditCardCreator {

    this.CreditLimit = 3000;
    this.Cost = 12.99;

    @Override
    public abstract Create() {
        return new VIPCC();
    }
     
}