package no.service.credit;

import no.domain.credit.CreditCard;
import no.domain.credit.CreditCardId;
import no.service.Repository;

import java.util.ArrayList;
import java.util.List;

public class CreditCardRepository implements Repository<CreditCard, CreditCardId, CreditCardSpecification> {

    @Override
    public CreditCard get(CreditCardId id) {
        return new CreditCard(id);
    }

    @Override
    public List<CreditCard> find(CreditCardSpecification specification) {
        List<CreditCard> result = new ArrayList<CreditCard>();
        for (CreditCardId creditCardId : specification.ids) {
            result.add(new CreditCard(creditCardId));
        }

        return result;
    }

    @Override
    public CreditCard save(CreditCard entity) {
        return entity;
    }

    @Override
    public void delete(CreditCardId id) {
        //
    }

}
