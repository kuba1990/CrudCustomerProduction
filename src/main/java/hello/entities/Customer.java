package hello.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer{
	private Long id;
	private String name;
	private Set<Product> product;

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

	public void setProduct(Set<Product> products) {
		this.product = products;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_products",
			joinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
	public Set<Product> getProduct() {
		return product;
	}
}