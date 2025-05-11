package com.nimap.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.entity.Category;
import com.nimap.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {


	    @Autowired
	    private CategoryService categoryService;

	    @GetMapping
	    public Page<Category> getAll(@RequestParam(defaultValue = "0") int page) {
	        return categoryService.getAllCategories(PageRequest.of(page, 5));
	    }

	    @PostMapping
	    public Category create(@RequestBody Category category) {
	        return categoryService.createCategory(category);
	    }

	    @GetMapping("/{id}")
	    public Optional<Category> getById(@PathVariable Long id) {
	        return categoryService.getCategoryById(id);
	    }

	    @PutMapping("/{id}")
	    public Category update(@PathVariable Long id, @RequestBody Category category) {
	        return categoryService.updateCategory(id, category);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        categoryService.deleteCategory(id);
	    }
	    
	}

