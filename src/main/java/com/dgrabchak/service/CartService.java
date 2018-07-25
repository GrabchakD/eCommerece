package com.dgrabchak.service;

import com.dgrabchak.model.Cart;
import com.dgrabchak.model.Product;

public interface CartService {

    Cart getById(Long id);

    Product addProduct();

    Product deleteProduct();
}
