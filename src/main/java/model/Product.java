package model;

public class Product {
	private int id;
	private String district;
	private String city;
	private String country;
	private double stars;
	
	public Product(int id, String district, String city, String country, double stars) {
		this.id = id;
		this.district = district;
		this.city = city;
		this.country = country;
		this.stars = stars;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	
}
