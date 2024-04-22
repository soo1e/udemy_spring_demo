package com.example.demo.product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private SpringDataJPAProductRepository springDataJPAProductRepository;
//    private ProductRepository productRepository;
//
//    @Autowired
//    ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    public void makeConnection() {
//        productRepository.makeConnection();
//    }


    public Product findProduct(int id) {
//        return productRepository.findProduct(id);
        return springDataJPAProductRepository.findById(id).get();
    }

    @Transactional
    public void saveProduct(Product product) {
//        productRepository.save(product);
        springDataJPAProductRepository.save(product);
    }

    public List<Product> findProducts() {
//        return productRepository.findProducts();
        return springDataJPAProductRepository.findAll();
    }
}
