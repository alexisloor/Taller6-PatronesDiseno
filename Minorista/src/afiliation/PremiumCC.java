package afiliation;

public class PremiumCC implements CreditCard{
    

    @Override
    public CreditCard Create() {
        PremiumCCC premium = new PremiumCCC();
        return premium;
    }
}