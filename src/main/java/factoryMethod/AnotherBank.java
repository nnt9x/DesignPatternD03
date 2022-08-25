package factoryMethod;

public class AnotherBank implements Bank{
    @Override
    public String getBankName() {
        return "AnotherBank";
    }

    @Override
    public void debit() {
        System.out.println("AnotherBank debit");
    }

    @Override
    public void credit() {
        System.out.println("AnotherBank credit");
    }
}
