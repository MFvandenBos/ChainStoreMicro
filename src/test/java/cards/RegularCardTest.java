package cards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularCardTest {

    @Test
    void payShouldReturnFalse() {
        RegularCard c1 = new RegularCard(011, "Bert de Vries", 200.00);
        boolean result = c1.pay(300);
        assertFalse(result);
    }
}