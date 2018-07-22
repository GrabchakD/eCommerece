package com.dgrabchak.dao;

import com.dgrabchak.model.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> gatAll();

    Category getById(Long id);
}
