package com.dgrabchak.service;

import com.dgrabchak.dao.CategoryDao;
import com.dgrabchak.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAll() {
        return categoryDao.gatAll();
    }

    @Override
    public Category getById(Long id) {
        return categoryDao.getById(id);
    }
}
