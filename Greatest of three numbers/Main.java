import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n,m,p;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      m=in.nextInt();
      p=in.nextInt();
      if(n>m && n>p)
        System.out.println(""+n);
      else if(m>n && m>p)
        System.out.println(""+m);
      else 
        System.out.println(""+p);
    }
}