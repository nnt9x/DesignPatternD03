package factoryMethod;

public class BankFactory {
    private BankFactory() {
    }

    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();

            case VIETCOMBANK:
                return new VietcomBank();
            case ANOTHERBANK:
                return new AnotherBank();
        }
        return null;
    }
}
