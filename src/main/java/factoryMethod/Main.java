package factoryMethod;

public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.ANOTHERBANK);
        System.out.println(bank.getBankName());
        bank.credit();
        bank.debit();
    }
}
