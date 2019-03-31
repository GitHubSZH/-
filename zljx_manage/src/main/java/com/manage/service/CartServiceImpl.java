package com.manage.service;

import com.manage.mapper.CartMapper;
import com.manage.pojo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements  CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> findAll() {
        return cartMapper.selectList(null);
    }
}
