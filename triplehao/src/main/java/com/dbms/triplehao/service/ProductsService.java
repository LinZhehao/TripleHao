package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.Products;

import java.util.List;

public interface ProductsService
{
    List<Products> getProductList();

    Products getProductById(int productId);

    boolean addProduct(Products products);

    boolean modifyProduct(Products products);

    boolean deleteProduct(int productId);


}
