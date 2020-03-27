package cards;

public abstract class Card{

    protected final int cardId;
    protected String name;
    protected double credit;

    public Card(int iD, String name, double credit)
    {
        this.cardId = iD;
        this.name = name;
        this.credit = credit;
    }

    public abstract boolean pay(int amount) throws ArgumentOutOfRangeException;

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return Math.round(credit*100.0)/100.0;
    }

    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

}
