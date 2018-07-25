package com.dgrabchak.dao;

import com.dgrabchak.model.Cart;
import com.dgrabchak.model.Product;

public interface CartDao {

    Cart getById(Long id);

    Product addProduct();

    Product deleteProduct();
}
