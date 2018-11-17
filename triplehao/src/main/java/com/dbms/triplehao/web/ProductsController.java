package com.dbms.triplehao.web;

import com.dbms.triplehao.entity.Products;
import com.dbms.triplehao.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class ProductsController
{
    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = "/listproduct", method = RequestMethod.GET)
    private Map<String, Object> listProduct()
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Products> list = productsService.getProductList();
        modelMap.put("productList", list);
        return modelMap;
    }

}
