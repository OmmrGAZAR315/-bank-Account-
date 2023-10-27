package Abstract_Factory.Products;

import Abstract_Factory.Account;

public class CheckingAccount implements Account {

    @Override
    public String getAccountType() {
        return "CHECKING Account";
    }
}
