package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Products;

import java.util.List;

public interface ProductsDao {

    List<Products> queryProduct();

    Products queryProductById(int productId);

    int insertProduct(Products product);

    int updatedProduct(Products product);

    int deleteProduct(int productId);

}
