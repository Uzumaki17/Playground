import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n,fd;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      fd=n;
      while(fd>=10){
      fd=fd/10;
     
      }
	System.out.println(""+fd);
    }
}