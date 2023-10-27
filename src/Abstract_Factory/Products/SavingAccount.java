package Abstract_Factory.Products;

import Abstract_Factory.Account;

public class SavingAccount implements Account {
    @Override
    public String getAccountType() {
        return "SAVING Account";
    }
}
