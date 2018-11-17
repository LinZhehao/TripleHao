package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.ProductsDao;
import com.dbms.triplehao.entity.Products;
import com.dbms.triplehao.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService
{
    @Autowired
    private ProductsDao productsDao;

    @Override
    public List<Products> getProductList() {
        return productsDao.queryProduct();
    }

    @Override
    public Products getProductById(int productId) {
        return productsDao.queryProductById(productId);
    }

    @Transactional
    @Override
    public boolean addProduct(Products products) {
        if (products.getName() != null && !"".equals(products.getName()) && products.getInventoryAmount() != null && products.getCategory() != null && !"".equals(products.getCategory()))
        {
            try {
                int effectedNum = productsDao.insertProduct(products);
                if (effectedNum>0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Insert failed!");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Insert failed:" + e.getMessage());
            }

        }
        else
        {
            throw new RuntimeException("Insert data can not be null!!");
        }
    }

    @Override
    public boolean modifyProduct(Products products) {
        if (products.getProductID() != null && products.getProductID() > 0)
        {
            try {
                int effectedNum = productsDao.updatedProduct(products);
                if (effectedNum > 0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Update failed");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Update failed" + e.toString());
            }
        }
        else
        {
            throw new RuntimeException("data can not be null");
        }
    }

    @Override
    public boolean deleteProduct(int productId)
    {
        if (productId > 0)
        {
            try {
                int effectedNum = productsDao.deleteProduct(productId);
                if (effectedNum > 0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Delete failed");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Delete failed" + e.toString());
            }
        }
        else
        {
            throw new RuntimeException("productId can not be null!");
        }
    }
}
