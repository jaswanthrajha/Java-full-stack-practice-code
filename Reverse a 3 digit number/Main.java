import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner in  = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = n1/100;//first
    int n3 = n1%10;//last
    int n5= n1/10;
    int n4 = n5%10;//sec
   String s = n3 + "" + n4 + "" + n2;
    System.out.println(s);
  }
}