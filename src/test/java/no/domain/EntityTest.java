package no.domain;

import no.domain.credit.CreditCard;
import no.domain.credit.CreditCardId;
import org.junit.Assert;
import org.junit.Test;

public class EntityTest {

    @Test
    public void testEquals() {
        Assert.assertEquals(new CreditCard(new CreditCardId(123)), new CreditCard(new CreditCardId(123)));
    }

    @Test
    public void testNotEquals() {
        Assert.assertNotSame(new CreditCard(new CreditCardId(123)), new CreditCard(new CreditCardId(456)));
    }

}
