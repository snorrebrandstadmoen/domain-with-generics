package no.service.debit;

import no.domain.Specification;
import no.domain.debit.DebitCardId;

import java.util.Arrays;
import java.util.List;

public class DebitCardSpecification extends Specification<DebitCardId> {

    protected DebitCardSpecification(List<DebitCardId> ids) {
        super(ids);
    }

    public static DebitCardSpecification byIds(DebitCardId... ids) {
        return new DebitCardSpecification(Arrays.asList(ids));
    }
}
