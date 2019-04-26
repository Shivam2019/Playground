import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
    int N=in.nextInt();
      int N2=in.nextInt();
      int N3=in.nextInt();
    if(N>N2&N>N3)
        System.out.println(N);
   else if(N2>N&N2>N3)
      System.out.println(N2);
      else
        System.out.println(N3);
   }
}
