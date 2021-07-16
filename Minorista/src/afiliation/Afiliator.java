package afiliation;

import main.Cliente;

public class afiliation {

    public CreditCard makeAfiliation(Cliente cliente) {
        String bankType = cliente.getBank().getBankType();
        while (clientBank != null) {
            switch (bankType) {
                case "Ahorros":
                    return new BasicCCC();
                    break;
                case "Corriente":
                    return new PremiumCCC();
                    break;
                case "Inversionista":
                    return new VIPCC();
                    break;
                default:
                    break;
        }

    }
}