package no.service.debit;

import no.domain.debit.DebitCard;
import no.domain.debit.DebitCardId;
import no.service.Repository;

import java.util.ArrayList;
import java.util.List;

public class DebitCardRepository implements Repository<DebitCard, DebitCardId, DebitCardSpecification> {

    @Override
    public DebitCard get(DebitCardId id) {
        return new DebitCard(id);
    }

    @Override
    public List<DebitCard> find(DebitCardSpecification specification) {
        List<DebitCard> result = new ArrayList<DebitCard>();
        for (DebitCardId debitCardId : specification.ids) {
            result.add(new DebitCard(debitCardId));
        }

        return result;
    }

    @Override
    public DebitCard save(DebitCard entity) {
        return entity;
    }

    @Override
    public void delete(DebitCardId id) {
        //
    }

}
