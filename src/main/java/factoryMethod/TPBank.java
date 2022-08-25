package factoryMethod;

public class TPBank implements Bank{
    @Override
    public String getBankName() {
        return "TPBank";
    }

    @Override
    public void debit() {
        System.out.println("Debit TPBank");
    }

    @Override
    public void credit() {
        System.out.println("Credit TPBank");
    }
}
