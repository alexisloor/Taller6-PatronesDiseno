package afiliation;

public class BasicCC implements CreditCard {

    
    @Override
    public CreditCard Create() {
        BasicCCC basic = new BasicCCC();
        return basic;
    }
}