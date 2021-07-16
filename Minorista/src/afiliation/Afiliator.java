package afiliation;

import main.Cliente;

public class afiliation {

    public CreditCard makeAfiliation(Cliente cliente) {
        String bankType = cliente.getBank().getBankType();
        while (clientBank != null) {
            switch (bankType) {
                case "Ahorros":
                    return BasicCCC().Create();
                    break;
                case "Corriente":
                    return PremiumCCC().Create();
                    break;
                case "Inversionista":
                    return VIPCC().Create();
                    break;
                default:
                    break;
        }

    }
}