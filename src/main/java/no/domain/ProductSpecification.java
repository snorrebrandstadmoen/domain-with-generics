package no.domain;

import no.domain.id.ProductId;

import java.util.Arrays;
import java.util.List;

public class ProductSpecification extends Specification<Product> {
    public final List<ProductId> productIds;

    private ProductSpecification(List<ProductId> productIds) {
        this.productIds = productIds;
    }

    public static ProductSpecification byProductIds(ProductId... productIds) {
        return new ProductSpecification(Arrays.asList(productIds));
    }
}
