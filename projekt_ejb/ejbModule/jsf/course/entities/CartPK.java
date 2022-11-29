package jsf.course.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cart database table.
 * 
 */
@Embeddable
public class CartPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id_product", insertable=false, updatable=false)
	private int productIdProduct;

	@Column(name="user_id_user", insertable=false, updatable=false)
	private int userIdUser;

	public CartPK() {
	}
	public int getProductIdProduct() {
		return this.productIdProduct;
	}
	public void setProductIdProduct(int productIdProduct) {
		this.productIdProduct = productIdProduct;
	}
	public int getUserIdUser() {
		return this.userIdUser;
	}
	public void setUserIdUser(int userIdUser) {
		this.userIdUser = userIdUser;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CartPK)) {
			return false;
		}
		CartPK castOther = (CartPK)other;
		return 
			(this.productIdProduct == castOther.productIdProduct)
			&& (this.userIdUser == castOther.userIdUser);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productIdProduct;
		hash = hash * prime + this.userIdUser;
		
		return hash;
	}
}