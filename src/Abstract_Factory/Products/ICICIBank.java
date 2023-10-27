package Abstract_Factory.Products;

import Abstract_Factory.Bank;

public class ICICIBank implements Bank {
    @Override
    public String getBankName() {
        return "ICICIBank";
    }
}
