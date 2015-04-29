package no.domain.credit;

import no.domain.id.Id;

public class CreditCardId extends Id<Integer> {

        public CreditCardId(Integer id) {
            super(id);
        }

        @Override
        protected boolean validateId(Integer id) {
            return id != null && id > 0;
        }
    }