package com.example.cassandra.controller;

import com.example.cassandra.entity.ShoppingCart;
import com.example.cassandra.repository.ShoppingCartRepository;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopping_cart")
public class ShoppingCartController {
    @Resource
    private ShoppingCartRepository repository;

    @GetMapping
    public ResponseEntity<List<ShoppingCart>> list() {
        return ResponseEntity.ok(repository.findAll());
    }
}
