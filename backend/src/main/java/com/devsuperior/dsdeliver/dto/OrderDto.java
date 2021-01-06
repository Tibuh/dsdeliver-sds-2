package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class OrderDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Setter
	private Long id;
	@Setter
	private String address;
	@Setter
	private Double latitude;
	@Setter
	private Double longitude;
	@Setter
	private Instant moment;
	@Setter
	private OrderStatus status;
	
	private List<ProductDto> products = new ArrayList<>();

	public OrderDto(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
	}
	
	public OrderDto(Order entity) {
		id = entity.getId();
		address = entity.getAddress();
		latitude = entity.getLatitude();
		longitude = entity.getLongitude();
		moment = entity.getMoment();
		status = entity.getStatus();
		products = entity.getProducts().stream().map(products -> new ProductDto(products)).collect(Collectors.toList());
	}	
	
}
