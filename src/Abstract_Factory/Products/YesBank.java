package Abstract_Factory.Products;


import Abstract_Factory.Bank;

public class YesBank implements Bank {
    @Override
    public String getBankName() {
        return "YesBank";
    }
}
