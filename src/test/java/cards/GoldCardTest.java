package cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class GoldCardTest {

    GoldCard target;

    @BeforeEach
    void setup()
    {
        target = new GoldCard(00001, "TestPerson", 132.15 );
    }

    @Test
    void pay_10() throws ArgumentOutOfRangeException {
        target.pay(10);
        assertThat(target.getCredit()).isEqualTo(122.15);
    }

    @Test
    void pay_200() throws ArgumentOutOfRangeException {
        target.pay(200);
        assertThat(target.getCredit()).isEqualTo(132.15-200);
    }

    @Test
    void payNegative() {
            ArgumentOutOfRangeException e = Assertions.assertThrows(ArgumentOutOfRangeException.class, () -> target.pay(-2));
    }

    @Test
    void setDiscount() {
    }
}