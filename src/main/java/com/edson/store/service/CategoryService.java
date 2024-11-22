package com.edson.store.service;

import com.edson.store.entities.Category;
import com.edson.store.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        return categoryOptional.get();
    }
}
