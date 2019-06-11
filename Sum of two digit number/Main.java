import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n,sum;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      for(sum=0;n!=0;n/=10){
        sum+=n%10;
	}
     
      System.out.println(""+sum);
}
  
}