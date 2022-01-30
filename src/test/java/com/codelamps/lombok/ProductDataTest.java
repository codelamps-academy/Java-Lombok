package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductDataTest {

    @Test
    void testProductData(){

        ProductData productData = new ProductData("001", "Aqua", 100_000L);

        Assertions.assertEquals("001", productData.getId());
        Assertions.assertEquals("Aqua", productData.getNameProduct());
        Assertions.assertEquals(100000L, productData.getPrice());
        Assertions.assertNull(productData.getDescription());


    }
}
