package hello.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
	private Long id;
	private String name;
	private Set<Customer> customer;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@ManyToMany(mappedBy = "product")
	@JsonIgnore
	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customers) {
		this.customer = customers;
	}

}