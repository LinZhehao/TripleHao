package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Products;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.geom.Area;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsDaoTest {
    @Autowired
    private ProductsDao productsDao;

    @Test
    @Ignore
    public void queryProduct() {
        List<Products> productsList=productsDao.queryProduct();
        assertEquals(82,productsList.size());
    }

    @Test
    @Ignore
    public void queryProductById() {
        Products products=productsDao.queryProductById(1);
        assertEquals("iMac Computer",products.getName());
    }

    @Test
    @Ignore
    public void insertProduct() {
        Products products = new Products();
        products.setName("iPod Classic");
        products.setPrice(399.99);
        products.setInventoryAmount(1);
        products.setCategory("Accessories");
        int effectedNum = productsDao.insertProduct(products);
        assertEquals(1,effectedNum);

    }

    @Test
    @Ignore
    public void updatedProduct() {
        Products products = new Products();
        products.setName("MacBook in-case bag");
        products.setPrice(79.99);
        products.setInventoryAmount(12);
        products.setCategory("Accessories");
        products.setProductID(82);
        int effectedNum = productsDao.updatedProduct(products);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteProduct() {
        int effectedNum = productsDao.deleteProduct(83);
        assertEquals(1,effectedNum);
    }
}