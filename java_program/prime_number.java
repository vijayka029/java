package interview;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=33;
   boolean flag=false;
   
   for(int i=2;i<=n/2;++i) {
	    if(n%i==0) {
	    	flag=true;
	    	break;}
	    }
	    if(!flag) {
	    	System.out.println("prime number");
	    }else {
	    	System.out.println("non prime number");
	    }
   }
	}


