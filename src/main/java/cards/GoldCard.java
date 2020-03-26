package cards;

public class GoldCard extends Card {
    protected int discount;

    public GoldCard(int iD, String name, double credit) {
        super(iD, name, credit);
        this.discount = 1;
    }

    @Override
    public boolean pay(int amount) {
        if((int)credit > amount ) {
            credit -= (double)amount;
            return true;
        }
        return false;
    }

    public void setDiscount(int discount) throws ArgumentOutOfRangeException{
        if( discount < 1 || discount > 30)
        {
            throw new ArgumentOutOfRangeException();
        }else
        {
            this.discount = discount;
        }
    }

    public int getDiscount() {
        return discount;
    }
}
