package no.service.credit;

import no.domain.Specification;
import no.domain.credit.CreditCardId;

import java.util.Arrays;
import java.util.List;

public class CreditCardSpecification extends Specification<CreditCardId> {

    private CreditCardSpecification(List<CreditCardId> ids) {
        super(ids);
    }

    public static CreditCardSpecification byIds(CreditCardId... ids) {
        return new CreditCardSpecification(Arrays.asList(ids));
    }
}


