package Abstract_Factory;

import Abstract_Factory.Products.CheckingAccount;
import Abstract_Factory.Products.SavingAccount;

public class AccountFactory extends AbstractFactory {

    @Override
    public Account getAccount(String accountType) {
        return switch (accountType) {
            case "Saving" -> new SavingAccount();
            case "Checking" -> new CheckingAccount();
            default -> null;
        };
    }


    @Override
    public Bank getBank(String bank) {
        return null;
    }
}
