package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @ResponseBody : 현재 데이터를 return 해주고 있는데 이를 body라는 틀에 담아줘야 하기 때문에 이를 사용한다.
@RestController
public class ProductController {
    // 사용자가 요청을 던지면
    // 그에 맞는 로직을 수행할 수 있도록 서비스에게 시킬 예정.

    @Autowired
    private ProductService productService;

    // 전체 상품 조회
    @GetMapping("/products")
    public List<Product> findProducts() {
        return productService.findProducts(); // JSON Array
    }

    // 개별 상품 조회
    // @RequestMapping -> 내용에 맞는 요청이 날라오면 아래의 로직이 실행될 것이다라는 의미
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable("id") int id) {
//        ProductService productService = new ProductService();
        System.out.println(id);
        return productService.findProduct(id);
    }

    // 상품 등록
    @PostMapping("/products")
    public void saveProduct(@RequestBody Product product) {
        // @RequestParam
        // localhost:8080/products?name=___를 productName에 담아줌
        // name을 긁어다가 알아서 string으로 넣어줌!

        // @RequestBody
        // 객체를 받아서 객체로 돌려줌
        System.out.println("POST");
        productService.saveProduct(product);
    }
}
