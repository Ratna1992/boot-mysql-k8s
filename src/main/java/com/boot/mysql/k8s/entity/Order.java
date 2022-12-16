package com.boot.mysql.k8s.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Order {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer qty;
	private Double price;
}
