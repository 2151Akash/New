package practice;

public class Class1 {
	public static void main(String[] args) {
	
		int num=0;
		for(int b=2;b<=30;b++) {
		for(int a=2;a<=b-1;a++) {
			
			if(b%a==0) 
			{
				num=num+1;
				
			}
		}
		
		if(num==0) {
			System.out.println("number is prime"+b);
		}
		else {
			//System.out.println("number is not prime");
			num=0;
		}
	}}

}
