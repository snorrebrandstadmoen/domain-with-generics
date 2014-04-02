package no.service;

import no.domain.Product;
import no.domain.ProductSpecification;
import no.domain.id.ProductId;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProductRepositoryTest {

    @Test
    public void should_return_some_products() {
        ProductRepository repository = new ProductRepository();
        List<Product> products = repository.find(ProductSpecification.byProductIds(new ProductId(1), new ProductId(2), new ProductId(3)));
        Assert.assertEquals(3, products.size());
    }
}
