package com.dgrabchak.service;

import com.dgrabchak.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category getById(Long id);
}
