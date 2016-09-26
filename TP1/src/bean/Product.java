/**
 * 
 */
package bean;

import java.util.Date;

/**
 * @author Cyril
 *
 */
public class Product {
	protected String id;
	protected String name; 
	protected Price price; 
	protected String description; 
	protected String image;
	protected Date disponibilityDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDisponibilityDate() {
		return disponibilityDate;
	}

	public void setDisponibilityDate(Date date) {
		this.disponibilityDate = date;
	}
}
