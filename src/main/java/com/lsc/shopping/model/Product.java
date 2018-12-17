package com.lsc.shopping.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable {

	private static final long serialVersionUID = 5036816701847914163L;
	
	@Id
	private Long id;
	private String name;
	private Double value;

	public Product() {}
	
	public Product(Long id, String name, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
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
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product other = (Product) obj;
			return Objects.equals(id, other.id);
		}
		return false;
	}
	
}
