package com.nimap.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nimap.entity.Product;
import com.nimap.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductRepository productRepository;
	
	@Override
	public Page<Product> getAllProducts(Pageable pageable) {
		// TODO Auto-generated method stub
		return productRepository.findAll(pageable);
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		product.setId(id);
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		 productRepository.deleteById(id);
		
	}

}
