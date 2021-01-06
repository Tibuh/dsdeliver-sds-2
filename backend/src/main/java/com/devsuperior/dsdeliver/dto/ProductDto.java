package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import com.devsuperior.dsdeliver.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProductDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;
	
	public ProductDto(Product entity) {
		super();
		id = entity.getId();
		name = entity.getName();;
		price = entity.getPrice();;
		description = entity.getDescription();;
		imageUri = entity.getImageUri();
	}
	
}
