package com.dgrabchak.service;

import com.dgrabchak.dao.CartDao;
import com.dgrabchak.model.Cart;
import com.dgrabchak.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Cart getById(Long id) {
        return cartDao.getById(id);
    }

    @Override
    public Product addProduct() {
        return cartDao.addProduct();
    }

    @Override
    public Product deleteProduct() {
        return cartDao.deleteProduct();
    }
}
