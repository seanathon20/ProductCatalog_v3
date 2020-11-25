package com.example.productcatalog_v3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {

    @Test
    public void checkProductName(){
        Product testProduct = new Product("1", "Shorts", 20);
        assertEquals("Check Product Name", "Shorts", testProduct.getProductName());
    }
    @Test
    public void checkProductId(){
        Product testProduct = new Product("1", "Shorts", 20);
        assertEquals("Check Product ID", "1", testProduct.getId());
    }
    @Test
    public void checkProductPrice(){
        Product testProduct = new Product("1", "Shorts", 20);
        assertEquals("Check Product Price",20, testProduct.getPrice(),0);
    }
}
