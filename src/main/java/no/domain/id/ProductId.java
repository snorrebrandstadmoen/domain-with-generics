package no.domain.id;

import no.domain.id.Id;

public class ProductId extends Id<Integer> {

        public ProductId(Integer id) {
            super(id);
        }

        @Override
        protected boolean validateId(Integer id) {
            return id != null && id > 0;
        }
    }