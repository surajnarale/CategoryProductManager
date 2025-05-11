package com.nimap.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.nimap.entity.Category;

public interface CategoryService {

	    Page<Category> getAllCategories(Pageable pageable);
	    Category createCategory(Category category);
	    Optional<Category> getCategoryById(Long id);
	    Category updateCategory(Long id, Category category);
	    void deleteCategory(Long id);

}
