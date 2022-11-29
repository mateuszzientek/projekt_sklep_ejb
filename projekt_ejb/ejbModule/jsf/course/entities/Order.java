package jsf.course.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_order")
	private int idOrder;

	@Column(name="calkowita_cena")
	private BigDecimal calkowitaCena;

	@Column(name="calkowita_ilosc")
	private int calkowitaIlosc;

	@Temporal(TemporalType.DATE)
	private Date data;

	//bi-directional many-to-one association to Status
	@ManyToOne
	private Status status;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	//bi-directional many-to-many association to Product
	@ManyToMany(mappedBy="orders")
	private List<Product> products;

	public Order() {
	}

	public int getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public BigDecimal getCalkowitaCena() {
		return this.calkowitaCena;
	}

	public void setCalkowitaCena(BigDecimal calkowitaCena) {
		this.calkowitaCena = calkowitaCena;
	}

	public int getCalkowitaIlosc() {
		return this.calkowitaIlosc;
	}

	public void setCalkowitaIlosc(int calkowitaIlosc) {
		this.calkowitaIlosc = calkowitaIlosc;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}