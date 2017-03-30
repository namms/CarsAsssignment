package secondH;

import interfaced.Civic;
import interfaced.CivicHbd;

public class Car {
	public static int add(String s1, String s2){
        int x=s1.length()-1;
        int a=0;
        for(char c: s1.toCharArray()){
            a+=Math.pow(10,x)*Character.getNumericValue(c);
            if(x>=0)
                --x;
        }

        x=s2.length()-1;
        int b=0;
        for(char c: s2.toCharArray()){
            b+=Math.pow(10,x)*Character.getNumericValue(c);
            if(x>0)
                --x;
        }

        
        return a+b;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Civic a=new Civic(2017,4);
		CivicHbd b =new CivicHbd(2017,4);
		
		System.out.print(a);
		a.printSpec();
		
		System.out.println();
		System.out.println();
		
		System.out.print(b);
		b.printSpec();
		
		System.out.println("\nAddition of two string"+" "+ " 567+433");
		System.out.println(add("567","433"));
	}

}
