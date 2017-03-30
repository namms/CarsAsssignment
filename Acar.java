package interfaced;

public abstract class Acar implements movable {
	protected String maintSchedul;
	protected double emmisRate;
	private double price;
	
	
	public Acar(String maintSchedul, double emmisRate, double price) {
		super();
		this.maintSchedul = maintSchedul;
		this.emmisRate = emmisRate;
		this.price = price;
	}


	public String getMaintSchedul() {
		return maintSchedul;
	}


	public void setMaintSchedul(String maintSchedul) {
		this.maintSchedul = maintSchedul;
	}


	public double getEmmisRate() {
		return emmisRate;
	}


	public void setEmmisRate(double emmisRate) {
		this.emmisRate = emmisRate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public abstract void printSpec();

}
