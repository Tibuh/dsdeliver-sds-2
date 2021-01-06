package com.devsuperior.dsdeliver.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "tb_order")
@Getter
@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(of = {"id"})
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	//Notacao necessaria para criar a tabela que une os pedidos e produtos
	@ManyToMany
	@JoinTable(name = "tb_order_product", 
		joinColumns = @JoinColumn(name = "order_id"), 
		inverseJoinColumns = @JoinColumn(name = "product_id"))
	private  Set<Product> products = new HashSet<>();
	
}
