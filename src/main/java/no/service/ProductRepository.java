package no.service;

import no.domain.Product;
import no.domain.ProductSpecification;
import no.domain.id.ProductId;
import org.apache.commons.lang.Validate;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product, ProductId, ProductSpecification> {

    @Override
    public Product get(ProductId id) {
        return new Product(id);
    }

    @Override
    public List<Product> find(ProductSpecification specification) {
        List<Product> result = new ArrayList<Product>();
        for (ProductId productId : specification.productIds) {
            result.add(new Product(productId));
        }

        return result;
    }

    @Override
    public Product save(Product entity) {
        return entity;
    }

    @Override
    public void delete(ProductId id) {
        //
    }

}
