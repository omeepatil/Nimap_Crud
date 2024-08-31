package com.NimapProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String name;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "category_id")
	    private Category category;

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(Long id, String name, Category category) {
			super();
			this.id = id;
			this.name = name;
			this.category = category;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}
	    
	    
	    
    
}
