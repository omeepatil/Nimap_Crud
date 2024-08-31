package com.NimapProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NimapProject.Model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>{

}
