package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {
    private Map<Integer, Product> db = new HashMap<>();
    // id 증가를 위해
    private int id = 1;

    public Product findProduct(int idx) {
        return db.get(idx);
    }

    public void save(Product product) {
        db.put(id++, product);
        System.out.println(product.getName());
    }

    public List<Product> findProducts() {
        return new ArrayList<>(db.values());
        // map의 value들만 모아서 arrayList로 만들었다
    }
}
