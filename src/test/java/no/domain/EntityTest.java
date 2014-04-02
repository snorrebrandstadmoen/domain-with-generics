package no.domain;

import no.domain.id.ProductId;
import org.junit.Assert;
import org.junit.Test;

public class EntityTest {

    @Test
    public void testEquals() {
        Assert.assertEquals(new Product(new ProductId(123)), new Product(new ProductId(123)));
    }

    @Test
    public void testNotEquals() {
        Assert.assertNotSame(new Product(new ProductId(123)), new Product(new ProductId(456)));
    }

}
