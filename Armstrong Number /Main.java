import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num, number, temp, total = 0;
      num=in.nextInt();

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}