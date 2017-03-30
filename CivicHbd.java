package interfaced;

public class CivicHbd extends Acar {
	
	
	
	

	static String name="Civic hybrid";
	private	int model;
	private	int seat;
	double fuel=1000.0,battery=12.0;
	boolean isStart=false;
	private static String maintSchedul="09/19/2019";
	


public CivicHbd(int model, int seat) {
		super(name,123.0,2700.0);
		
	setModel( model);
	setSeat(seat);
	
	}

public int getModel(){
	
	return this.model;
}
public int getSeat(){
	
	return this.seat;
}


private void setModel(int model){
	this.model=model;	
}

private void setSeat(int seat){
	this.seat=seat;
	
}

public void start(){
	if(fuel>0&&battery>0){
		System.out.println(this.getModel()+" Started");
		this.isStart=true;
	}else{
		System.out.println("there is no enough fuel in your car");
		
	}
	
	
}
public void run(){
	if(this.isStart){
		
		System.out.println(this.getModel()+"is accelerating");
	}else{
		
		System.out.println("start engine first");
	}
	
}

protected String softwopakage(){
	
	return "version 1.9";
}


public String toString(){
	
	
	
	return name+ "\tModel: "+getModel()+"\tSeats: "+getSeat()+"\n\nSpecifications: ";
	
}
	
	public  void printSpec(){
		
	String s="\nEmmission Rate: "+getEmmisRate()+"\tPrice "+getPrice()+"\tMaintenance schedule: "
	+maintSchedul;
	System.out.println(s);
	}
}
