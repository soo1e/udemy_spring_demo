package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private Map<Integer, String> db = new HashMap<>();
    // id 증가를 위해
    private int id = 1;

    public String findProduct() {
        return db.get(1);
    }

    public void save() {
        db.put(id++, "Notebook");
    }

}
