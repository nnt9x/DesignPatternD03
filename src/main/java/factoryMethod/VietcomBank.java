package factoryMethod;

public class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "VietcomBank";
    }

    @Override
    public void debit() {
        System.out.println("Debit VietcomBank");
    }

    @Override
    public void credit() {
        System.out.println("Credit VietcomBank");
    }
}
