package com.dgrabchak.dao;

import com.dgrabchak.model.Cart;
import com.dgrabchak.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Cart getById(Long id) {
        return sessionFactory.getCurrentSession()
                .createQuery("select c from Cart c " +
                        "join fetch c.user u " +
                        "join fetch c.productList p " +
                        "where c.id =: id", Cart.class)
                .setParameter("id", id)
                .uniqueResult();
    }

    @Override
    public Product addProduct() {
        return null;
    }

    @Override
    public Product deleteProduct() {
        return null;
    }
}
