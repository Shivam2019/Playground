import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
		int n,n1,n2,sum;
      n=in.nextInt();
      n1=n/100;
      n2=n%10;
      sum=n1+n2;
      System.out.println(sum);
	}
}