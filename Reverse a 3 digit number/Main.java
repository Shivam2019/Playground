import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
		int n,n1,n2,n3,sum;
      n=in.nextInt();
      n1=(n%10)*100;
      n2=((n/10)%10)*10;
      n3=(n/100);
    sum=n1+n2+n3;
      System.out.println(sum);
  }
}