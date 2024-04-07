package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @ResponseBody : 현재 데이터를 return 해주고 있는데 이를 body라는 틀에 담아줘야 하기 때문에 이를 사용한다.
@ResponseBody
public class ProductController {
    // 사용자가 요청을 던지면
    // 그에 맞는 로직을 수행할 수 있도록 서비스에게 시킬 예정.

    @Autowired
    private ProductService productService;

    // 상품 조회
    // @RequestMapping -> 내용에 맞는 요청이 날라오면 아래의 로직이 실행될 것이다라는 의미
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String findProduct() {
//        ProductService productService = new ProductService();
        return productService.findProduct();
    }

    // 상품 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void saveProduct() {
        productService.saveProduct();
    }
}
