package interfaced;

public class Civic  extends Acar{
	
	

	static String name="Civic";
	private	int model;
	private	int seat;
	double fuel=1000.0,battery=12.0;
	boolean isStart=false;
	private static String maintSchedul="05/20/2017";
	


public Civic(int model, int seat) {
		super(name,139.0,2000.0);
		
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
	
	
	//s="\nName : "+getName()+"\n"+"Model: "+getModel()+"\n"+"Seats: "+getSeat();
	return name+ "\tModel: "+getModel()+"\tSeats: "+getSeat()+"\n\nSpecifications: ";
	
}
	
	public  void printSpec(){
		//System.out.println();
	String s="\nEmmission Rate: "+getEmmisRate()+"\tPrice "+getPrice()+"\tMaintenance schedule: "
	+maintSchedul;
	System.out.println(s);
	}
}
