package no.domain;

import no.domain.id.ProductId;

public class Product extends Entity<ProductId> {
    public Product(ProductId id) {
        super(id);
    }

}
