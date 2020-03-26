package cards;

public class RegularCard extends Card{

    public RegularCard(int iD, String name, double credit) {
        super(iD, name, credit);
    }

    public double getCredit() {
        return this.credit;
    }

    public void setCredit(double amount) {
        if (amount < 0) {
            throw new NegativeCreditException();
        } else {
            this.credit = amount;
        }
    }

    @Override
    public boolean pay(int amount) {
        double newCredit = getCredit() - amount;
        setCredit(newCredit);
        return true;
    }
}
