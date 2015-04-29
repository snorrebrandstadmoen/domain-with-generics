package no.domain.debit;

import no.domain.id.CompositeId;
import no.domain.id.Id;

public class DebitCardId extends Id<CompositeId<Integer, Integer>> {

    protected DebitCardId(CompositeId<Integer, Integer> id) {
        super(id);
    }

    @Override
    protected boolean validateId(CompositeId<Integer, Integer> id) {
        return id.id1 != null && id.id2 != null;
    }
}
