package com.fullstack.springbootmysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.fullstack.springbootmysql.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
