package com.NimapProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NimapProject.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
