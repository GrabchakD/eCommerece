package com.dgrabchak.service;

import com.dgrabchak.dao.ProductDao;
import com.dgrabchak.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Product product) {
        return productDao.getProductById(product);
    }


}
