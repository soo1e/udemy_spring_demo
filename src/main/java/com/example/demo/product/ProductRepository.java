package com.example.demo.product;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @Repository
public class ProductRepository {

    @Autowired
    EntityManager entityManager;
//    DataSource dataSource;

    private Map<Integer, Product> db = new HashMap<>();
    // id 증가를 위해
    private int id = 1;

    // dataSource로 터널 뚫어보기 = DB와 커넥션 만들기
//    public void makeConnection() {
//        DataSourceUtils.getConnection(dataSource);
//    }

    public Product findProduct(int idx) {
        return db.get(idx);
    }

    public void save(Product product) {
//        db.put(id++, product);
        System.out.println(product.getName());
        entityManager.persist(product);
    }

    public List<Product> findProducts() {
//        return new ArrayList<>(db.values());
        // map의 value들만 모아서 arrayList로 만들었다
        return entityManager // 엔티티 매니저야
                .createQuery("SELECT p FROM Product p", Product.class) // 이 쿼리 만들어서
                .getResultList(); // 결과 가져다줘
    }
}
