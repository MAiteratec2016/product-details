package product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProductDetails {

	@Id
	@NotNull
	private long productNumber;

	private String name;
	private String description;

	protected ProductDetails() {
	}

	public ProductDetails(long productNumber, String name, String description) {
		this.productNumber = productNumber;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("Customer [productNumber=%d, name='%s', description='%s']", productNumber, name,
				description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
}
