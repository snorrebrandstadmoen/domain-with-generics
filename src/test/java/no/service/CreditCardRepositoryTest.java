package no.service;

import no.domain.credit.CreditCard;
import no.domain.credit.CreditCardId;
import no.service.credit.CreditCardRepository;
import no.service.credit.CreditCardSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CreditCardRepositoryTest {

    @Test
    public void should_return_some_products() {
        CreditCardRepository repository = new CreditCardRepository();
        List<CreditCard> creditCards = repository.find(
                CreditCardSpecification.byIds(new CreditCardId(1), new CreditCardId(2), new CreditCardId(3)));
        Assert.assertEquals(3, creditCards.size());
    }
}
