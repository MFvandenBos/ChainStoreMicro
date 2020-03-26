package cards;

import static jdk.nashorn.internal.objects.NativeMath.round;

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

    public abstract boolean pay(int amount);

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return round(credit,2);
    }

    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

}
