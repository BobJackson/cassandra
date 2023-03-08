package com.example.cassandra.repository;

import com.example.cassandra.entity.ShoppingCart;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ShoppingCartRepository extends CassandraRepository<ShoppingCart,String> {
}
