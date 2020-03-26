package cards;

public abstract class Card {

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





}
