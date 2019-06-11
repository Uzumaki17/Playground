import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,m,a=0,x;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    m=n;
    while(n>0){
    x=n%10;
    a=a*10+x;
    n=n/10;
    }
    System.out.println(""+a);
  }
  
}