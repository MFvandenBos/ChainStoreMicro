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
            throw new NegativeCreditException("Cannot have negative balance on Regular Card.");
        } else {
            this.credit = amount;
        }
    }

    @Override
    public boolean pay(int amount) {
        try{
            double newCredit = getCredit() - amount;
            setCredit(newCredit);
            return true;
        } catch (NegativeCreditException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
