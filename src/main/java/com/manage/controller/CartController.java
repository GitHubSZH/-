package com.manage.controller;

import com.manage.pojo.Cart;
import com.manage.service.CartService;
import com.manage.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("findAll")
    public SysResult findAll(){
        List<Cart> all = cartService.findAll();
        return SysResult.oK(all);
    }
}
